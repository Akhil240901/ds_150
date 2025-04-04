public class remove_element {
    public static void main(String[] args) {
        int nums[]={3,2,3,2};
        int val=3;
        int ans=removeElement(nums,val);
        System.out.println(ans);
    }
     static int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]!=val){
                int temp=nums[j];
                nums[j++]=nums[i];
                nums[i]=temp;
            }
            i++;
        }

        return j;
    }
}
