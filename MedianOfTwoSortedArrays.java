import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] margedArray = new int[nums1.length + nums2.length];
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < margedArray.length; i++) {
            if (firstIndex < nums1.length && secondIndex < nums2.length && nums1[firstIndex] < nums2[secondIndex]) {
                margedArray[i] = nums1[firstIndex];
                firstIndex++;

            } else {

                if (firstIndex == nums1.length) {
                    margedArray[i] = nums2[secondIndex];
                    secondIndex++;

                } else if (secondIndex == nums2.length) {
                    margedArray[i] = nums1[firstIndex];
                    firstIndex++;

                } else {
                    margedArray[i] = nums2[secondIndex];
                    secondIndex++;
                }

            }

        }
//        System.out.println(Arrays.toString(margedArray));
        int n = margedArray.length;
        if (margedArray.length % 2 == 0) {
            return (double) (margedArray[(n / 2) - 1] + margedArray[(n / 2)]) / 2;
        }
        return margedArray[n / 2];
    }


    public static void main(String[] args) {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        int[] array1 = {1, 2};
        int[] array2 = {3};
        System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(array1, array2));
    }


}
