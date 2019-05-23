package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {

		// hiearchy of chain of responsibility established
		VerizonBillingEmployee team = new Grunt(new FloorWalker(new Supervisor(null)));

		// customer created with name Bill and random rage levels/money demanded
		AngryCustomer bill = new AngryCustomer("Bill");
		team.assistCustomer(bill);

		System.out.println();
		AngryCustomer kevin = new AngryCustomer("Kevin");
		team.assistCustomer(kevin);

		// difficult customer created so we are guaranteed to see chain of
		// responsibility in action
		System.out.println();
		AngryCustomer karen = new AngryCustomer("Karen");
		if (karen.getRageLevel() < 9 || karen.getCompensationDemanded() < 1000) {
			karen.setRageLevel(9);
			karen.setCompensationDemanded(1000);
			System.out.println(karen.getName() + " loses temper and is now at a rage level of " + karen.getRageLevel()
					+ " and demands $" + karen.getCompensationDemanded());
		}
		team.assistCustomer(karen);

	}

}
