package chainOfResponsibility;

public abstract class VerizonBillingEmployee {
	
	protected VerizonBillingEmployee superior = null;

	public VerizonBillingEmployee(VerizonBillingEmployee superior) {
		super();
		this.superior = superior;
	}
	
	public abstract void assistCustomer(AngryCustomer angryCustomer);


}
