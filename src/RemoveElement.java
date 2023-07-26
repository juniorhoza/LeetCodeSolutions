import java.util.ArrayList;

public class RemoveElement {

    public int[] nums;
    private int val;
    public int removeElement(int[] nums, int val) {
        int k=0;
        ArrayList<Integer> secNums= new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            if(nums[i]!=val){
                k++;
                secNums.add(nums[i]);

            }
        }
        int[] fournums=new int[secNums.size()];

        for(int i=0;i<fournums.length;i++){
            fournums[i]=secNums.get(i);
        }

        nums=fournums;
        fournums=null;
        secNums=null;
        System.out.println(k);
        for (int num: nums
        ) {
            System.out.println(num);
        }
        return k;
    }

    public RemoveElement(int[] nums, int val){
        this.nums=nums;
        this.val=val;

        removeElement(nums,val);
    }

}
