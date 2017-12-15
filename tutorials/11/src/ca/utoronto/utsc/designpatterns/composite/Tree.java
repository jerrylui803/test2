package ca.utoronto.utsc.designpatterns.composite;

import java.util.ArrayList;

public class Tree<T> implements TreeComponent{ 
    
    private TreeComponent<T> left, right;
    private T root;
    
	public Tree(T value){
            this.root = value; 
            this.left = new Leaf();
            this.right = new Leaf();
	}
    
	public Tree(Tree<T> left, T value){
	        this.left = left;
            this.root = value;
            this.right = new Leaf();
	}
    
	public Tree(T value, Tree<T> right){
	        this.left = new Leaf();
            this.root = value;
            this.right = right;
	}
    
	public Tree(Tree<T> left, T value, Tree<T> right){
	        this.left = left;
            this.root = value;
            this.right = right;
	}
    
    public Integer getSize(){
        Integer size = 1;
        
        size += this.left.getSize();
        
       
        size += this.right.getSize();
        
        return size ;
    }
    
    public Integer getHeight(){
        Integer lleft = -1;
        Integer lright = -1;
        
        lleft = this.left.getHeight();
        
        
        lright = this.right.getHeight();
        
        return Math.max(lleft, lright) + 1;
    }
    
    public ArrayList<T> flatten(){
        ArrayList<T> result = new ArrayList<T>();
        
        result = this.left.flatten();
        
        result.add(this.root);
        
        result.addAll(this.right.flatten());
        
        return result;
    }
}