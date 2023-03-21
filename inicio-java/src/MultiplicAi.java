import java.util.Scanner;

public class MultiplicAi{
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entre com um numero para saber sua tabela de multiplicação");
            int number = scanner.nextInt();
            System.out.println("Tabela de multiplicação de "+number);
            for(int i = 0; i < 9; i++ ){
                System.out.println(number + " * " + i + " = " + number*i);
            };
            Scanner scannerVerifi = new Scanner(System.in);
            System.out.println("Fazer outra operação? [S/N]");
            String verifi = scannerVerifi.nextLine();
            if(!( verifi.equals("S") || verifi.equals("s")) ) break;
        }
    }
}
