package ca.utoronto.utsc.designpatterns.observer;

import java.util.ArrayList;

public class Observable implements Observer{
	private ArrayList<Observer> observers;
	
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
	public boolean setChanged() {
		return true;
	}
	@Override
	public void notifyObservers(Observable ob) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	//public void notify() {
		
	//}
	
	
}
