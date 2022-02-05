package LongestIncreasingSequence;
import java.util.*;
public class Solution {

	     public int lengthOfLIS(int[] nums) {
	        List<Integer> list = new ArrayList<>();
	        for (int num: nums) {
	            int index = Collections.binarySearch(list, num);
	            if (index < 0) {
	                index = (-index) - 1;
	                if (index>=list.size()) {
	                   list.add(num); 
	                }
	                else {
	                    list.set(index, num);
	                }
	            }
	        }
	     
	        return list.size();
	    }
	    public static void main(String args[]){
	        System.out.println("The length of the list is " + new Solution().lengthOfLIS( new int[]{10,20,9,36,2,50,4,6} ));
	    }   
	}

