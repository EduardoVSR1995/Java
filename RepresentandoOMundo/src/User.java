import java.util.ArrayList;

public class User{
    private String name;
    private String email;
    
    protected User(String name, String email) {
        this.name = name;
        this.email = email;   
        addUser(); 
    }
    private void addUser(){
        new AllUser(this);
    }
    public void addQuestionUser(String question, String name){
        new Question(question, name);
    }
    public String getQuestionsName(){
        String i = Question.getAllQuestions();
        return i;
    }    
    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
}
