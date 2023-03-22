import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RespondeAi {
    private List<Question> questions = new ArrayList<Question>();
    private Random rand = new Random();

    Question getRandomQuestion() {
        return questions.get(rand.nextInt(questions.size()));
    }
}
