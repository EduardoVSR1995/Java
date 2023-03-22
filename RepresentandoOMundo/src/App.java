import java.util.*;

public class App {
    public static void println(String value){
        System.out.println(value);
    }
    public static String scan(){
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        return i;
    }

    public static void main(String[] args) {
        while(true){
            println("Entre com seu nome ou aperte N para sair");
            String name = scan();
            if(name.equals("n") || name.equals("N") ) break;  
            println("Entre com seu e-mail");
            String email = scan();
            User user = new User(name, email);
            while(true){
                println("Digite sua pergunta ou N para sair:");
                String questionValue = scan();  
                if(questionValue.equals("n") || questionValue.equals("N")) break;
                user.addQuestionUser(questionValue, user.getName());
                println(user.getQuestionsName());
            }
        }
    }

}
