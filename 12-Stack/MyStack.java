import java.io.*;
import java.util.*;

public class MyStack{
    private Node top;
    private int numElmts = 0;

    public MyStack(){
	top = null;
    }
    public void push(String s){
	Node n = new Node(s);
	n.setNext(top);
	top = n;
	numElmts++;
    }
    public String pop(){
	String ret = top.getData();
	top = top.getNext();
	numElmts--;
	return ret;
    }
    public String peek(){
	return top.getData();
    }
    public boolean isEmpty(){
	return top == null;
    }
    public String toString(){
	String s =  "";
	Node tmp = top;
	while (tmp != null){
	    s = s + tmp.getData() + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }
    public int size(){
	return numElmts;
    }
}
