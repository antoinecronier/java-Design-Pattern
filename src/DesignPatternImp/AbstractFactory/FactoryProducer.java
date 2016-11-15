package DesignPatternImp.AbstractFactory;

public class FactoryProducer {

	public static final int SWING = 1;
	public static final int AWT = 2;
	public static AbstractFactory getFactory(int choice) {
		switch (choice) {
		case 1:
			return new SwingFactory();
		case 2:
			return null;
		default:
			throw new RuntimeException("No valid selected item, use FactoryProducer.SWING or other constants");
		}
	}
}
