package entities;

public class Employee {
	private String name;
	private Double hours;
	private Double valuePerHour;
	public Employee()
	{
		
	}
	public Employee(String name, Double hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getHours() {
		return hours;
	}
	public void setHours(Double hours) {
		this.hours = hours;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double payment()
	{
		return hours * valuePerHour;
	}
	public String toString()
	{
		return this.name + "-" + "$" + payment();
	}
}
