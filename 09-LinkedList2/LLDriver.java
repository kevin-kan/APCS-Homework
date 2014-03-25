public class LLDriver{
    public static void main(String[] args){
	MyLinkedList L = new MyLinkedList();
	L.add("Sully");
	L.add("Mike");
	L.add("");
	L.add("Mike");
	L.addEnd("Emma");
	L.remove(1);
	System.out.println(L.find("Sully"));
	System.out.println(L.length());
	System.out.println(L);

    }

}