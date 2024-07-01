import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
/* 1 . Develop a program that takes the weight (in kilograms) and height (in meters) as
        input and calculates the BMI, then prints it.

        System.out.println("Enter your weight: ");
        double weight=input.nextDouble();
        System.out.println("Enter your height: ");
        double height=input.nextDouble();
        height*=height;
        double result=weight/height;
        System.out.println("Your BMI: "+result );

        Output:
        Enter your weight:
        70
        Enter your height:
        1.75
        Your BMI: 22.857142857142858
 */
        /* 2. Write a program that takes the obtained marks and total marks as input and
            calculates the percentage, then prints it. */
//        System.out.println("Enter your obtained marks:");
//        int obtMarks=input.nextInt();
//        System.out.println("Enter maximum marks:");
//        float max= input.nextFloat();
//        float Percentage=(obtMarks/max)*100;
//        System.out.println("Your Percentage: "+ Percentage+"%");
//        output:
//        Enter your obtained marks:
//        85
//        Enter maximum marks:
//        100
//        Your Percentage: 85.0%

        /*3. Create a program that takes an amount in one currency and an exchange rate as
              input, then converts and prints the amount in another currency.*/
//        System.out.println("Change USD to EUR");
//        System.out.println("Enter your USD: ");
//        int usd= input.nextInt();
//        System.out.println("Enter the EUR : ");
//        double eud= input.nextDouble();
//        System.out.println("Amount in EUR = "+usd*eud);
        //output:
//        Change USD to EUR
//        Enter your USD:
//        100
//        Enter the EUR :
//        0.85
//        Amount in EUR = 85.0
        /*

        * 4. Create a program that takes a string as input, calculates its length, and then reverses
              the string using the StringBuilder class, finally printing both the length and reversed string.

        System.out.println("Enter your Text:");
        String userText= input.nextLine();
        StringBuilder text=new StringBuilder(userText);
        System.out.println("String length : "+text.length()+ " reverse Text: "+text.reverse());

        Output:
        Enter your Text:
        Hello, World!
        String length : 13 reverse Text: !dlroW ,olleH
* */
        /*
        * 5. Develop a program that takes a sentence as input and extracts a substring from it,
            then prints the extracted substring.

        System.out.println("Enter your sentence: ");
        String sentence=input.nextLine();
        System.out.println("Start from: ");
        int start=input.nextInt();
        System.out.println("End from: ");
        int last= input.nextInt();
        System.out.println(sentence.substring(start,last));
        * Output:
        * Enter your sentence:
            The quick brown fox jumps over the lazy dog
            Start from:
            10
            End from:
            20
            brown fox
        * */

        /*6. Write a program that takes a sentence and a keyword as input, then check if the
            keyword is present in the sentence and prints the result.
        System.out.println("Enter your Sentence: ");
        String sentence=input.nextLine();
        System.out.println("Enter keyword :");
        String search=input.nextLine();

        if(sentence.contains(search)){
            System.out.println(" Keyword "+search+" is present in the sentence");
        }else {
            System.out.println("not found");
        }
        Output:
        Enter your Sentence:
        The quick brown fox jumps over the lazy dog
        Enter keyword :
        jumps
        Keyword jumps is present in the sentence
        */
        /*
        * 7. Develop a program that takes a sentence and a word to replace as input, then
              replace all occurrences of the word with another word and prints the modified sentence.
        System.out.println("Enter sentence:");
        String sentence= input.nextLine();
        System.out.println("Write what you want Replace: ");
        String replace= input.nextLine();
        System.out.println("write your replacement word: ");
        String replacement= input.nextLine();
        System.out.println(sentence.replace(replace,replacement));

        * Output:
        * Enter sentence:
          The quick brown fox jumps over the lazy dog
          Write what you want Replace:
           fox
           write your replacement word:
            cat
            The quick brown cat jumps over the lazy dog
         */
        /*
        * 8. Write a program that takes two strings as input and check if they are equal, ignoring
            the case, then prints whether they are equal or not.
        System.out.println("Enter your Text 1:");
        String text1=input.nextLine();
        System.out.println("Enter your Text 2:");
        String text2=input.nextLine();
        if(text1.equalsIgnoreCase(text2)){
            System.out.println(" Strings are equal (ignoring case).");
        }else {
            System.out.println("not equals");
        }
        Output:
        * Enter your Text 1:
        Hello
        Enter your Text 2:
        hello
        Strings are equal (ignoring case).
         */

    }
}