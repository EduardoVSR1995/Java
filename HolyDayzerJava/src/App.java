import java.util.Scanner;

import feriados.feriados;

public class App {
    public static void main(String[] args) throws Exception {
        new feriados().feriados();;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entre com a data para saber se tem feriado");
            String value = scanner.next();
            String exist = new feriados().getFeriado(value);
            System.out.println(exist);
            System.out.println("Quer ver dodos os feriados?[S/n]");
            String all = scanner.next();
            if(all.equals("S") || all.equals("s") ){
                new feriados().allFeriado();
            }
            
            
        }
    }
}
