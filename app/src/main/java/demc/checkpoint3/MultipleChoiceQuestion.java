package demc.checkpoint3;
import java.util.Scanner;
public class MultipleChoiceQuestion  extends Question {
    private String[] mOptions;
    int mAnswer;

    public MultipleChoiceQuestion(String text, String[] options, int answer) {
        super(text);
        mAnswer = answer;
        mOptions= options;
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        for(int i = 0; i < mOptions.length; i++) {
            System.out.println(i + " " + mOptions[i]);
        }
        System.out.println("Enter your answer ");
        int in = input.nextInt();
        return checkAnswer(in);
    }

    @Override
    public boolean checkAnswer(int answer){
        return (mAnswer==answer);
    }
    public boolean isMultipleChoiceQuestion(){
        return true;
    }

}



