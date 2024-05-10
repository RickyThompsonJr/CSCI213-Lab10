/*
Car.java

Author: Ricky Thompson
Date: 05/10/24

Car.java extends the vehicle class
*/

public class Car extends Vehicle{
	
	public int doors;
	public int passengers;
	
	public Car(String carMake, String carModel, String carPlate, int carDoors, int carPassengers)
	{
		super(carMake, carModel, carPlate);
		this.doors = carDoors;
		this.passengers = carPassengers;
	}
	
	public int getDoors(){
		return this.doors;
	}
	
	public int getPassengers(){
		return this.passengers;
	}
	
	public String toString(){
		String string = String.format("%d-door %s %s with license %s", this.doors);
		return string;
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof Car)){
			return false;
		}
		Car equals = (Car) obj;
		return super.equals(equals) && this.doors == equals.doors && this.passengers == equals.passengers;
	}
	
	public Car copy(){
		int doors = this.getDoors();
		int passengers = this.getPassengers();
		Car copyCar = new Car(super.getMake(), super.getModel(), super.getPlate(), doors, passengers);
		
		return copyCar;
	}
}
