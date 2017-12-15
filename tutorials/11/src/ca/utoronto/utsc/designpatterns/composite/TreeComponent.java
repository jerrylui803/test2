package ca.utoronto.utsc.designpatterns.composite;

import java.util.ArrayList;

public interface TreeComponent<T> {
	public Integer getSize();
	public Integer getHeight();
	public ArrayList<T> flatten();
	
	
}
