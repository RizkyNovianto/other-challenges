public class LombaLari{

     public static void main(String []args){
        
        int lariPrimo = 2;
        int lariFibbo = 0;
        int tempFibbo = 1;
        int addFibbo = 0;
        int detik = 1;
        int detikTahanFibbo = 5;
        
        while (lariFibbo < lariPrimo){
    
            if(detik == 1){
                lariPrimo = lariPrimo * lariPrimo; 
            } else if((detik > 1) && (detik % 2 >= 1)){
               lariPrimo = detik * detik;
            }
            
            if (detik > detikTahanFibbo){
                lariFibbo = tempFibbo + addFibbo;
                addFibbo = tempFibbo;
                tempFibbo = lariFibbo;
            }
            
            System.out.println("==== Detik ke " + detik + " ===");
            System.out.println("Lari Primo = " + lariPrimo);
            System.out.println("Lari Fibbo = " +lariFibbo);
            detik += 1;
        }
        
       System.out.println("");
       System.out.println("Detik Fibbo membalap Primo = "+ detik);
       System.out.println("Dimana Lari Fibbo = " + lariFibbo + " Lari Primo = " + lariPrimo);
 
     }
}
