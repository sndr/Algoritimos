package src;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int y = 0; y < nums.length; y++) {
            if (nums[y] != val) {
                // basicamente criamos um nums limpo do inicio K e a cada valor diferente sem ser o val vai sendo adicionado no nums k novo
                nums[k] = nums[y];
                k++;
            }
        }
        return k;
    }
}

