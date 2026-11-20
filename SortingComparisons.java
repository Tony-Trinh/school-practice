package fall.pkg2026;


/**
 * This class implements six different comparison sorts (and an optional
 * heap sort for extra credit):
 * 
 * insertion sort
 * selection sort
 * shell sort
 * quick sort
 * bubble sort
 * merge sort
 * (extra credit) heap sort
 * 
 * It also has a method that runs all the sorts on the same input array and
 * prints out statistics.
 */

public class SortingComparisons{

    /**
     * Sorts the given array using the insertion sort algorithm. Note: after
     * this method finishes the array is in sorted order.
     * 
     * @param <T>  the type of values to be sorted
     * @param A    the array to sort
     */
    public static <T extends SortObject> void insertionSort(T[] A) {
        // TODO: implement this sorting algorithm
        
    	    int n = A.length;
            for (int i = 0; i < n; i++){
                SortObject key = new SortObject();
                key.assignTo(A[i]);
                
                int j = i - 1;
                while (j >= 0 && A[j].compareTo(key) > 0){
                    A[j+1].assignTo(A[j]);
                    j--;
                } 
                A[j+1].assignTo(key);
                
            }
    }

    /**
     * Sorts the given array using the selection sort algorithm. 
     * Note: after this method finishes the array is in sorted order.
     * 
     * @param <T>  the type of values to be sorted
     * @param A    the array to sort
     */
    public static <T extends SortObject> void selectionSort(T[] A) {
        // TODO: implement this sorting algorithm
        int n = A.length;
        for (int i = 0; i < n-1; i++){
            int minIndex = i;
            
            for (int j = i +1; j < n; j++){
                if (A[j].compareTo(A[minIndex]) < 0){
                    minIndex = j;
                }
            }
            
            SortObject temp = new SortObject();
            temp.assignTo(A[i]);
            A[i].assignTo(A[minIndex]);
            A[minIndex].assignTo(temp);
        }
    }  

