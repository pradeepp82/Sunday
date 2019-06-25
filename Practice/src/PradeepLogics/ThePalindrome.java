package PradeepLogics;
public class ThePalindrome 
{ 
  public static int find(String s) { 
    String ret=""; 
    String ss = ""; 
    StringBuilder sb = new StringBuilder(s); 
    StringBuilder sb1 = new StringBuilder();       
     
    if (sb.reverse().toString().equals(s)) return s.length(); 
     
    for (int i = 0; i < s.length(); i++) { 
      ss += s.charAt(i); 
      sb1 = new StringBuilder(ss); 
      ret = s+sb1.reverse().toString(); 
      sb = new StringBuilder(ret);             
      if (ret.equals(sb.reverse().toString())) {         
        break; 
      }       
    }     
     System.out.println(ret.length());
    return ret.length(); 

  } 
  
public static void main(String[] args) {
	find("abc");
}
}