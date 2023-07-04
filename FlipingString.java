//Write a program that takes a string as input and generates it inversed

import java.util.Scanner;
public class FlipingString {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            String text = scanner.nextLine();
            char[] arr = text.toCharArray();

            String rev = "";
            for(char i:arr)
                rev = i + rev;
            System.out.print(rev);
        }
    }
}