    /**
     * Sorts the given array using the bubble sort algorithm.
     * Note: after this method finishes the array is in sorted order.
     * 
     * @param <T>  the type of values to be sorted
     * @param A    the array to sort
     */
    public static <T extends SortObject> void bubbleSort(T[] A) {
    	// TODO: implement this sorting algorithm
        int n = A.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (A[j].compareTo(A[j + 1]) > 0) {
                    SortObject temp = new SortObject();

                    temp.assignTo(A[j]);
                    A[j].assignTo(A[j + 1]);
                    A[j + 1].assignTo(temp);
                }
            }
        }
    }   
    
    
    
    /**
     * Sorts the given array using the shell sort algorithm.
     * Note: after this method finishes the array is in sorted order.
     * 
     * @param <T>  the type of values to be sorted
     * @param A    the array to sort
     */
 	public static <T extends SortObject> void shellSort(T[] A)
 	{
            // TODO: implement this sorting algorithm
            int n = A.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {
                SortObject temp = new SortObject();
                temp.assignTo(A[i]);

                int j = i;

                while (j >= gap && A[j - gap].compareTo(temp) > 0) {
                    A[j].assignTo(A[j - gap]);
                    j -= gap;
                }

                A[j].assignTo(temp);
            }
        }
 	 	
 	} // end shellSort

 
    /**
     * Sorts the given array using the merge sort algorithm. 
     * Note: after this method finishes the array is in sorted order.
     * 
     * @param <T>  the type of values to be sorted
     * @param A    the array to sort
     */
   
 	public static <T extends SortObject> void mergeSort(T[] A) {
        // TODO: implement this sorting algorithm
            mergeRecsort(A, 0, A.length - 1);
        }

        private static <T extends SortObject> void mergeRecsort(T[] A, int l, int r) {
            if (l < r) {
                int m = (l + r) / 2;

                mergeRecsort(A, l, m);
                mergeRecsort(A, m + 1, r);

                merge(A, l, m, r);
            }
        }

        private static <T extends SortObject> void merge(T[] A, int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;

            SortObject[] L = new SortObject[n1];
            SortObject[] R = new SortObject[n2];

            for (int i = 0; i < n1; i++) {
                L[i] = new SortObject();
                L[i].assignTo(A[l + i]);
            }

            for (int j = 0; j < n2; j++) {
                R[j] = new SortObject();
                R[j].assignTo(A[m + 1 + j]);
            }

            int i = 0;
            int j = 0;
            int k = l;

            while (i < n1 && j < n2) {
                if (L[i].compareTo(R[j]) <= 0) {
                    A[k].assignTo(L[i]);
                    i++;
                } else {
                    A[k].assignTo(R[j]);
                    j++;
                }
                k++;
            }

            while (i < n1) {
                A[k].assignTo(L[i]);
                i++;
                k++;
            }

            while (j < n2) {
                A[k].assignTo(R[j]);
                j++;
                k++;
            }
 	}

   
        
    /**
     * Sorts the given array using the quick sort algorithm, using the median of
     * the first, last, and middle values in each segment of the array as the
     * pivot value. 
     * Note: after this method finishes the array is in sorted order.
     * 
     * @param <T>  the type of values to be sorted
     * @param A   the array to sort
     */
    public static <T extends SortObject> void quickSort(T[] A) {
        // TODO: implement this sorting algorithm
        quickRecSort(A, 0, A.length - 1);
    }

    private static <T extends SortObject> void quickRecSort(T[] A, int low, int high) {
        if (low < high) {
            int p = partition(A, low, high);

            quickRecSort(A, low, p - 1);
            quickRecSort(A, p + 1, high);
        }
    }

    private static <T extends SortObject> int partition(T[] A, int low, int high) {
        int mid = low + (high - low) / 2;

        // Find median of first, middle, and last
        if (A[low].compareTo(A[mid]) > 0)
            swap(A, low, mid);

        if (A[mid].compareTo(A[high]) > 0)
            swap(A, mid, high);

        if (A[low].compareTo(A[mid]) > 0)
            swap(A, low, mid);

        // Move median pivot to the end
        swap(A, mid, high);

        SortObject pivot = new SortObject();
        pivot.assignTo(A[high]);

        int i = low;

        for (int j = low; j < high; j++) {
            if (A[j].compareTo(pivot) < 0) {
                swap(A, i, j);
                i++;
            }
        }

        swap(A, i, high);
        return i;
    }

    private static <T extends SortObject> void swap(T[] A, int i, int j) {
        if (i == j)
            return;

        SortObject temp = new SortObject();
        temp.assignTo(A[i]);
        A[i].assignTo(A[j]);
        A[j].assignTo(temp);
    }


        
    /**
     * Sorts the given array using the heap sort algorithm outlined below. 
     * Note: after this method finishes the array is in sorted order.
     * 
     * The heap sort algorithm is:
     * 
     * for each i from 1 to the end of the array
     *     insert A[i] into the heap (contained in A[0]...A[i-1])
     *     
     * for each i from the end of the array up to 1
     *     remove the max element from the heap and put it in A[i]
     * 
     * 
     * @param <T>  the type of values to be sorted
     * @param A    the array to sort
     */
    public static <T extends SortObject> void heapSort(T[]  A)
    {
    	// TODO: implement this sorting algorithm
       	int n = A.length;

        
        for (int i = 1; i < n; i++) {
            int child = i;

            while (child > 0) {
                int parent = (child - 1) / 2;

                if (A[child].compareTo(A[parent]) > 0) {
                    SortObject temp = new SortObject();
                    temp.assignTo(A[child]);
                    A[child].assignTo(A[parent]);
                    A[parent].assignTo(temp);

                    child = parent;
                } else {
                    break;
                }
            }
        }

        
        for (int end = n - 1; end > 0; end--) {
            SortObject temp = new SortObject();

            temp.assignTo(A[0]);
            A[0].assignTo(A[end]);
            A[end].assignTo(temp);

            
            int parent = 0;

            while (2 * parent + 1 < end) {
                int left = 2 * parent + 1;
                int right = left + 1;
                int largest = left;

                if (right < end &&
                    A[right].compareTo(A[left]) > 0) {
                    largest = right;
                }

                if (A[largest].compareTo(A[parent]) > 0) {
                    temp.assignTo(A[parent]);
                    A[parent].assignTo(A[largest]);
                    A[largest].assignTo(temp);

                    parent = largest;
                } else {
                    break;
                }
            }
        }
    }    
    
       
    
 
    /**
     * Internal helper for printing rows of the output table.
     * 
     * @param sort          name of the sorting algorithm
     * @param compares      number of comparisons performed during sort
     * @param moves         number of data moves performed during sort
     * @param milliseconds  time taken to sort, in milliseconds
     */
    @SuppressWarnings("unused")
	private static void printStatistics(final String sort, final int compares, final int moves,
                                        final long milliseconds) {
        System.out.format("%-23s%,15d%,15d%,15d\n", sort, compares, moves, 
                          milliseconds);
    }

    /**
     * Sorts the given array using the six (heap sort with the extra credit)
     * different sorting algorithms and prints out statistics. The sorts 
     * performed are:
     * 
     * insertion sort
     * selection sort
     * shell sort
     * quick sort
     * bubble sort
     * merge sort
     * (extra credit) heap sort
     * 
     * The statistics displayed for each sort are: number of comparisons, 
     * number of data moves, and time (in milliseconds).
     * 
     * Note: each sort is given the same array (i.e., in the original order). 
     * 
     * @param A  the array to sort
     */
    public static <T extends SortObject>void runAllSorts(T[] A) {
        System.out.format("%-23s%15s%15s%15s\n", "algorithm", "data compares", 
                          "data moves", "milliseconds");
        System.out.format("%-23s%15s%15s%15s\n", "---------", "-------------", 
                          "----------", "------------");
        // TODO: run each sort and print statistics about what it did
        
        long startTime, endTime;
        T[] arr=reset(A);
        startTime = System.nanoTime();
        insertionSort(arr);
        endTime = System.nanoTime();

        System.out.format("%-23s%15s%15s%15s\n", "insertion sort", SortObject.getCompares(), 
                SortObject.getAssignments(),(endTime-startTime)/1000000);
        
        arr=reset(A);
        startTime = System.nanoTime();
        selectionSort(arr);
        endTime = System.nanoTime();
        System.out.format("%-23s%15s%15s%15s\n", "selection sort", SortObject.getCompares(), 
                 SortObject.getAssignments(),(endTime-startTime)/1000000);
  
        
        arr=reset(A);
        startTime = System.nanoTime();
        shellSort(arr);
        endTime = System.nanoTime();
        System.out.format("%-23s%15s%15s%15s\n", "shell sort", SortObject.getCompares(), 
                   SortObject.getAssignments(),(endTime-startTime)/1000000 );
          

        arr=reset(A);
        startTime = System.nanoTime();
        quickSort(arr);
        endTime = System.nanoTime();
          System.out.format("%-23s%15s%15s%15s\n", "quick sort", SortObject.getCompares(), 
                    SortObject.getAssignments(),(endTime-startTime)/1000000);
    

        arr=reset(A);
        startTime = System.nanoTime();
        heapSort(arr);
        endTime = System.nanoTime();
        System.out.format("%-23s%15s%15s%15s\n", "heap sort", SortObject.getCompares(), 
                    SortObject.getAssignments(),(endTime-startTime)/1000000);

          
        arr=reset(A);
        startTime = System.nanoTime();
        bubbleSort(arr);
        endTime = System.nanoTime();
        System.out.format("%-23s%15s%15s%15s\n", "bubble sort", SortObject.getCompares(), 
                    SortObject.getAssignments(),(endTime-startTime)/1000000);

           
        arr=reset(A);
        startTime = System.nanoTime();
        mergeSort(arr);
        endTime = System.nanoTime();
        System.out.format("%-23s%15s%15s%15s\n", "merge sort", SortObject.getCompares(), 
                    SortObject.getAssignments(),(endTime-startTime)/1000000);
    }
    
    @SuppressWarnings("unchecked")
	private static <T extends SortObject> T[] reset(T[] A){

    	SortObject[] arr = TestSort.makeCopy(A, A.length); 
        SortObject.resetCompares();
    	SortObject.resetAssignments();
    	return (T[])arr;
        
    }
}
