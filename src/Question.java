import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Question {
    private String question;
    private String[] answers;
    private Random rand;

    String getQuestion() {
        return question;
    }

    String getRightAnswer() {
        return answers[0];
    }

    String[] getRandomizedAnswers() {
        List<String> answersList = Arrays.asList(this.answers);
        List<String> randomizedList = new ArrayList<String>();
        while (!answersList.isEmpty()) {
            int rng = rand.nextInt(answersList.size());
            randomizedList.add(answersList.get(rng));
            answersList.remove(rng);
        }
        String[] arr = new String[this.answers.length];
        arr = randomizedList.toArray(arr);
        return arr;
    }
}
