package sk.fiit.dp.refactor.model.explanation;


//REFACTOR - Lazy Class
// begining of smell with identificator: LAZC1 
//SMELL: #SmellType(Lazy Class)
 
//EXPLANATION smellname : Lazy Class 
//EXPLANATION description :Understanding and maintaining classes always costs time and money. So if a class doesn't do enough to earn your attention, it should be deleted. 
//EXPLANATION possible repairs :Collapse Hierarchy, Inline Class, 
 
//REFACTOR - Data Class
// begining of smell with identificator: DC1 
//SMELL: #SmellType(Data Class)
 
//EXPLANATION smellname : Data Class 
//EXPLANATION description :A data class refers to a class that contains only fields and crude methods for accessing them (getters and setters). These are simply containers for data used by other classes. These classes do not contain any additional functionality and cannot independently operate on the data that they own. 
//EXPLANATION possible repairs :Encapsulate Collection, Encapsulate Field, Hide Method, Remove Setting Method, Extract Method, Move Method, 
 public class lazyAndData {
	private String refactoringCode;
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRefactoringCode() {
		return refactoringCode;
	}

	public void setRefactoringCode(String refactoringCode) {
		this.refactoringCode = refactoringCode;
	}
}
// end of smell with identificator: DC1 
// end of smell with identificator: LAZC1 
