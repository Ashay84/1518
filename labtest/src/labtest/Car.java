package labtest;

public class Car {

	String name;
	Integer capacity;
	Integer fuelcap;

	public Car(String name,Integer capacity,Integer fuelcap)
	{
		this.name=name;
		this.capacity=capacity;
		this.fuelcap=fuelcap;
	}

	public Integer getCapacity() {
		return capacity;
	}
	
	public void lowerfuel(Integer fuel)
	{
		this.fuelcap=fuel-fuelcap;
		
	}
}


