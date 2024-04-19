package Qiuzzz;

import java.util.Arrays;

public class StructureOfGame {
    public String questions;
    public String[] answers;

    public StructureOfGame(String questions, String[] answers) {
        this.questions = questions;
        this.answers = answers;
    }

    public boolean answerOfQuestion() {
        boolean check = true;
        if (answers.equals(check)){
            System.out.println("Answer is correct!");
        } else {
            System.out.println("Wrong answer...");
        }
        return check;
    }

    @Override
    public String toString() {
        return "StructureOfGame{" +
                "questions='" + questions + '\'' +
                ", answers=" + Arrays.toString(answers) +
                '}';
    }
}
