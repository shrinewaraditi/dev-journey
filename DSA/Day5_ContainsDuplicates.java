import java.util.HashSet;
public class Day5_ContainsDuplicates {
  public boolean containsDuplicates(int[] nums){
    /*for(int i=0; i<nums.length; i++)
    {
      for (int j=i+1; j<nums.length;j++)
        {
          if (nums[j]== nums[i])
            return true;
          
        } 
    } return false;*/
     //Better Approach
     HashSet<Integer> set= new HashSet<>();
     for(int i=0; i<nums.length; i++)
     {
      if(set.contains(nums[i]))
        {return true;}
      set.add(nums[i]);
     }
     return false;

  }
  public static void main(String[] args) { 
    Day5_ContainsDuplicates solution= new Day5_ContainsDuplicates();
    System.out.println(solution.containsDuplicates(new int[]{1,2,3,4,1}));
    //System.out.flush();
    System.out.println(solution.containsDuplicates(new int[]{1,2,5,6}));
  }
}
