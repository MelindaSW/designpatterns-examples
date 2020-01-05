package factoryprovider;

import abstractclass.AbstractFactory;
import factoryclasses.DeadlyDiseaseFactory;
import factoryclasses.NotSoDeadlyDiseaseFactory;

public class DiseaseFactoryProvider {
	
	public static AbstractFactory getDiseaseFactory(boolean deadly) {
		if (deadly) {
			return new DeadlyDiseaseFactory();
		} else {
			return new NotSoDeadlyDiseaseFactory();
		}
	}
}
