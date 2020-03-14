package factory;

import interfaces.Car;

public class CarFactory {
	private static String carName;
	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}
	public static Car getCar()throws Exception{
		return (Car)Class.forName("cars."+carName).newInstance();
	}
}
