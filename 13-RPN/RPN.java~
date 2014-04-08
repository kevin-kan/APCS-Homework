import java.io.*;
import java.util.*;

public class RPN {
    public void clear(){
	while(!x.isEmpty()){
	    x.pop();
	}
    }
    public double calculate(String s){
	MyStack m = new MyStack();
	for (int i =0; i < s.length(); i++){
	    if(s.charAt(i) == ' '){
		if (num != ""){
		    double n = Double.parseDouble(num);
		    x.push(n);
		    num ="";
		}
	    }
	    else if (s.charAt(i) == '+'){
		Double q= x.peek();
		x.pop();
		q = q+ x.peek();
		x.pop();
		x.push(q);
	    }
	    else if (s.charAt(i) == '-'){
		Double q= x.peek();
		x.pop();
		q = q-x.peek();
		x.pop();
		x.push(q);
	    }
	    else if (s.charAt(i) == '*'){
		Double q= x.peek();
		x.pop();
		q = q*x.peek();
		x.pop();
		x.push(q);
	    }
	    else if (s.charAt(i) == '/'){
		Double q= x.peek();
		x.pop();
		q = q/x.peek();
		x.pop();
		x.push(q);
	    }
	    else{
		num +=s.charAt(i);
	    }
	}
	double ans= x.peek();
	this.clear();
	return ans;

    }
}
