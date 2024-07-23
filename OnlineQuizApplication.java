import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Question Class
class Question {
    private String questionText;
    private List<String> options;
    private int correctAnswer;

    public Question(String questionText, List<String> options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean isCorrectAnswer(int answer) {
        return answer == correctAnswer;
    }
}

// Quiz 
class Quiz {
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}

// Main  
public class OnlineQuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();

        List<String> options1 = List.of("Java", "C++", "Python", "JavaScript");
        quiz.addQuestion(new Question("Which language is platform-independent?", options1, 0));

        List<String> options2 = List.of("Windows", "Linux", "Mac OS", "None of the above");
        quiz.addQuestion(new Question("Which OS is developed by Microsoft?", options2, 0));

        List<String> options3 = List.of("int", "float", "char", "array");
        quiz.addQuestion(new Question("Which data type is used to store characters?", options3, 2));
        
        List<String> options4 = List.of("HTML", "CSS", "XML", "SQL");
        quiz.addQuestion(new Question("Which language is used for web development?", options4, 0));
        
        List<String> options5 = List.of("4", "6", "8", "10");
        quiz.addQuestion(new Question("How many bits are there in a byte?", options5, 2));

        // Start the quiz
        int score = 0;
        List<Question> questions = quiz.getQuestions();

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + question.getQuestionText());

            List<String> options = question.getOptions();
            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ": " + options.get(j));
            }

            int userAnswer = getUserInput(scanner, options.size());
            if (question.isCorrectAnswer(userAnswer - 1)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + options.get(question.getCorrectAnswer()));
            }
            System.out.println();
        }

        // Display the final score
        System.out.println("Quiz Completed!");
        System.out.println("Your score is: " + score + "/" + questions.size());
        scanner.close();
    }
    private static int getUserInput(Scanner scanner, int numberOfOptions) {
        int userAnswer = -1;
        boolean valid = false;
        while (!valid) {
            System.out.print("Your answer (1-" + numberOfOptions + "): ");
            if (scanner.hasNextInt()) {
                userAnswer = scanner.nextInt();
                if (userAnswer >= 1 && userAnswer <= numberOfOptions) {
                    valid = true;
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume the invalid input
            }
        }
        return userAnswer;
    }
}
