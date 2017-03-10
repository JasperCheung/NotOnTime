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
* We calculate the runtime it takes for a QuickSort to run on different arrays. n = 10,25,50,75,1000,5000,10000, as well as four different other iterations of the 10-item array.

### Time Measurements and Analysis
* From the random 10-item array t the 25-item array, the time jump was always arund 4-5x the amount of time for the 10-item. This is expected, as it indicates that the runtime is something higher than linear, which reflects the O(nlogn) nature of the function. This was generally consistent for jumps from 25 to 50 items, and so forth. We also used three other variations of the 10-item list: one already sorted, the next in backwards order, the third with highest values concentrated to the outside, and the last with all highest values concentrated on the inside.
* Here, the results were truly surprising, as the pre-sorted array actually took around 6-7 times longer than the randomized 10-item array, while the other three alternates were half the runtime. This was almost the opposite of what we expected, but somewhat makes sense due to the fact that a pre-sorted array would force the algorithm to confront every single element.

### Pivot Selection and Data Arrangement's Affect on Execution Time
* when pivots are the median, quicksort runs the fastest
* when pivots are nearing the extremes it gets slower
* however choosing the index of pivot for partition that doesn't affect execution time. because the array should be shuffled
* If your partition chooses the first or last element( ours does) and the array is sorted, this is the worst case. Since you not spilting the array
