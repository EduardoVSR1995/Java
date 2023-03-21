public class DuplicadosNao{
    int[] array1 = {1,2,3,4,5,6,7,44,55,66,77}; 
    int[] array2 = {12,324,53,74,85,96,17,44,55,66,77}; 
    public static void main(String[] args) throws Exception {
        int[] arrayJob = new DuplicadosNao().array1;
        int[] arrayIter = new DuplicadosNao().array2;
        String value = "";
        for(int i = 0 ; i < arrayJob.length ; i++ ){
            for(int r = 0; r < arrayIter.length; r++ ){
                if(arrayJob[i] == arrayIter[r]){
                    value += arrayIter[r]+" ";
                }
            }   
        }
        System.out.println(value);
    }
}
