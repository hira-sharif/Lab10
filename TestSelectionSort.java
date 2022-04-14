/* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public TestSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        /** add tests to check for this unit test **/

        assertTrue("Sorted minimum value is 2", arr[0] == Sortedarr[0]);
        assertTrue("Sorted maximum value is 10", arr[4] == Sortedarr[4]);
    }

    public void testNegative(){

        int[] arr = new int[5];
        arr[0] = -13;
        arr[1] = -1;
        arr[2] = -5;
        arr[3] = -2;
        arr[4] = -8;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -13;
        Sortedarr[1] = -8;
        Sortedarr[2] = -5;
        Sortedarr[3] = -2;
        Sortedarr[4] = -1;

        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        /** Test data contains negative values only **/

        assertTrue("Sorted minimum valueis -13", arr[0] == Sortedarr[0]);
        assertTrue("Sorted maximum value is -1", arr[4] == Sortedarr[4]);
    }

    public void testMixed(){

    	int[] arr = new int[5];
        arr[0] = -1;
        arr[1] = 4;
        arr[2] = 10;
        arr[3] = -3;
        arr[4] = 0;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -3;
        Sortedarr[1] = -1;
        Sortedarr[2] = 0;
        Sortedarr[3] = 4;
        Sortedarr[4] = 10;

        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        /** Test data contains with both positive, negative and zeros **/

        assertTrue("Sorted minimum valueis -3", arr[0] == Sortedarr[0]);
        assertTrue("Sorted maximum value is 10", arr[4] == Sortedarr[4]);
    }

    public void testDuplicates(){

    	int[] arr = new int[5];
        arr[0] = -3;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 10;
        arr[4] = -3;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -3;
        Sortedarr[1] = -3;
        Sortedarr[2] = 1;
        Sortedarr[3] = 1;
        Sortedarr[4] = 10;

        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        /** Test data contains duplicates **/

    	assertTrue("Sorted minimum valueis -3", arr[0] == Sortedarr[0]);
        assertTrue("Sorted maximum value is 10", arr[4] == Sortedarr[4]);
    }


}
