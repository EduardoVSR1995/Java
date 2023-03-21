import java.util.Scanner;

public class PiramideDeNumeros{
    public static void println(String value){
        System.out.println(value);
    }
    public static String scanString(String value){
        println(value);
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        return i;
    }
    public static int scanInt(String value){
        println(value);
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }
    public static void main(String[] args) {
        while(true){
            int initial = scanInt("Entre com o valor de partida da piramide:");
            int piles = scanInt("Entre com a quantidade de carreiras da piramide:");
            if(initial > piles) main(args);
            for( int i = initial ; i <= piles ; i++ ){
                String line = "";
                for( int r = 0 ; r < i ; r++ ){
                    line += i ;
                }    
                println(line);
            }
            String valid = scanString("Deseja ver outra piramid? [S/N]");
            if(!(valid.equals("S") || valid.equals("s") )) break;            
        }
    }
}
