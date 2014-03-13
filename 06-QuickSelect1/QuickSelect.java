import java.io.*;
import java.util.*;

public class QuickSelect{
    Random r = new Random();
    public int quickSelect(int[] a, int k, int low, int high) {
	//Still not fully understanding this...
	if (low >= high) {
	    return low;
	}
	else {
	    int p = (low+high)/2;
	    int[] temp = new int[a.length];
	    int i;
	    int c = low;
	    int c2 = high;
	    for (i = low; i < p; i++) {
		if (a[i] < a[p]) {
		    temp[c] = a[i];
		    c++;
		}else {
		    temp[c2] = a[i];
		    c2--;
		}
	    }
	    for (i = p + 1; i <= high; i++) {
		if (a[i] > a[p]) {
		    temp[c2] = a[i];
		    c2--;
		}else {
		    temp[c] = a[i];
		    c += 1;
		}
	    }
	    temp[c2] = a[p];
	    if (c == k) 
		return temp[c];
	    else if (temp[c] > k) 
		high = c;
	    else 
		low = c;
	    return quickSelect(temp, k, low, high);
	}
    }

    /*-------------------------------------*/
    public static void main(String[] args){
	QuickSelect q = new QuickSelect();
	int[] a1 = new int[]{11, 25, 33, 47, 52, 69, 10, 74, 86, 98};
	System.out.println(Arrays.toString(a1);
	System.out.println(q.quickSelect(a1, 0, 0, a1.length - 1));
	System.out.println(q.quickSelect(a1, 1, 0, a1.length - 1));
	System.out.println(q.quickSelect(a1, 2, 0, a1.length - 1));
	System.out.println(q.quickSelect(a1, 3, 0, a1.length - 1));
	System.out.println(q.quickSelect(a1, 4, 0, a1.length - 1));
	System.out.println(q.quickSelect(a1, 5, 0, a1.length - 1));
	System.out.println(q.quickSelect(a1, 6, 0, a1.length - 1));
	System.out.println(q.quickSelect(a1, 7, 0, a1.length - 1));
	System.out.println(q.quickSelect(a1, 8, 0, a1.length - 1));
	System.out.println(q.quickSelect(a1, 9, 0, a1.length - 1));


    }
}
