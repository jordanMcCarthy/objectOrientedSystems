package chainOfResponsibility;

import java.util.Random;

public class Grunt extends VerizonBillingEmployee {
	Random rand = new Random();
	int moneyAvailable = rand.nextInt(100);

	public Grunt(VerizonBillingEmployee superior) {
		super(superior);

	}

	@Override
	public void assistCustomer(AngryCustomer angryCustomer) {
		if (angryCustomer.getRageLevel() <= 5) {
			System.out.println("Grunt handled " + angryCustomer.getName());
		} else if (angryCustomer.getCompensationDemanded() < moneyAvailable) {
			System.out.println("Grunt was able to compensate customer enough to not escalate");
			moneyAvailable = moneyAvailable - angryCustomer.getCompensationDemanded();
		} else {
			angryCustomer.setCompensationDemanded(angryCustomer.getCompensationDemanded() - moneyAvailable);
			moneyAvailable = 0;
			System.out.println("Grunt unable to handle, issue escalated to Floor Walker");
			System.out.println(
					angryCustomer.getName() + " wants the remaining $" + angryCustomer.getCompensationDemanded());

			superior.assistCustomer(angryCustomer);
		}
	}

}
