import Inputer.InputString;

public class Main {
    public static void main(String[] args) {
        InputString in = new InputString();

        System.out.println("Hello!");
        String name = in.input("Name:");
        String webname = in.input("Webname:");

        new Student(name, 13, webname);
    }

}

class Student{
    public String name;
    public int age;
    public Student(String name,int age,String webname) {

        this.name = name;
        this.age = age;
        System.out.println("Welcome, "+name + "! \n" + "Your Webname is " + webname + ", is it?");

    }
}