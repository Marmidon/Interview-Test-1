

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {


	private static final int[] DATA = { 50, 25, 30 };
    public static void main(String[] args){
    	//Test here
    	myPair[] myPairsArray = {new myPair("item1",20),new myPair("item2",201),new myPair("item3",50)};
    	String[] result=algorithm(myPairsArray, 100);
    	// Show result
    	for (int i=0;i<result.length;i++) {
        	System.out.println(result[i]);
    	}
    	int arr[] = {1, 2, 3, 4, 5};
        int r = 3;
        int n = arr.length;
        //printCombination(arr, n, r);
        

                GetAllSubsetByStack get = new GetAllSubsetByStack();
                get.populateSubset(DATA, 0, DATA.length);
            
    }
    
    public static String[] algorithm (myPair[] item_price, int total_price) {
    	String[] result={};     
    	/*for (int i = 0; i < item_price.length; i++) {
            item_price[i].print();
        }
    	 */
        int Sum = 0;
        boolean bool;
        for (int i = 0; i < item_price.length; i++) {
        	
        	
            bool = false;
            if (item_price[i].get_value() <=total_price) {
                Sum = item_price[i].get_value();
                //arr.add(item_price[i]);
                //arrOfArr.add(arr);
                bool = true;
            }
            if( bool == true){
                for (int j = i+1; j < item_price.length ; j++) {
                    
                	
                	
                	/*
                	 * 
1 
2
3

1 2
1 3
2 3



1 2 3
1 2 4
1 2 5
1 3 4
1 3 5
1 4 5
2 3 4
2 3 5
2 4 5
3 4 5
                    1 1+2 1+2+3 1+2+3+4 1+2+3+4+5
                                1+2+3+5
                          1+2+4 1+2+4+5
                          1+2+5
                      1+3 1+3+4 1+3+4+5
                          1+3+5
                      1+4 1+4+5
                      1+5
                    2 2+3 2+3+4 2+3+4+5
                    
                    
                    
                    
                     1 2 
                     */
                }
            }

        }
        return result;
    }
    public static void rec(myPair arr,String data[], int start, int end, int index, int count, int total_price){
	
    	for (int i = start; i <= end; i++) {
			/*if(total_price>=) {
				
			}*/
		}
    	
    }
    /* arr[]  ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Staring and Ending indexes in arr[]
    index  ---> Current index in data[]
    r ---> Size of a combination to be printed */
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }
 
        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }
 
    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];
 
        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }
}
