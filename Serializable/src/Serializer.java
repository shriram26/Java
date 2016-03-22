import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Serializer {
	
	public static void serialize(Car aliasCar)
	{
		Car car = aliasCar;
		try {
			FileOutputStream fileOutput = new FileOutputStream("C:\\serializedCar.txt");//file creation and ready to write the object into file
			ObjectOutputStream out = new ObjectOutputStream(fileOutput);//
			out.writeObject(car);//object handler that writes the object into file
			out.close();
			fileOutput.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
