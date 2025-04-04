public class Merge_sorted_array {
    public static void main(String[] args) {
        int[]nums1={1,2,3,0,0,0}; //0 just make enough space
        int[]nums2={2,5,6};
        int n=3; //actual length of nums1
        int m=3;  //actual length of nums2
        merge(nums1,m,nums2,n);
       // System.out.println(nums1.length);
        //print merged array
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
    public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1; //will point to nums1 last element (3)
        int j=n-1; //will point to nums2 last element (6)
        int k=m+n-1; //last element of merged array

        while(j>=0){
            if(i>=0 && (nums1[i]>nums2[j])){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }
    }
}
