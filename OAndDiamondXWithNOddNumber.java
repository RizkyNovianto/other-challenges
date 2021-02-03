public class OAndDiamondXWithNOddNumber
{
	public static void main(String[] args) {
		
		int n = 11;
		int awalX = (n/2) + 1;
		int akhirX = (n/2) + 1;
		boolean flag = false;
		
		for (int i= 1; i <= n; i++){
		    
		    for(int j = 1; j <= n; j++) {
		        
		        if( i == 1 || i == n){
		            
		            System.out.print("O");
		            
		        } else {

		            if (j >= awalX && j <= akhirX){
		                
		                System.out.print("X");
		                continue;
		                
		            } else {
		            
		                System.out.print("O");
		                
		            }
		        }
		        
		    }
		    
		    System.out.println();
		    
		    if((akhirX + 1 >= n) || flag){
		        
		        awalX += 1;
		        akhirX -= 1;
		        flag = true;
		        
		    } else if(i >= 2 && !flag) {
		        
		        awalX -= 1;
		        akhirX += 1;
		        
		    }
		    
		}
	
	}
}
