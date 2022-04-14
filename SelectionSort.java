public class SelectionSort {
	private int temp;
	 /** Creates a new instance of SelectionSort */
public SelectionSort() {
	}
	  
	int[] basicSelectionSort(int x[]) 
	{
	  int min;
	  for (int i = 0; i < x.length-1; i++) 
	  {
		  min = i;
		  for (int j= i+1; j < x.length; j++)
		  {
			  	if (x[j] < x[min]) 
			  	{
			  		min =j;
			  		int temp;
			  		temp = x[min];
			  		x[min]=x[i];
			  		x[i]=temp;
			  	}
		  } // end of inner for loop
	  } // end of outer for loop
	  return x;
	} // end of basicSelectionSort method
}
