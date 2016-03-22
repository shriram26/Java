import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Deserializer {

	public static void deSerialize(){
		Car car = null;
		try {
			FileInputStream fileInput = new FileInputStream("C:\\serializedCar.txt");
			ObjectInputStream in = new ObjectInputStream(fileInput);
			car = (Car) in.readObject();//you are reading the file and converting it into object
			in.close();
			fileInput.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Deserialized Object");
		System.out.println("Car Name = "+ car.getCarName());
		System.out.println("Car Name = "+ car.getColor());
		System.out.println("Car Name = "+ car.getCarNumber());
		System.out.println("Car Name = "+ car.getModelNumber());
	}
	
}
