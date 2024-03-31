public class SearchInsertPosition {

    private int binarySearchPosition(int[] array, int x){
        int start = 0;
        int end = array.length-1;

        while(start <= end){
           int mid = (start + end)/2;
           if(x == array[mid]){
               return mid;
           }
           else if(x > array[mid]){
               start = mid+1;
           }
           else{
               end = mid-1;
           }
        }
        return -1;
    }
    public int searchInsert(int[] nums, int target) {
        int position = binarySearchPosition(nums, target);
        if(position<0){
            int i = 0;
            while(target > nums[i] ){
                i++;
                if(i == nums.length) return i;
            }
            return i;
        }
        return position;
    }


    public static void main(String[] args) {
        SearchInsertPosition obj = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        System.out.println(obj.searchInsert(nums, 5));
    }
}
