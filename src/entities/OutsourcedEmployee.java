package entities;

public class OutsourcedEmployee extends Employee{
	private Double additionalCharge;

	public OutsourcedEmployee(String name, Double hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	@Override
	public final Double payment()
	{
		return super.payment() + (additionalCharge * 1.1);
	}
	
}
