package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String changeling;
	
	public String getChangeling() {
		return changeling;
	}
	
	public void setChangeling(String changeling) {
		this.changeling = changeling;
		notifyAllObservers();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}

	private void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
