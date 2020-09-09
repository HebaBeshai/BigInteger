import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scan = new Scanner(System.in);
      BigInteger num = scan.nextBigInteger();
      BigInteger num2 = scan.nextBigInteger();
      //BigInteger sum = num+num2;
      //BigInteger mult =  num*num2;
      System.out.println(num.add(num2));
      System.out.println(num.multiply(num2));

    }
}
