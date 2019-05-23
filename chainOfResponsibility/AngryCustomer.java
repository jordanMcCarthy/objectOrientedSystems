package chainOfResponsibility;

import java.util.Random;

public class AngryCustomer {

	Random rand = new Random();
	private int rageLevel = rand.nextInt(11);
	private int compensationDemanded = rand.nextInt(500);
	private String name;

	public AngryCustomer(String name) {
		this.setName(name);
		System.out.println(name + " has a rage level of " + getRageLevel() + " and would like to be compensated $"
				+ getCompensationDemanded());
	}

	public int getRageLevel() {
		return rageLevel;
	}

	public void setRageLevel(int rageLevel) {
		this.rageLevel = rageLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCompensationDemanded() {
		return compensationDemanded;
	}

	public void setCompensationDemanded(int compensationDemanded) {
		this.compensationDemanded = compensationDemanded;
	}

}
