public class QuickSort {
    public static void QuickSort(int ar[], int left, int right)
    {
        if (left >= right)
        {
            return;
        }
        int pivot = ar[left];
        int leftPtr = left+1;
        int rightPtr = right;
        while(leftPtr <= rightPtr)
        {
            while(leftPtr <= right && ar[leftPtr] <= pivot)
            {
                leftPtr++;
            }
            while(rightPtr > left && ar[rightPtr] > pivot)
            {
                rightPtr--;
            }
            if (leftPtr < rightPtr)
            {
                int temp = ar[leftPtr];
                ar[leftPtr] = ar[rightPtr];
                ar[rightPtr] = temp;
                leftPtr++;
                rightPtr--;
            }
        }
        int temp = ar[left];
        ar[left] = ar[rightPtr];
        ar[rightPtr] = temp;
        QuickSort(ar, left, rightPtr-1);
        QuickSort(ar, leftPtr, right);
    }
    public static void main(String args[])
    {
        int a[]={12,4,567,7,99,21,675,888,25,25,31,899};
        int i;
        QuickSort(a,0,a.length-1);
        System.out.println("******Sorted Array*******");
        for(i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
