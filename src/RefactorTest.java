package testpackage;

public class RefactorTest {

	public static void main(String[] args) {
	try {
			System.out.println("Testing");
		} 
//Refactor - Empty Catch Clausule
//SMELL: #SmellType(Empty Catch Clausule) 
catch(Exception e) {
			
		}
		try {
			System.out.println("Testing");
		} 
//Refactor - Empty Catch Clausule
//SMELL: #SmellType(Empty Catch Clausule) 
catch(Exception e) {
			
		}	
		
		
//REFACTOR - Catch and Rethrow
//SMELL: #SmellType(Catch and Rethrow) 
try {
			
//REFACTOR - Message Chains
//SMELL: #SmellType(Message Chains) 
chain = A().B().C().D().E();
			System.out.println("Testing2");
		} catch(Exception e) {
			throw e;
		}
	int i = 5; 
	i *= 
//REFACTOR - Magic Number
//SMELL: #SmellType(Magic Numbers) 
156; 
	
	}
	
	
//REFACTOR - Long Parameter List
//SMELL: #SmellType(Long Parameter List) 
private void managePerson(String name, String surrName, int age, int id, int id_card, String city, String address) {

	}
	public class inner {
		public static void ineerMethod(){
			
//REFACTOR - Catch and Rethrow
//SMELL: #SmellType(Catch and Rethrow) 
try {
				System.out.println("Testing2");
			} catch(Exception e) {
				throw e;
			}
		}
	
	} 
}
