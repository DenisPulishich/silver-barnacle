import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void countRecurringCharacters(String text) {
        while (text.length() > 0) {
            int tmpLength = text.length();
            String ch = text.substring(0, 1);
            Pattern p = Pattern.compile(ch);
            Matcher m = p.matcher(text);
            text = m.replaceAll("");
            System.out.println("[" + ch + "] - " + (tmpLength - text.length()));
        }
    }

        public static void main (String args[]){

            Scanner input = new Scanner (System.in);
            String text = input.nextLine();
            countRecurringCharacters(text);


        }

    }

