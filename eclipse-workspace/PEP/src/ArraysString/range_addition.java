package ArraysString;

import java.util.Scanner;

public class range_addition {

	 public static int[] getModifiedArray(int length, int[][] updates) {
         // write your code here. 
         int zeros[] = new int[length];
//         for(int i:zeros)
//        	 System.out.println(i);
         for(int i = 0;i<updates.length;i++)
         {
        	 
        	
        	 if(updates[i][0]<length)
        	 zeros[updates[i][0]] +=updates[i][2];
        	 if((updates[i][1]+1)<length)
        	 {zeros[(updates[i][1]+1)] -=updates[i][2];}
        	 
         }
//         for(int i:zeros)
//        	 System.out.println(i);
         int sum=0;
         for(int i = 0;i<length;i++)
         {
        	 sum +=zeros[i];
        	 zeros[i] = sum;
         }
		 return zeros;
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Input for length of first array.
         int length = sc.nextInt();
 
         int K = sc.nextInt();
 
         int[][] updates = new int[K][3];
 
         for (int i = 0; i < updates.length; i++) {
             for (int j = 0; j < updates[0].length; j++) {
                 updates[i][j] = sc.nextInt();
             }
         }
 
         int[] result = getModifiedArray(length, updates);
         display(result);
     }
 
     // function to display an array.
     public static void display(int[] arr) {
 
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
 
         System.out.println();
     }
 
}
