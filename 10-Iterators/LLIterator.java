public class LLIterator<E> implements Iterator{

    public boolean hasNext(){
	if(next() != null){
	    return true;
	}else{
	    return false;
	}
    }

    public E next(){

    }

    public void remove(){
    }
}