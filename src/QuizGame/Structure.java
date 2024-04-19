package QuizGame;

import java.util.Arrays;

public class Structure {
    public String questions;
    public String[] answers;
    public int indexOfCorrectAnswers;

    public Structure(String questions, String[] answers, int indexOfCorrectAnswers) {
        this.questions = questions;
        this.answers = answers;
        this.indexOfCorrectAnswers = indexOfCorrectAnswers;
    }

    @Override
    public String toString() {
        return "Structure{" +
                "questions='" + questions + '\'' +
                ", answers=" + Arrays.toString(answers) +
                ", indexOfCorrectAnswers=" + indexOfCorrectAnswers +
                '}';
    }
}

