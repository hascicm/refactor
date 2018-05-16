
//SMELL: #SmellType(This file "RefactorTest.java" should be located in "testpackage" directory, not in "C:\Users\Lukas\AppData\Local\Temp\Refactor556670189332869222756219274906678471\src". [SONAR])
package testpackage;

public class RefactorTest {

	
//REFACTOR - Long Method
//begining of smell with identificator: LM1 
//SMELL: #SmellType(Long Method) 
public static void main(String[] args) {

//SMELL: #SmellType(Replace this use of System.out or System.err by a logger. [SONAR])

//SMELL: #SmellType(Either remove or fill this block of code. [SONAR])
	try {
			System.out.println("Testing");
		} 
//Refactor - Empty Catch Clausule
//begining of smell with identificator: ECC1 
//SMELL: #SmellType(Empty Catch Clausule) 
catch(Exception e) {
			
		}
//end of smell with identificator: ECC1 

//SMELL: #SmellType(Replace this use of System.out or System.err by a logger. [SONAR])

//SMELL: #SmellType(Either remove or fill this block of code. [SONAR])
		try {
			System.out.println("Testing");
		} catch(Exception e) {

//SMELL: #SmellType(Replace this use of System.out or System.err by a logger. [SONAR])
			
		}	
		
		
//REFACTOR - Catch and Rethrow
//begining of smell with identificator: CR1 
//SMELL: #SmellType(Catch and Rethrow) 
try {

//SMELL: #SmellType(Add logic to this catch clause or eliminate it and rethrow the exception automatically. [SONAR])
			
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

//SMELL: #SmellType(Remove this unused "i" local variable. [SONAR])

//SMELL: #SmellType(Remove this useless assignment to local variable "i". [SONAR])

//SMELL: #SmellType(Rename this local variable to match the regular expression '^[a-z][a-zA-Z0-9]*$'. [SONAR])

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])

//SMELL: #SmellType(Remove these unused method parameters. [SONAR])

//SMELL: #SmellType(Remove this unused private "managePerson" method. [SONAR])
	int i = 5; 
	i *= 
//REFACTOR - Magic Number
//begining of smell with identificator: MAGIC1 
//SMELL: #SmellType(Magic Numbers) 
156
//end of smell with identificator: MAGIC1 ; 
	
	}
//end of smell with identificator: LM1 
	
	
//REFACTOR - Long Parameter List
//begining of smell with identificator: LPL1 
//SMELL: #SmellType(Long Parameter List) 
private void managePerson(String name, String surrName, int age, int id, int id_card, String city, String address) {

	}
//end of smell with identificator: LPL1 

//SMELL: #SmellType(Rename this class name to match the regular expression '^[A-Z][a-zA-Z0-9]*$'. [SONAR])

//SMELL: #SmellType(Add a private constructor to hide the implicit public one. [SONAR])
	public class inner {

//SMELL: #SmellType(Replace this use of System.out or System.err by a logger. [SONAR])
		public static void ineerMethod(){

//SMELL: #SmellType(Add logic to this catch clause or eliminate it and rethrow the exception automatically. [SONAR])
			
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
