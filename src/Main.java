import java.lang.System;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello!");
        String name = input("Name:");
        String webname = input("Webname:");
        new Student(name, 13, webname);
    }
    public static String input(String text){
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        return scan.nextLine();
    }
}

class Student{
    public String name;
    public int age;
    public Student(String name,int age,String webname) {
        this.name = name;
        this.age = age;
        System.out.println("Welcome,"+name + "!\nYour Webname is " + webname + ",is it?");

    }
}