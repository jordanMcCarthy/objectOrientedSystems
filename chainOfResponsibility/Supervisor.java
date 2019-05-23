package chainOfResponsibility;

import java.util.Random;

public class Supervisor extends VerizonBillingEmployee {
	Random rand = new Random();
	int moneyAvailable = rand.nextInt(1000);

	public Supervisor(VerizonBillingEmployee superior) {
		super(superior);
	}

	@Override
	public void assistCustomer(AngryCustomer angryCustomer) {
		if (angryCustomer.getRageLevel() <= 9) {
			System.out.println("Supervisor handled " + angryCustomer.getName());
		} else if (angryCustomer.getCompensationDemanded() < moneyAvailable) {
			System.out.println("Supervisor was able to compensate customer enough to not escalate");
			moneyAvailable = moneyAvailable - angryCustomer.getCompensationDemanded();
		} else {
			System.out.println("Supervisor unable to handle!");
			System.out.println(angryCustomer.getName() + " will be taking this to corporate");
		}

	}

}
