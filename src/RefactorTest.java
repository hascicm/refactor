package testpackage;

public class RefactorTest {

	public static void main(String[] args) {
	try {
			System.out.println("Testing");
		} \n//Refactor - Empty Catch Clausule\n// begining of smell with identificator: ECC1 
//SMELL: #SmellType(Empty Catch Clausule)
 
//EXPLANATION smellname : Empty Catch Clausule 
//EXPLANATION description :Catch should at least contain logging mechanism for exception 
//EXPLANATION possible repairs :Log Exception, 
 catch(Exception e) {
			
		}
// end of smell with identificator: ECC1 
		try {
			System.out.println("Testing");
		} \n//Refactor - Empty Catch Clausule\n// begining of smell with identificator: ECC2 
//SMELL: #SmellType(Empty Catch Clausule)
 
//EXPLANATION smellname : Empty Catch Clausule 
//EXPLANATION description :Catch should at least contain logging mechanism for exception 
//EXPLANATION possible repairs :Log Exception, 
 catch(Exception e) {
			
		}
// end of smell with identificator: ECC2 	
		
		\n//REFACTOR - Catch and Rethrow\n// begining of smell with identificator: CR1 
//SMELL: #SmellType(Catch and Rethrow)
 
//EXPLANATION smellname : Catch and Rethrow 
//EXPLANATION description :Catching exception and rethrowing it is bad, it should be handled in method which catches the exception. 
//EXPLANATION possible repairs :Remove Exception Throw, Remove Try-Catch, 
 try {
			\n//REFACTOR - Message Chains\n// begining of smell with identificator: MCH1 
//SMELL: #SmellType(Message Chains)
 
//EXPLANATION smellname : Message Chains 
//EXPLANATION description :A message chain occurs when a client requests another object, that object requests yet another one, and so on. These chains mean that the client is dependent on navigation along the class structure. Any changes in these relationships require modifying the client. 
//EXPLANATION possible repairs :Extract Method, Hide Delegate, Move Method, 
 chain = A().B().C().D().E();
// end of smell with identificator: MCH1 
			System.out.println("Testing2");
		} catch(Exception e) {
			throw e;
		}
// end of smell with identificator: CR1 
	int i = 5; 
	i *= \n//REFACTOR - Magic Number\n// begining of smell with identificator: MAGIC1 
//SMELL: #SmellType(Magic Numbers)
 
//EXPLANATION smellname : Magic Numbers 
//EXPLANATION description :Magic constant should be replaced with constant 
//EXPLANATION possible repairs :Replace Magic Number with Symbolic Constant, 
 156
// end of smell with identificator: MAGIC1 ; 
	
	}
	
	\n//REFACTOR - Long Parameter List\n// begining of smell with identificator: LPL1 
//SMELL: #SmellType(Long Parameter List)
 
//EXPLANATION smellname : Long Parameter List 
//EXPLANATION description :There are too many paramethers for method 
//EXPLANATION possible repairs :Preserve Whole Object, Replace Parameter with Method, Introduce Parameter Object, 
 private void managePerson(String name, String surrName, int age, int id, int id_card, String city, String address) {

	}
// end of smell with identificator: LPL1 
	public class inner {
		public static void ineerMethod(){
			\n//REFACTOR - Catch and Rethrow\n// begining of smell with identificator: CR2 
//SMELL: #SmellType(Catch and Rethrow)
 
//EXPLANATION smellname : Catch and Rethrow 
//EXPLANATION description :Catching exception and rethrowing it is bad, it should be handled in method which catches the exception. 
//EXPLANATION possible repairs :Remove Exception Throw, Remove Try-Catch, 
 try {
				System.out.println("Testing2");
			} catch(Exception e) {
				throw e;
			}
// end of smell with identificator: CR2 
		}
	
	} 
}
