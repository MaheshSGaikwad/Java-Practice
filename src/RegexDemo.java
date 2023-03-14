import java.util.regex.Matcher;
import java.util.regex.Pattern;
/** Regex is an API for defining the string pattern that is used for searching ,manipulating ,editing a string in javs **/
public class RegexDemo {
    //write a program to find the occcurence of'ab' in 'ababbab'?
    public static void main(String[]args){
        int count=0;
        // Step1:create a pattern object -Pattern class is used to define the string pattern
        Pattern p=Pattern.compile("ab");
        //Step2: create a Matcher object: used for searching in given String
        Matcher m=p.matcher("ababbab");
        while (m.find()){
            count++;
            System.out.println(m.start());//give the starting index of pattern
        }
        System.out.println("The total no of occurence is "+count);

    }
}
