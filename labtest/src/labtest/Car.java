package labtest;

public class Car {

	String name;
	int capacity;
	int fuelcap;

	public Car(String name,int capacity,int fuelcap)
	{
		this.name=name;
		this.capacity=capacity;
		this.fuelcap=fuelcap;
	}

	public int getCapacity() {
		return capacity;
	}
	
	public void lowerfuel(int fuel){
	
		fuelcap-=fuel;
		
	}

	public int getFuelcap() {
		return fuelcap;
	}
}


