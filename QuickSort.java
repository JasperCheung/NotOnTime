/*****************************************************
Jasper Cheung
APCS1 pd 5
HW #15: SoSo Quick
2017-03-08
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 * 1. Summary of QuickSort algorithm:
 * pick a pivot point, partition around it. Now two sides. In each of the two sides pick a pivot and  partition. When you get small enough subsections they will be sorted  
 * QSort(arr): O(nlogn)
 * your running n algo(partition) logn times(separate)
 * 2a. Worst pivot choice / array state and associated runtime: 
 *  If the pivot is the right/leftmost side everytime O(n^2), in my case if the data is sorted
 * 2b. Best pivot choice / array state and associated runtime:
 *  The pivot you pick is the the median everytime. O(nlogn)
 * 3. Approach to handling duplicate values in array:
 *  It doesn't really matter, dulicates will still be either the smallest to the right of the largest to the left
 *****************************************************/
public class QuickSort 
{
    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d ) 
    {
	qsort(d, 0, d.length -1);
    }
    public static void qsort( int[] d, int left,int right){
	//once the subsection gets too tiny stop it it's already sorted
	if(left >  right){
	    return;}
	//pivot is the 4th paramenter, always the left
	int wya = party(d, left, right, left);
	//if its at the edges
	if( wya + 1 == left){
	     qsort(d, wya + 1, right);
	}
	else if( wya + 1 == right){
	     qsort(d, left, wya -1);}
	//else its gonna be in the middle so two areas
	else{
	    qsort(d, left, wya -1);
	     qsort(d, wya + 1, right);
	}
    }
    //  helper methods here.
    public static int party( int arr[], int left, int right, int pivot)
    {
	int v = arr[pivot];
	swap( pivot, right, arr);
	int s = left;

	for( int i = left; i < right; i++ ) {
	    if ( arr[i] <= v) {
		swap( i, s, arr );
		s++;}
	}
	swap(s,right,arr);

	return s;
    }
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }
    //--------------^  HELPER METHODS  ^--------------
    //main method for testing
    public static void main( String[] args ) 
    {
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);

	qsort( arr1 );	
       	System.out.println("arr1 after qsort: " );
	printArr(arr1);

	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);

       	shuffle(arrN);
       	System.out.println("arrN post-shuffle: " );
	printArr(arrN);

	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);
	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);

	qsort( arr2 );	
       	System.out.println("arr2 after qsort: " );
	printArr(arr2);
	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);
       	shuffle(arrMatey);
       	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);
	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);

    }//end main

}//end class QuickSort
