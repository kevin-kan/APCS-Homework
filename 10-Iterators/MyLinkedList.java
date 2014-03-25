public class MyLinkedList<E>{
    private Node<E> head;
    private Node<E> tail;
    public MyLinkedList(){
	head = null;
	tail = null;
    }
    
    public String toString(){
	Node<E> temp = head;
	String s = "";
	while (temp != null){
	    s = s + temp.toString() + " ";
	    temp = temp.getNext();
	}
	return s;
    }


    public void add(E s){
	Node<E> temp = new Node<E>(s);
	//head = temp;
	temp.setNext(head);
	head = temp;
    }
       
    public void add(int i, E s){
	Node<E> temp = head;
	for (int j = 0; j<i; j++){
	    temp = temp.getNext();
	    if (j == i-1){
		temp.setNext(new Node<E>(s));
	    }
	}
    }
    public void addEnd(E s){
	Node<E> temp = head;
	while (temp.getNext() != null){
	    temp = temp.getNext();
	}
	temp.setNext(new Node<E>(s));
	temp = temp.getNext();
	temp.setNext(tail);	
    }
    
    public E get(int i){
	Node<E> temp = head;
	for (int j = 0; j< i;j++){
	    temp = temp.getNext();
	    if (j+1==i){
		return temp.getData();
	    }
	}
	return temp.getData();
    }

    public E set(int i, E s){
	add(i, s);
	remove(i+1);
	return get(i);
    }

    public E remove(int i){
	Node<E> temp = head;
	int a = 0;
	E s = "";
	while (temp != null){
	    if (a == i-1){
	        s = temp.getNext().getData();
		temp.setNext(temp.getNext().getNext());
	    }
	    a++;
	    temp = temp.getNext();
	}
	return s;
    }

    public int find (E s){
	Node<E> temp = head;
	int count = 0;
	while (temp != null){
	    if (temp.getData() == s)
		return count;
	    count = count +1;
	    temp = temp.getNext();
	}
	return -1;
    }
    public int length(){
	Node<E> temp = head;
	int count = 0;
	while (temp != null){
	    count = count + 1;
	    temp = temp.getNext();
	}
	return count;
    }

    
}
