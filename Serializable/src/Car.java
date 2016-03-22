import java.io.Serializable;


public class Car implements Serializable {
private String carName;
private String color;
private int carNumber;
private transient int modelNumber;//This variable will not be serialized

public Car(String carName,String color,int carNumber,int modelNumber){
	this.carName = carName;
	this.color = color;
	this.carNumber = carNumber;
	this.modelNumber = modelNumber;
	System.out.println("I am the connstructor for the car");
	
}

public String getCarName() {
	return carName;
}

public void setCarName(String carName) {
	this.carName = carName;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getCarNumber() {
	return carNumber;
}

public void setCarNumber(int carnumber) {
	this.carNumber = carnumber;
}
public int getModelNumber() {
	return modelNumber;
}

public void setModelNumber(int modelNumber) {
	this.modelNumber = modelNumber;
}


// 1. If Super class is Serializable:
//In case super class is Serializable than all its subclasses will be serializable by default. 
//No need to implement serializable interface in subclass explicitly.  

// 2. If Super class is not Serializable but subclass is:
//In case super class is not Serializable than to serialize the subclass’s object we must 
//implement serializable interface in subclass explicitly. 
//In this case the superclass must have a no-argument constructor in it. 
//In can have parameterized constructor as well but it should definitely have a constructor with no arguments

// 3. If the superclass is serializable but we don’t want the subclass to be serialized.
//To prevent subclass from being serialized we must implement writeObject() and readObject()
//method in the sub class and need to throw NotSerializableException from these methods. 


}
