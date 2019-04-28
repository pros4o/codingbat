package com.test.app.java;


public class WarmupOne {

    //1 task
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation || !weekday) return true;
        return false;
      }
      
    //2 task
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        boolean flag = false;

        if (aSmile && bSmile) {
            flag = true;
        }
       else if (!aSmile && !bSmile) {
           flag = true;
       }
       return flag;
      }
      
    //3 task
    public int sumDouble(int a, int b) {
        int some = 0;
      
      if (a == b) {
        some = 2*(a+b);
      }
      else some = a+b;
      return some;
      }

    //4 task
    public int diff21(int n) {
        if (n>21) return Math.abs(2*(n-21));
        else return Math.abs(n-21);
      }

    //5 task
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && hour < 7) return true;
        else if (talking && hour > 20) return true;
        return false;
      }
    
    //6 task
    public boolean makes10(int a, int b) {
        if (a+b==10 || a==10 || b==10) return true;
        return false;
      }

    //7 task
    public boolean nearHundred(int n) {
  
        boolean flag = false;
         
        if (Math.abs(n - 10) < 0) return true;
        
        else if (Math.abs(n - 100) < 11) return true;
        
        else if (Math.abs(n - 200) < 11)  return true;
        
        return flag;
        }

    //8 task
    public boolean posNeg(int a, int b, boolean negative) {
        if (!negative && a<0 && b < 0) return false;
        
      else if (negative && (a>0 || b>0)) return false;
      
      else if (!negative && (a>0 && b>0)) return false;
      
      return true;
      }
      
    //9 task
    public String notString(String str) {
        if (str.startsWith("not")) return str;
        else return "not "+str;
      }
      
    //10 task
    public String missingChar(String str, int n) {
      return str.substring(0, n) + str.substring(n+1,str.length());
    }

    //11 task
    public String frontBack(String str) {
      if (str.length() < 2) return str;
      String first = str.substring(0,1);
      String end = str.substring(str.length() - 1, str.length());
      return end + str.substring(1, str.length()-1) + first;
    }
    
    //12 task
    public String front3(String str) {
      int i = 0;
      if (str.length() > 3) i = 3;
      else i = str.length();
      return str.substring(0,i)+str.substring(0,i)+str.substring(0,i);
    }

    //13 task
    public String backAround(String str) {
      String last = str.substring(str.length() - 1);
      return last + str + last;
    }
    
    //14 task
    public boolean or35(int n) {
        if (n%3==0 || n%5==0) return true;
        return false;
      }
      
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
    //28 task
    public boolean stringE(String str) {
      int count = 0;
      for(int i = 0; i <str.length(); i++) {
        if(str.charAt(i) =='e') count++;
      }
      return (count >= 1 && count <=3);
    }

    //29 task
    public boolean lastDigit(int a, int b) {
      if (a%10 == b%10) return true;
      return false;
    }
    
    //30 task
    public String endUp(String str) {
      if (str.length() < 3) return str.toUpperCase();
      return str.substring(0,str.length()-3) + str.substring(str.length()-3,str.length()).toUpperCase();
    }    

    //31 task
    public String everyNth(String str, int n) {
      String some = "";
      for(int i = 0; i < str.length(); i+=n) {
        some += str.charAt(i);
      }
      return some;
    }
      
}