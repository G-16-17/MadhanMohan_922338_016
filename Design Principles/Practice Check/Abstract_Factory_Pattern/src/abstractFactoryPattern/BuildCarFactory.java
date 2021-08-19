package abstractFactoryPattern;

public class BuildCarFactory {

	public static Car buildCar(CarType carType, Location location) {

		switch (location) {
		case USA:
			return new USACarFactory().buildCar(carType);
		case INDIA:
			return new IndiaCarFactory().buildCar(carType);
		case DEFAULT:
			return new DefaultCarFactory().buildCar(carType);
		}
		return null;
	}

}
