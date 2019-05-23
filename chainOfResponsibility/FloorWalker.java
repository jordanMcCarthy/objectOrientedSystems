package chainOfResponsibility;

import java.util.Random;

public class FloorWalker extends VerizonBillingEmployee {
	Random rand = new Random();
	int moneyAvailable = rand.nextInt(250);

	public FloorWalker(VerizonBillingEmployee superior) {
		super(superior);
	}

	@Override
	public void assistCustomer(AngryCustomer angryCustomer) {
		if (angryCustomer.getRageLevel() <= 7) {
			System.out.println("Floor Walker handled " + angryCustomer.getName());
		} else if (angryCustomer.getCompensationDemanded() < moneyAvailable) {
			System.out.println("Floor Walker was able to compensate customer enough to not escalate");
			moneyAvailable = moneyAvailable - angryCustomer.getCompensationDemanded();
		} else {
			angryCustomer.setCompensationDemanded(angryCustomer.getCompensationDemanded() - moneyAvailable);
			moneyAvailable = 0;

			System.out.println("Floor Walker unable handle, issue escalated to Supervisor");
			System.out.println(
					angryCustomer.getName() + " wants the remaining $" + angryCustomer.getCompensationDemanded());
			superior.assistCustomer(angryCustomer);

		}
	}

}
