package ca.utoronto.utsc.designpatterns.observer;

import java.util.ArrayList;

public class Observable{
	private static final Observable Object = null; // ????????????
	private ArrayList<Observer> observers;
	private boolean change = false;
	public Observable() {
		this.observers = new ArrayList<Observer>();//creating old non-generic arraylist  
	}
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
	}
	
	
	
	//????????????????????????????????????????????????????????????????/
	public void setChanged() {
		change = true;
	}
	public void notifyObservers(Observable ob) {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); i++) {
			// what is the first parameter?      the second parameter is to pass itself?
			// in this case it doesnt do anything but it could pass the id of the observer
			observers.get(i).update(Object, this);
		}
		
	}

	
	
	
	
	//public void notify() {
		
	//}
	
	
}
