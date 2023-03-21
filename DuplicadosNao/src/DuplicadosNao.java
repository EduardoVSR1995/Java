import java.util.*;

public class DuplicadosNao{
    public static List array(boolean value){
        List<Integer> array = new ArrayList<>(); 
        for(int i = 0 ; i<=10000; i++){
            if(value) {
                array.add(new Random().nextInt(11));
            }else{
                array.add(i);
            }
        }

        return array;
    }
    public static void main(String[] args){
        List arrayJob = array(false);
        List arrayIter = array(true);
        Hashtable <String, Boolean> hash = new Hashtable<>();
        String value = "";
        String stringJob = "";
        String stringIter = "";
        long timeInit = System.currentTimeMillis();
        for(int i = 0 ; i < arrayJob.size() ; i++ ){
            stringJob = ""+arrayJob.get(i);
            stringIter = ""+arrayIter.get(i);
            
            hash.put(stringJob, true);

            Boolean validation = hash.containsKey(stringIter);            
            if(validation){ 
               value += arrayIter.get(i)+" ";
            }
        }   
        long timeEnd = System.currentTimeMillis() ;
        
        System.out.println("Quantidade de strings encontradas " +value.length() +". Tempo de execução hashtable: " +(timeEnd - timeInit));
        
        value = "";
        long timeInit1 = System.currentTimeMillis();
        for(int i = 0 ; i < arrayJob.size() ; i++ ){
            for(int r = i; r < arrayIter.size(); r++ ){
                if(arrayJob.get(i) == arrayIter.get(r)){
                    value += arrayIter.get(r)+" ";
                }
            }   
        }
        long timeEnd1 = System.currentTimeMillis();

        System.out.println( "Quantidade de strings encontradas "+value.length()+ ". Tempo de execução com for aninhado: " +(timeEnd1 - timeInit1));
    }
}
