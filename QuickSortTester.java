//Team NotOnTime: Jasper Cheung, Dimitriy Leksanov
//APCS2 pd1
//LAB01 -- What Does the Data Say?
//2017-03-09
/*
n = 10 Time: 8452.0 ns
n = 25 Time:  41657.0 ns
n = 50 Time: 68824.0 ns
n = 75 Time: 156062.0 ns
n = 1000 Time : 2388320.0 ns
n = 5000 Time: 7858635.0 ns
n = 10,000 Time: 1.5483932E7 ns
n = 10, ordered:
n = 10, opposite order:
n = 10, highest at the ends:
n = 10, highest at the center:

We calculate the runtime it takes for a QuickSort to run on different arrays

 */
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
	
	int[] arr1000 = new int[1000];
	start = System.nanoTime();
	QuickSort.qsort(arr1000);
	stop = System.nanoTime();
	System.out.print("Time: ");
	System.out.println(stop - start);
	int[] arr5000 = new int[5000];
	start = System.nanoTime();
	QuickSort.qsort(arr5000);
	stop = System.nanoTime();
	System.out.print("Time: ");
	System.out.println(stop - start);
	
	int[] arr10000 = new int[10000];
	start = System.nanoTime();
	QuickSort.qsort(arr10000);
	stop = System.nanoTime();
	System.out.print("Time: ");
	System.out.println(stop - start);

	/*
	  data can be gathered from terminal prints
	 */

        int[] best10 = {6, 13, 17, 22, 33, 34, 54, 55, 75, 83};
        start = System.nanoTime();
        QuickSort.qsort(best10);
        stop = System.nanoTime();
        System.out.print("Time: ");
        System.out.println(stop - start);
	    
        int[] backwards10 = {83, 75, 55, 54, 34, 33, 22, 17, 13, 6};
        start = System.nanoTime();
        QuickSort.qsort(backwards10);
        stop = System.nanoTime();
        System.out.print("Time: ");
        System.out.println(stop - start);

        //higher values to the outside                                          
        int[] outside = {83, 55, 34, 22, 13, 6, 17, 33, 54, 75};
        start = System.nanoTime();
        QuickSort.qsort(outside);
        stop = System.nanoTime();
        System.out.print("Time: ");
        System.out.println(stop - start);

        //higher values to the interior                                         
        int[] inside = {6, 17, 33, 54, 75, 83, 55, 34, 22, 13};
        start = System.nanoTime();
        QuickSort.qsort(inside);
        stop = System.nanoTime();
        System.out.print("Time: ");
        System.out.println(stop - start);

    }

}
