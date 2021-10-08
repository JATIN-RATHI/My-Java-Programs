package com.company;

import java.util.*;

public class Main{

    public static void main(String[] args) {
        int []nums = new int[]{1,3,5,6};
        int target = 7;
        int result = -1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                result =  i;
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > target && nums[i-1] < target)
            {
                result = i;
            }
            else if (target>nums[i]){result = i + 1;}
        }
        System.out.println(result);
    }

}