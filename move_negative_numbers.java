/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    int n = 0;
	    int[] a;
	    a = new int[10];
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    int max = 0;
	    int min = 1000;
	    for(int i = 0; i<n; i++){
	        a[i] = sc.nextInt();
	    }
        int left = 0;
        int right = n -1;
        while(left <= right){
            if (a[right] < 0 && a[left]<0) {
                left++;
            } else if (a[right] < 0 && a[left]>0) {
                int temp = a[right];
                a[right] = a[left];
                a[left] = temp;
                left++;
                right--;
            } else if(a[right] > 0 && a[left] > 0){
                right--;
            } else{
                left++;
                right--;
            }
        }
        
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        
	}
}
