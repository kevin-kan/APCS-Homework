import java.io.*;
import java.util.*;

public class QuickSort2{
    Random r = new Random();
    public int partition(int[] a, int L, int R){
	int pivot = a[r.nextInt(R-L)+L];
	int right = a[R];
	for (int i = 0; i < a.length; i++){
	    if (a[i] == pivot)
		a[i] = right;
	    if (i == a.length-1)
		a[i] = pivot;
	}
	
    }
}