import java.util.*;

public class P104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
                "Q1. Which keyword is used to create an object in Java?\nA. create\nB. new\nC. object\nD. make",

                "Q2. Which method is the entry point of a Java program?\nA. start()\nB. run()\nC. main()\nD. init()",

                "Q3. Which package contains the Scanner class?\nA. java.io\nB. java.util\nC. java.lang\nD. java.net",

                "Q4. Which loop is best when the number of iterations is known?\nA. while\nB. do-while\nC. for\nD. switch",

                "Q5. Which operator is used to compare two values in Java?\nA. =\nB. ==\nC. !=\nD. :"
        };
        String[] answers = {
                "B",
                "C",
                "B",
                "C",
                "B"
        };
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userAnswer = sc.next();// For your quiz, the user enters only one word or one character that's why we
                                          // are using next() method instead of nextLine() method.

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct Answer!");
                score++;
                System.out.println("Score: " + score);
            } else {
                System.out.println("Wrong Answer!");
                System.out.println("Correct Answer is: " + answers[i]);
                System.out.println("Score: " + score);
            }
        }
        sc.close();
    }
}