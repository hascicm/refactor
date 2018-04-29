package testpackage;

public class RefactorTest {

	public static void main(String[] args) {
	try {
			System.out.println("Testing");
		} 
//Refactor - Empty Catch Clausule
//begining of smell with identificator: ECC1 
//SMELL: #SmellType(Empty Catch Clausule)
 
catch(Exception e) {
			
		}
//end of smell with identificator: ECC1 
		try {
			System.out.println("Testing");
		} 
//Refactor - Empty Catch Clausule
//begining of smell with identificator: ECC2 
//SMELL: #SmellType(Empty Catch Clausule)
 
catch(Exception e) {
			
		}
//end of smell with identificator: ECC2 	
		
		
//REFACTOR - Catch and Rethrow
//begining of smell with identificator: CR1 
//SMELL: #SmellType(Catch and Rethrow)
 
try {
			
//REFACTOR - Message Chains
//begining of smell with identificator: MCH1 
//SMELL: #SmellType(Message Chains)
 
chain = A().B().C().D().E();
//end of smell with identificator: MCH1 
			System.out.println("Testing2");
		} catch(Exception e) {
			throw e;
		}
//end of smell with identificator: CR1 
	int i = 5; 
	i *= 
//REFACTOR - Magic Number
//begining of smell with identificator: MAGIC1 
//SMELL: #SmellType(Magic Numbers)
 
156
//end of smell with identificator: MAGIC1 ; 
	
	}
	
	
//REFACTOR - Long Parameter List
//begining of smell with identificator: LPL1 
//SMELL: #SmellType(Long Parameter List)
 
private void managePerson(String name, String surrName, int age, int id, int id_card, String city, String address) {

	}
//end of smell with identificator: LPL1 
	public class inner {
		public static void ineerMethod(){
			
//REFACTOR - Catch and Rethrow
//begining of smell with identificator: CR2 
//SMELL: #SmellType(Catch and Rethrow)
 
try {
				System.out.println("Testing2");
			} catch(Exception e) {
				throw e;
			}
//end of smell with identificator: CR2 
		}
	
	} 
}
