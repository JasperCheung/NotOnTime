# NotOnTime
### Jasper Cheung, Dimitriy Leksanov

### Algoritim
* Runs the partition method on an array, splitting the array into subarrays on either side of the pivot, and running partition on each of the subarrays. Repeats until you get arrays with one element, at which point the array is sorted.
* The partition method takes an input pivot index(always the left for us), which contains the pivot value. This pivot value is put into its final resting position after partition is called, and the position of the final resting position is returned.

### QuickSort's Big-O

#### Best Case: O(nlogn)
* The best case occurs when the pivot is the median. Since the runtime of partition is O(n) and your spliting the array into two O(logn)
* Splits array into two sides 
* Kinda like binary 

#### AVERAGE CASE: O(nlogn)
* You still spilt the array into two( Ologn), partition = o(n)
* it would still be a n * log though the array wouldn't be perfectly spilt

#### WORST CASE:  O(n * n)
* You keep choosing the maximum or minimum causing you not to spilt the array.
* you just do partition on every single element n * n

### Methodology
* We calculate the runtime it takes for a QuickSort to run on different arrays. n = 10,25,50,75,1000,5000, 10,000

### Time Measurements and Analysis
* PLS DO

### Pivot Selection and Data Arrangement's Affect on Execution Time
* when pivots are the median, quicksort runs the fastest
* when pivots are nearing the extremes it gets slower
* however choosing the index of pivot for partition that doesn't affect execution time. because the array should be shuffled
* If your partition chooses the first or last element( ours does) and the array is sorted, this is the worst case. Since you not spilting the array
