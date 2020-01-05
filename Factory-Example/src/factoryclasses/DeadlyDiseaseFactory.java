package factoryclasses;

import abstractclass.AbstractFactory;
import concreteclasses.CommonCold;
import concreteclasses.Ebola;
import concreteclasses.Measels;
import factoryinterface.Disease;

public class DeadlyDiseaseFactory extends AbstractFactory {
	@Override
	public Disease getDisease(String disease) {
		if (disease.equalsIgnoreCase("measels")) {
			return new Measels();
		} else if (disease.equalsIgnoreCase("ebola")) {
			return new Ebola();
		} else {			
			return null;
		}
	}
}
