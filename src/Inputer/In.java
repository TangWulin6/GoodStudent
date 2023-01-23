package Inputer;

import java.util.Scanner;

public class In {
    public String input(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        return scan.nextLine();
    }
    public String input() {
        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }
    public int inputInt(String errorText) {
        Scanner s = new Scanner(System.in);
        while (true) {
            if (s.hasNextInt()) {
                return s.nextInt();
            } else {
                System.out.println(errorText);
                s.next();
            }
        }
    }
    public int inputInt(String text,String errorText) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print(text);
            if (s.hasNextInt()) {
                return s.nextInt();
            } else {
                System.out.println(errorText);
                s.next();
            }
        }
    }

    public int inputInt(){
        Scanner s = new Scanner(System.in);
        while (true) {
            boolean a = s.hasNextInt();
            if (a) {
                return s.nextInt();
            }else{
                System.out.println("Error!");
                s.next();
            }
        }
    }
}
