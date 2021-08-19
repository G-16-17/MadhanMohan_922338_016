package abstractFactoryPattern;

public class CarClient {

	public static void main(String[] args) {
		BuildCarFactory b = new BuildCarFactory();
		System.out.println(b.buildCar(CarType.MICRO, Location.USA));
		System.out.println(b.buildCar(CarType.MINI, Location.INDIA));
		System.out.println(b.buildCar(CarType.LUXURY, Location.DEFAULT));
	}

}
