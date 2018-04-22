package testpackage;

public class RefactorTest {

	public static void main(String[] args) {
	try {
			System.out.println("Testing");
		} //Refactor - Empty Catch Clausule
  //SMELL: #SmellType(Empty Catch Clausule)
 //EXPLANATION smellname : Empty Catch Clausule 
//EXPLANATION description :Catch should at least contain logging mechanism for exception 
//EXPLANATION possible repairs :Log Exception, 
 catch(Exception e) {
			
		}
		try {
			System.out.println("Testing");
		} //Refactor - Empty Catch Clausule
  //SMELL: #SmellType(Empty Catch Clausule)
 //EXPLANATION smellname : Empty Catch Clausule 
//EXPLANATION description :Catch should at least contain logging mechanism for exception 
//EXPLANATION possible repairs :Log Exception, 
 catch(Exception e) {
			
		}	
		
		//REFACTOR - Catch and Rethrow
    //SMELL: #SmellType(Catch and Rethrow)
 //EXPLANATION smellname : Catch and Rethrow 
//EXPLANATION description :Catching exception and rethrowing it is bad, it should be handled in method which catches the exception. 
//EXPLANATION possible repairs :Remove Exception Throw, Remove Try-Catch, 
 try {
			//REFACTOR - Message Chains
  //SMELL: #SmellType(Message Chains)
 //EXPLANATION smellname : Message Chains 
//EXPLANATION description :A message chain occurs when a client requests another object, that object requests yet another one, and so on. These chains mean that the client is dependent on navigation along the class structure. Any changes in these relationships require modifying the client. 
//EXPLANATION possible repairs :Extract Method, Hide Delegate, Move Method, 
 chain = A().B().C().D().E();
			System.out.println("Testing2");
		} catch(Exception e) {
			throw e;
		}
	int i = 5; 
	i *= //REFACTOR - Magic Number
  //SMELL: #SmellType(Magic Numbers)
 //EXPLANATION smellname : Magic Numbers 
//EXPLANATION description :Magic constant should be replaced with constant 
//EXPLANATION possible repairs :Replace Magic Number with Symbolic Constant, 
 156; 
	
	}
	
	//REFACTOR - Long Parameter List
  //SMELL: #SmellType(Long Parameter List)
 //EXPLANATION smellname : Long Parameter List 
//EXPLANATION description :There are too many paramethers for method 
//EXPLANATION possible repairs :Preserve Whole Object, Replace Parameter with Method, Introduce Parameter Object, 
 private void managePerson(String name, String surrName, int age, int id, int id_card, String city, String address) {

	}
	public class inner {
		public static void ineerMethod(){
			//REFACTOR - Catch and Rethrow
    //SMELL: #SmellType(Catch and Rethrow)
 //EXPLANATION smellname : Catch and Rethrow 
//EXPLANATION description :Catching exception and rethrowing it is bad, it should be handled in method which catches the exception. 
//EXPLANATION possible repairs :Remove Exception Throw, Remove Try-Catch, 
 try {
				System.out.println("Testing2");
			} catch(Exception e) {
				throw e;
			}
		}
	
	} 
}
