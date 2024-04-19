package Qiuzzz;

import java.util.Scanner;

public class AskingTime {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to the quiz game.");
        boolean playingTime = true;
        while (playingTime) {
            Scanner scanner = new Scanner(System.in);
            int count = 1;
            int score = 0;
            System.out.println("We have 3 different modes, please choose one of them (easy, medium, hard): ");
            String level = scanner.next();

            if (level.equalsIgnoreCase("easy")) {
                String easyFrist = scanner.nextLine();
                String easySecond = scanner.nextLine();
                String easyThird = scanner.nextLine();
                StructureOfGame easy1 = new StructureOfGame("Who wrote the Hamlet? - ", new String[]{easyFrist});
                StructureOfGame easy2 = new StructureOfGame("The next question is who composed 'The Four Seasons'?", new String[]{easySecond});
                StructureOfGame easy3 = new StructureOfGame("Who wrote the Hamlet? - ", new String[]{easyThird});

                StructureOfGame[] easyMode = new StructureOfGame[3];
                easyMode[0] = easy1;
                easyMode[1] = easy2;
                easyMode[2] = easy3;

                for (StructureOfGame question : easyMode) {
                    System.out.println(question.answers + "?");
                    for (String answer : question.answers) {
                        System.out.println(answer);
                        boolean check = question.answerOfQuestion();
                    }
                }
                boolean firstQ = easyFrist.equalsIgnoreCase("William Shakespeare");
                if (easyMode[0].equals(firstQ)) {
                    System.out.println(easy1.answerOfQuestion());
                    score += count;
                } else {
                    System.out.println(!easy1.answerOfQuestion());
                }

                boolean secondQ = easySecond.equalsIgnoreCase("Antonio Vivaldi");
                if (easyMode[1].equals(secondQ)) {
                    System.out.println(easy2.answerOfQuestion());
                    score += count;
                } else {
                    System.out.println(!easy2.answerOfQuestion());
                }

                boolean thirdQ = easyThird.equalsIgnoreCase("Beethoven");
                if (easyMode[2].equals(thirdQ)) {
                    System.out.println(easy3.answerOfQuestion());
                    score += count;
                } else {
                    System.out.println(!easy3.answerOfQuestion());
                }

            }
        }
    }
}
