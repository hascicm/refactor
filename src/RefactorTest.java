public class RefactorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	private void managePerson(String name, String surrName, int age, int id, int id_card, String city, String address) {
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
}