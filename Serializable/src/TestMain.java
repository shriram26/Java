
public class TestMain {

	public static void main(String[] args) {
		
		Car car = new Car("Infinity","Metallic Silver",8888,50);
		Serializer.serialize(car);
		Deserializer.deSerialize();

	}

}
