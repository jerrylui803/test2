package ca.utoronto.utsc.designpatterns.composite;

import java.util.ArrayList;

public class Leaf<T> implements TreeComponent<T>{
	

	@Override
	public Integer getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<T> flatten() {
		// TODO Auto-generated method stub
		return new ArrayList<T>();
	}
	

}
