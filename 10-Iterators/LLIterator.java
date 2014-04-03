public class LLIterator<E> implements Iterator{
    private Node<E> currentNode;
    public boolean hasNext(){
	if(currentNode != null){
	    return true;
	}else{
	    return false;
	}
    }

    public E next(){
	E data = currentNode.getData();
	currentNode = currentNode.getNext();
	
    }

    public void remove(){
	
    }
}
