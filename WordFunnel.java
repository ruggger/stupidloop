// @author Raghubir Chimni
// @version 1.0 11/24/18

import java.util.*;
public class WordFunnel {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String l = "";
    System.out.print("say a word ");
    l =  scan.next();
    int k =l.length()-1;
    System.out.print("\n" + l+ "\n");
    for(int i = 0; i<l.length()-1; i++)
    {
      System.out.println(l.substring(0,k));
      k--;
    }
  }
}
