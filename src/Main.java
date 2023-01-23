import Inputer.In;

public class Main {
    public static void main(String[] args) {
        In in = new In();

        System.out.println("Hello!");
        String name = in.input("Name:");
        int age = in.inputInt("Age:","Please try again.");
        String webname = in.input("Webname:");

        new Student(name, age, webname);
    }

}

class Student{
    public String name;
    public int age;
    public Student(String name,int age,String webname) {

        this.name = name;
        this.age = age;
        System.out.println("Welcome, "+name + "! \n" + "Your age is " + age + ".\nYour Webname is " + webname + ", is it?");

    }
}