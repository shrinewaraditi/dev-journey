class Day1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            int num1= nums[i];
            for (int j=i+1; j<nums.length; j++){
                int num2 = nums[j];
                if(num1 + num2 == target)
                return new int[]{i,j};
            }  
            
        } return new int[]{}; 
}
public static void main(String[] args) {
        Day1_TwoSum solution = new Day1_TwoSum();

        // test case 1
        int[] result1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result1[0] + ", " + result1[1]); // 0, 1

        // test case 2
        int[] result2 = solution.twoSum(new int[]{3, 3}, 6);
        System.out.println(result2[0] + ", " + result2[1]); // 0, 1

        // test case 3
        int[] result3 = solution.twoSum(new int[]{1, 2, 3}, 5);
        System.out.println(result3[0] + ", " + result3[1]); // 1, 2
    }
}