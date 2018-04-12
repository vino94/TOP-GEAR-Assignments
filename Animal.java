import java.util.*;
import java.lang.*;
import java.io.*;
public class Animal {
    public void shout(){
    System.out.println("Animal shouts");
    } }
class Dog extends Animal{
     public void shout(){
    System.out.println("Dog barks");
    }
}
class Horse extends Animal{
     public void shout(){
    System.out.println("Horse neighs");
    }
}
class Cat extends Animal{
     public void shout(){
    System.out.println("Cat meows");
    }
}

