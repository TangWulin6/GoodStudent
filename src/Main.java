import Inputer.In;

public class Main {
    public static void main(String[] args) {
        In in = new In();

        int answerInt = in.inputInt("你好。\n学生党请按1，老师请按2。不想玩了的话，可以按0走人。按完请回车。\n", "请输入数字整数，谢谢。");
        while (answerInt != 0) {
            if (answerInt == 1) {
                System.out.println("Hello!");
                String name = in.input("Name:");
                int age = in.inputInt("Age:","Please try again.");
                String webname = in.input("Webname:");
                new Student(name, age, webname);
            } else if (answerInt == 2) {
                System.out.println("Hello!");
                String name = in.input("Name:");
                int age = in.inputInt("Age:","Please try again.");
                String subject = in.input("Subject(English)");
                String webname = in.input("Webname:");
                new Teacher(name, age, webname,subject);
            }
            answerInt = in.inputInt("学生党按1，老师按2。不想玩了按0走人。\n", "请输入数字整数。");
        }



    }

}

class Student{
    public String name;
    public int age;
    public String webname;
    public Student(String name,int age,String webname) {

        this.name = name;
        this.age = age;
        this.webname = webname;
        System.out.println("Welcome, "+name + "! \n" + "Your age is " + age + ".\nYour Webname is " + webname + ", is it?");

    }
}
class Teacher extends Student{
    public String subject;

    public Teacher(String name, int age, String webname,String subject) {
        super(name, age, webname);
        this.subject = subject;
        System.out.println("Welcome, "+name + "! \n" + "Your age is " + age + ".\n" + "Your subject is " + subject +".\nYour Webname is " + webname + ", is it?");

    }

}