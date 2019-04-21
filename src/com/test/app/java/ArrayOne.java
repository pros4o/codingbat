package com.test.app.java;

public class ArrayOne {
    //1 task
    public boolean firstLast6(int[] nums) {
     if (nums[0] == 6 || nums[nums.length-1]==6) return true;
     return false;
    }
    //2 task
    public boolean sameFirstLast(int[] nums) {
      if (nums.length==0) return false;
     
     if (nums[0] == nums[nums.length - 1]) return true;
    
      return false;
    }
    
    //3 task
    public int[] makePi() {
        return new int[]{3, 1, 4};
    }
    
    //4 task
    public boolean commonEnd(int[] a, int[] b) {
      if (a[0] == b[0] || a[a.length - 1] == b[b.length-1]) return true;
      return false;
    }

    //5 task
    public int sum3(int[] nums) {
      int S = 0;
      for (int i: nums)
        S+=i;
    return S;
    }
    
    //6 task
    //7 task
    //8 task
    //9 task
    //10 task
    //11 task
    //12 task
    //13 task
    //14 task
    //15 task
    //16 task
    //17 task
    //18 task
    //19 task
    //20 task
    //21 task
    //22 task
    //23 task
    //24 task
    //25 task
    //26 task
    //27 task
}