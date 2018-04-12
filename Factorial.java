import java.util.*;
import java.lang.*;
import java.io.*;
class Factorial
{
     static int fact(int n){
      if(n<=1)
return 1;
return n*=fact(n-1);
}
public static void main(String args[]){
 int f=fact(10);
System.out.println(f);
}
}
