public class MergeSort {
    public static void mergeSort(Integer array[], int lo, int n){
        int low = lo;
        int high = n;
        if (low >= high)
            return;
        //Find the middle index of the array
        int middle = (low + high) / 2;
        //Store the last index of the first array
        int end_low = middle;
        //Store the first index of the second array
        int start_high = middle + 1;
        //Create 2 arrays from the 1
        //Send the array, 0 and the middle index of the array
        mergeSort(array,low, end_low);
        //Send the array, the middle index + 1, and the highest index of array
        mergeSort(array, start_high, high);

        //If the lowest index is <= to the bottom arrays highest index & the lowest index of the 2nd array is <= to its highest index
        while((lo <= end_low) && (start_high <= high)){
            if (array[low] < array[start_high]) //increment to the next index in the 1st array
                low++;
            else{
                //Store the value in the 1st index of the 2nd array
                int temp = array[start_high];

                //decrement backwards through the 1st array starting at the last index in 1st array
                for (int k=start_high-1; k>=low; k--){
                    array[k+1] = array[k];
                }
                array[low] = temp;
                low++;
                end_low++;
                start_high++;
            }
        }
    }
}
