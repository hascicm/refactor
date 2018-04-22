package testpackage;

public class RefactorTest {

	public static void main(String[] args) {
	try {
			System.out.println("Testing");
		} //Refactor - Empty Catch Clausule
  // smelltag end   : ECC1 //SMELL: #SmellType(Empty Catch Clausule)
 catch(Exception e) {
			
		}// smelltag start : ECC1 
		try {
			System.out.println("Testing");
		} //Refactor - Empty Catch Clausule
  // smelltag end   : ECC2 //SMELL: #SmellType(Empty Catch Clausule)
 catch(Exception e) {
			
		}// smelltag start : ECC2 	
		
		//REFACTOR - Catch and Rethrow
    // smelltag end   : CR1 //SMELL: #SmellType(Catch and Rethrow)
 try {
			//REFACTOR - Message Chains
  // smelltag end   : MCH1 //SMELL: #SmellType(Message Chains)
 chain = A().B().C().D().E();// smelltag start : MCH1 
			System.out.println("Testing2");
		} catch(Exception e) {
			throw e;
		}// smelltag start : CR1 
	int i = 5; 
	i *= //REFACTOR - Magic Number
  // smelltag end   : MAGIC1 //SMELL: #SmellType(Magic Numbers)
 156// smelltag start : MAGIC1 ; 
	
	}
	
	//REFACTOR - Long Parameter List
  // smelltag end   : LPL1 //SMELL: #SmellType(Long Parameter List)
 private void managePerson(String name, String surrName, int age, int id, int id_card, String city, String address) {

	}// smelltag start : LPL1 
	public class inner {
		public static void ineerMethod(){
			//REFACTOR - Catch and Rethrow
    // smelltag end   : CR2 //SMELL: #SmellType(Catch and Rethrow)
 try {
				System.out.println("Testing2");
			} catch(Exception e) {
				throw e;
			}// smelltag start : CR2 
		}
	
	} 
}
