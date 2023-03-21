import java.util.*;

public class DuplicadosNao{
    public static void aninhad(List arrayJob, List arrayIter) {
        String value = "";

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

    public static void hashTable(List arrayJob, List arrayIter){
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
    }

    public static List arrayDesorder(){
        List<Integer> array = new ArrayList<>(); 
        for(int i = 0 ; i<=10000; i++){
            array.add(new Random().nextInt(11));
        }
        return array;
    }
    public static List arrayList(){
        List<Integer> array = new ArrayList<>(); 
        for(int i = 0 ; i<=10000; i++){
            array.add(i);
        }
        return array;
    }
    public static void main(String[] args){
        List arrayJob = arrayList();
        List arrayIter = arrayDesorder();

        hashTable(arrayJob, arrayIter);
        aninhad(arrayJob, arrayIter);        
    }
}