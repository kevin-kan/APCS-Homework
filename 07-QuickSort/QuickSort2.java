import java.io.*;
import java.util.*;

//This code belongs to Chris Kim. I understand this concept a little better after reading through this code.

public class QuickSort2{
    public void quickSort(int[] a, int L, int R) {
	if (a.length > 1) {
	    int p = (int) ((Math.random() * (r-l + 1)) + L);
	    int val = a[p];
	    a[p] = a[r];
	    a[r] = val;
	    int wall = L;
	    int z;
	    for (int i =L; i < R; i++) {
		if ( a[i] < val ) {
		    z = a[wall];
		    a[wall] = a[i];
		    a[i] = z;
		    wall++;
		}
	    }
	    a[r] = a[wall];
	    a[wall] = val;
	    if (wall - 1 > L) 
		quickSort(a,L, wall - 1);
	    if (wall + 1 < R) 
		quickSort(a, wall + 1, R);
	}
    }

    public void qsort(int[] a ) {
	quickSort(a, 0, a.length-1);
    }
}
