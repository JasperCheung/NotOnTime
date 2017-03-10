import qsort.*;
public class QuickSortTester{
    //used for timing purposes
    public static double start;
    public static double stop;

    //simple array populator
    public static void populate(int[] arr){
	for(int i = 0; i < arr.length; i++){
	    arr[i] = ((int)Math.random()*100);
	}
    }
    public static void main(String[] args){

	int[] arr10 = new int[10];
	QuickSort.qsort(arr10);
	//initial run eliminates the weird delay
	start = System.nanoTime();
	QuickSort.qsort(arr10);
	stop = System.nanoTime();
	System.out.print("Time: ");
	System.out.println(stop - start);

	int[] arr25 = new int[25];
	start = System.nanoTime();
	QuickSort.qsort(arr25);
	stop = System.nanoTime();
	System.out.print("Time: ");
	System.out.println(stop - start);

	int[] arr50 = new int[50];
	start = System.nanoTime();
	QuickSort.qsort(arr50);
	stop = System.nanoTime();
	System.out.print("Time: ");
	System.out.println(stop - start);

	int[] arr75 = new int[75];
	start = System.nanoTime();
	QuickSort.qsort(arr75);
	stop = System.nanoTime();
	System.out.print("Time: ");
	System.out.println(stop - start);

	/*
	  data can be gathered from terminal prints
	 */

	/*
	int[] arr100000 = new int[100000];
	start = System.nanoTime();
	QuickSort.qsort(arr100000);
	stop = System.nanoTime();
	System.out.print("Time: ");
	System.out.println(stop - start);

	int[] arr1000000 = new int[1000000];
	start = System.nanoTime();
	QuickSort.qsort(arr1000000);
	stop = System.nanoTime();
	System.out.print("Time: ");
	System.out.println(stop - start);
	*/

    }

}