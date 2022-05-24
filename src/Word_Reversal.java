import java.util.Scanner;

public class Word_Reversal {
    
    /**
     *  For this challenge, the input is a string of words, and the output should be the words
     *  in reverse but with the letters in the original order. For example, the string "Dog bites
     *  man" should output as "man bites Dog."
     *
     *  After you've solved this challenge, try adding sentence capitalization and punctuation to
     *  your code. So, the string "Codecademy is the best!" Should output as "Best the is Codecademy!"
     *
     *  @author Azubike Samie
     *  @since  May 24th, 2022
     */
    public static void main(String[] args) {

        try {
            Scanner accept = new Scanner(System.in);
            System.out.println("Hello Welcome!");
            System.out.println("Enter any sentence you will to reverse: ");
            String msg = accept.nextLine();

            String[] words = msg.split(" ");

            words[words.length - 1] = words[words.length - 1].substring(0, 1).toUpperCase() + words[words.length - 1].substring(1);

            //Initialize variable to store the reverse words
            String reverseSentence = "";
            for (int i = 0; i < words.length; i++) {

                reverseSentence += words[words.length - (1 + i)] + " ";
            }
            System.out.println(reverseSentence + "!");
        }
        catch (RuntimeException e){
            System.out.println(e);
        }

    }
}