public class RefactorTest {

	public static void main(String[] args) {
	try {
			System.out.println("Testing");
		} catch(Exception e) {
			
		}
		try {
			System.out.println("Testing");
		} catch(Exception e) {
			
		}	
		
		try {
			System.out.println("Testing2");
		} catch(Exception e) {
			throw e;
		}
	}
	
	private void managePerson(String name, String surrName, int age, int id, int id_card, String city, String address) {

	}
}
