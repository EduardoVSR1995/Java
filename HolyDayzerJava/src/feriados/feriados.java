package feriados;

import java.util.HashMap;
import java.util.Map;

public class feriados {
    private static Map<String, String> data = new HashMap<>();

    public static void feriados(){
        data.put("01/01/2023", "Confraternização mundial");
        data.put("21/02/2023", "Carnaval");
        data.put("17/04/2023", "Páscoa");
        data.put("21/04/2023", "Tiradentes");
        data.put("01/05/2023", "Dia do trabalho");
        data.put("08/06/2023", "Corpus Christi");
        data.put("07/09/2023", "Independência do Brasil");
        data.put("12/10/2023", "Nossa Senhora Aparecida");
        data.put("02/11/2023", "Finados");
        data.put("15/11/2023", "Proclamação da República");
        data.put("25/12/2023", "Natal");
    }     
    public String getFeriado(String value){
        if(!data.containsKey(value)){
            return "Não existe feriado com a data "+ value;
        }
        String result = data.get(value);
        
        return result;
    }
    public void allFeriado(){
        for(String data: data.keySet()){
            
            System.out.println(data+" => "+feriados.data.get(data));
        }
        return;
    }


}