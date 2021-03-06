package dp;

import java.util.Scanner;

public class paint_house {

	  public static void main(String[] args) {
  	  	  // TODO Auto-generated method stub
          Scanner scn= new Scanner(System.in);
          int n=scn.nextInt();
          int[][] costs= new int[n][3];
          for(int i=0;i<n;i++){
              for(int j=0;j<3;j++){
                  costs[i][j]=scn.nextInt();
              }
          }
           System.out.println(minCost(costs));
      
  	  }
  	  // -----------------------------------------------------
  	  // This is a functional problem. Only this function has to be written.
  	  // This function takes as input 2D array
  	  // It should return the required output
  
  	  private static int  minCost(int[][] costs) {
		// TODO Auto-generated method stub
  		 

  		  for(int i=1;i<costs.length;i++)
  		  {
  			  for(int j = 0;j<3;j++)
  			  {
  				  costs[i][j] = costs[i][j] + Math.min(costs[i-1][((j-1)%3+3)%3], costs[i-1][(j+1)%3]);
  			  }
  		  }
  		  int min = Integer.MAX_VALUE;
  		for(int i=0;i<3;i++)
			  min = Integer.min(min,costs[costs.length-1][i]);
		return min;
	}

	public static int CountWays(int n, int k) {
	 	 //Write your code here
		 int same = 0,diff = k;
		 for (int i = 0; i < n-1; i++) {
			int temp = diff;
			 diff = (diff+same)*(k-1);
			 same = temp;
			 //System.out.println(diff+" "+same);
		}
		 return same+diff;
	 }
}
