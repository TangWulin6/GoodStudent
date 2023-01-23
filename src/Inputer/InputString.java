package Inputer;

import java.util.Scanner;

public class InputString {
    public String input(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        return scan.nextLine();
    }
    public String input() {
        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }
}
