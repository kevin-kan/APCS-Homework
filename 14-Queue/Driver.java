import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	MyQueue q = new MyQueue();
	q.enqueue("first");
	q.enqueue("second");
	q.enqueue("third");
	q.enqueue("fourth");
	System.out.println(q);
	System.out.println(q.front());
	System.out.println(q.dequeue());
	System.out.println(q);
	System.out.println(q.front());
	System.out.println(q.length());
	System.out.println(q.isEmpty());
    }
}