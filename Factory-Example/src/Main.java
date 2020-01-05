import abstractclass.AbstractFactory;
import factoryinterface.Disease;
import factoryprovider.DiseaseFactoryProvider;

public class Main {
	public static void main(String[] args) {	
		AbstractFactory diseaseFactory = DiseaseFactoryProvider.getDiseaseFactory(true);
		Disease deadly = diseaseFactory.getDisease("Ebola");
		deadly.infect();
		
		AbstractFactory diseaseFactoryTwo = DiseaseFactoryProvider.getDiseaseFactory(false);
		Disease notDeadly = diseaseFactoryTwo.getDisease("fever");
		notDeadly.infect();	
	}
}
