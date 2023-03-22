import java.util.ArrayList;

public class Question{
    private static ArrayList<Question> allQuestions;
    private String question;
    private String name;
    

    protected Question(String question, String name){
        if(this.allQuestions == null) this.allQuestions = new ArrayList<Question>();
        this.allQuestions = allQuestions;
        this.question = question;
        this.name = name;
        
        addQuestion();
    }
    private void addQuestion(){
        this.allQuestions.add(this);
    }
    public static String getAllQuestions(){
        String i = "";
        for (int index = 0; index < allQuestions.size() ; index++) {
            i += allQuestions.get(index).name+": "+allQuestions.get(index).question+"\n";
        }
        return i;
    }
}
