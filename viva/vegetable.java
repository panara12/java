/*The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato.
Write a java program that demonstrates how to establish this class hierarchy. Declare
one instance variable of type String that indicates the color of a vegetable. Crete and
display instances of these objects. Override the toString() method of object to return a
string with the name of vegetable and its color.*/

import java.util.Scanner;
abstract class vegetabledemo{
    abstract String toString();
    Scanner sc = new Scanner(System.in);
    String color = sc.nextLine();
}

class potato extends vegetabledemo{
    void toString(){
        System.out.println("colour is skyny");
    }
}

class brinjal extends vegetabledemo{
    void toString(){
        System.out.println("perpal");
    }
}

class tomato extends vegetabledemo{
    void toString(){
        System.out.println("red");
    }
}

class vegetable{
    public static void main(String[] args) {
        
    }
}