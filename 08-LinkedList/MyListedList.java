public class MyLinkedList{
    private Node head;
    /*@@@@@@@@@@@@@@@
      HOW DO YOU
      REFERENCE A NODE 
      BY ITS STRING EASILY?
    @@@@@@@@@@@@@@@*/   
    public MyLinkedList(){
	head = null;
    }
    
    public String toString(){
	Node temp = head;
	String s = "";
	while (temp != null){
	    s = s + temp.toString();
	    temp = temp.getNext();
	}
	return s;
    }

    public void add(String s){
	Node temp = new Node(s);
	//head = temp;
	temp.setNext(head);
	head = temp;
    }
       
    public void add(int i, String s){
	Node temp = new Node(s);
	temp.setNext(get(i+1));
	get(i-1).setNext(temp);
    }
    
    public String get(int i){
	Node temp = head;
	for (int j = 0; j< length();j++){
	    if (temp == i)
		return j;
	    temp = temp.getNext();
	}
    }

    public String set(int i, String s){
	add(i, s);
	remove(i+1);
    }

    public String remove(int i){
	get(i - 1).setNext(get(i + 1));
	get(i).setNext(null);
	return get(i);
    }
    public int find (String s){
	Node temp = head;
	int count = 0;
	while (temp != null){
	    if (temp.toString() == s)
		return count;
	    count = count +1;
	}
	return -1;
    }
    public int length(){
	Node temp = head;
	int count = 0;
	while (temp != null){
	    count = count + 1;
	    temp = temp.getNext();
	}
	return count;
    }

    
}
