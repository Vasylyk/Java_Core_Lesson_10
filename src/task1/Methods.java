package task1;

import java.util.Scanner;

public class Methods {
    Scanner sc = new Scanner(System.in);
    private String input;

    void checkForPalindrom(){
        System.out.println("Write word for check");
        input=sc.next();
        StringBuffer word = new StringBuffer(input);
        StringBuffer wordReverse = new StringBuffer(input);
        wordReverse.reverse();
        System.out.println(word);
        System.out.println(wordReverse);
        if (input.length() == 5) {
            if (word.toString().equalsIgnoreCase(wordReverse.toString())) {
                System.out.println("Word is palindrom");
            } else {
                System.out.println("Word isn`t palindron");
            }
        } else {
            System.out.println("Error! Word isn`t 5 letters length");
        }
    }
}
