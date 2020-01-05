package factoryclasses;

import abstractclass.AbstractFactory;
import concreteclasses.CommonCold;
import concreteclasses.Fever;
import factoryinterface.Disease;

public class NotSoDeadlyDiseaseFactory extends AbstractFactory {
	@Override
	public Disease getDisease(String disease) {

		if (disease.equalsIgnoreCase("common cold")) {
			return new CommonCold();
		} else if (disease.equalsIgnoreCase("fever")) {
			return new Fever();
		} else {
			return null;			
		}
	}
}
