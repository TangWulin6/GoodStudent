import Inputer.InputString;
import Printer.Print;
public class Main {
    public static void main(String[] args) {
        InputString instr = new InputString();
        Print Print = new Print();
        Print.println("Hello!");
        String name = instr.input("Name:");
        String webname = instr.input("Webname:");

        new Student(name, 13, webname);
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