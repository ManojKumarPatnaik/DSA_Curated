import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    int n = 0;
	    int[] arr;
	    arr = new int[10];
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    int max = 0;
	    int min = 1000;
	    for(int i = 0; i<n; i++){
	        arr[i] = sc.nextInt();
	        
	        if (arr[i] < min) {
	            min = arr[i];
	        }
	        
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	    }
	    System.out.println(max);
	    System.out.println(min);
	}
}
