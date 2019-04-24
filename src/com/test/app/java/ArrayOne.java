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
    public int[] rotateLeft3(int[] nums) {
      int temp = nums[0];
      for (int i = 0; i < nums.length - 1; i++) {
        nums[i] = nums[i+1];
      }
      nums[nums.length - 1] = temp;
      return nums;
    }

    //7 task
    public int[] reverse3(int[] nums) {
      int temp = nums[0];
      nums[0] = nums[nums.length-1];
      nums[nums.length-1] = temp;
      return nums;
    }

    //8 task
    public int[] maxEnd3(int[] nums) {
      if (nums[0]>nums[nums.length-1]) {
        for(int i=0;i<nums.length;i++)
          nums[i]=nums[0];
        return nums;
      }
      for(int i=0;i<nums.length;i++)
          nums[i]=nums[nums.length-1];
        return nums;
    }

    //9 task
    public int sum2(int[] nums) {
      if(nums.length==0) return 0;
  
    if(nums.length<2) return nums[0];
  
      return nums[0]+nums[1];
    }
  
    //10 task
    public int[] middleWay(int[] a, int[] b) {
      int[] c = new int [2];
      c[0] = a[1];
      c[1] = b[1];
      return c;
    }
    
    //11 task
    public int[] makeEnds(int[] nums) {
      int[] some = new int [2];
      some[0] = nums[0];
      some[1] = nums[nums.length - 1];
      return some;
    }
    
    //12 task
    public boolean has23(int[] nums) {
      for (int i = 0; i < nums.length; i++)
        if(nums[i] == 2 || nums[i] == 3) return true;
      return false;
    }

    //13 task
    public boolean no23(int[] nums) {
      for (int i = 0; i < nums.length; i++)
      if(nums[i] == 2 || nums[i] == 3) return false;
      return true;
    }

    //14 task
    public int[] makeLast(int[] nums) {
      int[] some = new int[nums.length * 2];
      for (int i = 0; i < some.length - 1; i++)
        some[i] = 0;
      some[some.length - 1] = nums[nums.length - 1];
      return some;
    }
    
    //15 task
    public boolean double23(int[] nums) {
      for (int i = 0; i < nums.length - 1; i++)
        if((nums[i] == 2 || nums[i] == 3) && (nums[i+1] == nums[i])) 
          return true;  
      return false;
    }

    //16 task
    public int[] fix23(int[] nums) {
      for(int i = 0; i < nums.length; i++) {
        if (nums[i] == 2 && nums[i+1] == 3) {
          nums[i + 1] = 0;
          break;
        }
      }
      return nums;
    }

    //17 task
    public int start1(int[] a, int[] b) {
      int count = 0;
      if (a.length != 0 && a[0] == 1) count++;
      if (b.length != 0 && b[0] == 1) count++;
      return count;
    }

    //18 task
    public int[] biggerTwo(int[] a, int[] b) {
      if((a[0] + a[1]) >= (b[0] + b[1])) {
        return a;
      }
      return b;
    }

    //19 task
    public int[] makeMiddle(int[] nums) {
      int[] a;
      if (nums.length %2 == 0) {
          a = new int[2];
          a[0] = nums[(nums.length/2) - 1];
          a[1] = nums[nums.length/2];
      } else {
          a = new int[1];
          a[0] = nums[nums.length/2];
      }
      return a;
    }
  
    //20 task
    public int[] plusTwo(int[] a, int[] b) {
      int[] c = new int[a.length + b.length];
      for(int i = 0; i < c.length; i++) {
        if(i<a.length) {
          c[i] = a[i];
        } else {
          c[i] = b[i-a.length];
        }
      }
      return c;
    }
    
    //21 task
    public int[] swapEnds(int[] nums) {
      int temp = nums[0];
      nums[0] = nums[nums.length - 1];
      nums[nums.length - 1] = temp;
      return nums;
    }
    
    //22 task
    //23 task
    public int maxTriple(int[] nums) {
      int max = nums[0];
      if (max < nums[nums.length - 1]) {
        max = nums[nums.length - 1];
      }
      if (max < nums[nums.length / 2]) {
        max = nums[nums.length/2];
      }
      return max;
    }

    //24 task
    //25 task
    //26 task
    //27 task
    public int[] front11(int[] a, int[] b) {
      int[] c = new int[1];
   
   if (b.length==0 && a.length==0) return a;
  
    if(a.length==0) {c[0]=b[0]; return c;}
  
    if(b.length==0) {c[0]=a[0]; return c;}
   
   
    int[] w = new int[2];
  
    w[0]=a[0];
    
  w[1]=b[0];
  
    
    
    return w;
  }
}