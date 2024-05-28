package DSA_1_LoveBabbar450_Arrays;
class Median2Array{
    public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;
        int low = 0, high = x;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            // If partitionX is 0 it means nothing is there on the left side. Use -INF for maxLeftX
            // If partitionX is length of the input then there is nothing on the right side. Use +INF for minRightX
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxLeftX <= minRightX && maxLeftY <= minRightY) {
                // We have partitioned the array at the correct place
                // Now get max of left elements and min of right elements to get the median in case of even length combined array size
                // or get max of left for odd length combined array size.
                if ((x + y) % 2 == 0) {
                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    return (double)Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                // We are too far on the right side for partitionX. Go on the left side.
                high = partitionX - 1;
            } else {
                // We are too far on the left side for partitionX. Go on the right side.
                low = partitionX + 1;
            }
        }

        // If we reach here, it means the input arrays are not sorted.
        throw new IllegalArgumentException();
    }
}
public class DSA_36_MedianOf2DiffArraySorted {
    public static void main(String [] args) {
        Median2Array x= new Median2Array();
        int[] a = {-5, 3, 6, 12, 15};
        int[] b = {-12, -10, -6, -3, 4, 10};
        System.out.println("The median is: " + x.findMedianSortedArrays(a, b));
    }
}
