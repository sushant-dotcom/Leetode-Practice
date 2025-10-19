public class sortcolor {
    public static void main(String[] args) {
       // int[] nums={2,2,2,1,1,0,0,1,0,1,0,2,1,0,2,1,0,2,1,1};
        int[] nums={2,0,2,1,1,0};
        int zero=0,two=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(i>two){
                break;
            }
            if(nums[i]==0){
                shift(nums,i,zero);

                zero++;
                if(nums[i]==2){
                    i--;
                }

            }else if(nums[i]==2 ){
                shift(nums,i,two);
                if(nums[i]==0 || nums[i]==2){
                    i--;
                }
                two--;
            }
        }

        for (int xx:
             nums) {
            System.out.print(xx+",");
        }

    }
    public static void shift(int[] nums,int i,int value){
        int z=nums[i];
        nums[i]=nums[value];
        nums[value]=z;
    }
}

///Dutch nation flag algo

//    public void sortColors(int[] nums) {
//        int low = 0, mid = 0, high = nums.length - 1;
//        while (mid <= high) {
//            if (nums[mid] == 0) {
//                int tmp = nums[low];
//                nums[low++] = nums[mid];
//                nums[mid++] = tmp;
//            } else if (nums[mid] == 1) {
//                mid++;
//            } else {
//                int tmp = nums[mid];
//                nums[mid] = nums[high];
//                nums[high--] = tmp;
//            }
//        }
//    }
