package QuizGame;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {

        System.out.println("Hello, welcome to the quiz game.");
        int count = 1;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please select level (easy, medium, hard): - ");
            String level = scanner.next();
            if (level.equalsIgnoreCase("easy")) {
                Structure question1 = new Structure("Who wrote the Hamlet? - ", new String[]{scanner.nextLine()}, 1);
                Structure question2 = new Structure("The next question is who composed 'The Four Seasons'?", new String[]{scanner.nextLine()}, 1);
                Structure question3 = new Structure("Who was deaf, but one of the best composer ever?", new String[]{scanner.nextLine()}, 1);

                Structure[] easyMode = new Structure[3];
                easyMode[0] = question1;
                easyMode[1] = question2;
                easyMode[2] = question3;
                if (easyMode[0].equals("Willam Shakespeare")) {
                    System.out.println("true");
                    count++;
                } else {
                    System.out.println("false");
                } if (easyMode.equals("Antonio Vivaldi")) {
                    System.out.println("Correct");
                    count++;
                } else {
                    System.out.println("Wrong");
                }

                for (Structure questionss : easyMode) {
                    System.out.println(questionss.questions);
                    for (String answers : questionss.answers) {
                        System.out.println(answers);
                        int indexOfStructure = questionss.indexOfCorrectAnswers;
                        System.out.println(indexOfStructure);
                    }
                }
            } else if (level.equalsIgnoreCase("medium")) {
                Structure quesMid1 = new Structure("What is the largest planet in our solar system?", new String[]{scanner.nextLine()}, 1);
                Structure quesMid2 = new Structure("What is the currency of Japan?", new String[]{scanner.nextLine()}, 1);
                Structure quesMid3 = new Structure("Who is the author of Harry Potter series?", new String[]{scanner.nextLine()}, 1);

                Structure[] medMode = new Structure[3];
                medMode[0] = quesMid1;
                medMode[1] = quesMid2;
                medMode[2] = quesMid3;
                if (medMode[0].equals("Jupiter")) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }

                for (Structure questionss : medMode) {
                    System.out.println(questionss.questions);
                    for (String answers : questionss.answers) {
                        System.out.println(answers);
                        int indexOfStructure = questionss.indexOfCorrectAnswers;
                        System.out.println(indexOfStructure);
                    }
                }
            }

        }
    }
}
