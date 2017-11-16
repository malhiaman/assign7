import java.io.File;
import java.util.Scanner;

public class Histogram2 {
	 public void displayIntArray(int[] iAr)
	 
	     {
	 
	         for(int index = 0; index < iAr.length; index++) 
	 
	         {
	 
	             System.out.println(iAr[index]);
	 
	         }
	 
	     }
	 
	      
	
	      
	 
	     public int[] readIntArrayFromFile(String fileName) throws Exception
	 
	     {
	 
	         Scanner fileScan  = new Scanner(new File(fileName));
	 
	         int counter = 0;
	 
	         while(fileScan.hasNext())
	 
	         {
	 
	             fileScan.next();
	 
	             counter++;
	 
	              
	 
	         }
	 
	          
	 
	         int[] iArray = new int[counter];
	 
	          
	 
	         Scanner fScan  = new Scanner(new File(fileName));
	 
	         counter = 0;
	 
	         while(fScan.hasNext())
	 
	         {
	
	             iArray[counter] = fScan.nextInt();
	 
	             counter++;
	 
	         }
	 
	          
	 
	         return iArray;
	 
	          
	 
	          
	 
	          
	 
	          
	 
	          
	 
	     }
	 
	  
	
	     public int[] initializeCounterArray(int[] inArray)
	
	     {
	 
	         final int SIZE = 10;
	 
	         final int MIN = 1;
	 
	         final int MAX = 100;
	 
	         int[] counters = new int[SIZE];
	 
	         int n = 0, nextt, ix;
	 
	          
	 
	          
	 
	         while (n < 0);
	 
	         {
	 
	           int[] numbers = new int[n];
	
	         }
	 
	          
	 
	  
	 
	         for (int index = 0; index < inArray.length; index++)
	 
	         {
	 
	             int number = inArray[index];
	 
	             if (number >= MIN && number <= MAX)
	 
	             {
	 
	                 int newIndex = (number - 1) / SIZE;
	 
	                 counters[newIndex]++;
	 
	             }
	 
	  
	 
	         }
	 
	  
	 
	         return counters;
	 
	  
	 
	      
	 
	      
	 
	   // Creates the histogram values
	 
	      
	 
	         String[] stars={};
	 
	                       for (ix = 0; ix < n; ix++)
	 
	                       {
	 
	                         int[] numbers;
							nextt = numbers[ix];
	
	                          
	 
	                         if (nextt<11) stars[0] +="*";
	 
	                         else if (nextt<21) stars[1] +="*";
	
	                         else if (nextt<31) stars[2] +="*";
	 
	                         else if (nextt<41) stars[3] +="*";
	 
	                         else if (nextt<51) stars[4] +="*";
	
	                         else if (nextt<61) stars[5] +="*";
	 
	                         else if (nextt<71) stars[6] +="*";
	 
	                         else if (nextt<81) stars[7] +="*";
	 
	                         else if (nextt<91) stars[8] +="*";
	
	                         else stars[9] +="*";
	 
	                                      
	 
	                       }
	 
	                       for (ix=0;ix<10;ix++)
	 
	                         System.out.println(stars[ix]);
	 
	  
	 
	 }
	 
	 }

