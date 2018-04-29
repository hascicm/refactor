package sk.fiit.dp.refactor.model.explanation;


//REFACTOR - Lazy Class
//begining of smell with identificator: LAZC1 
//SMELL: #SmellType(Lazy Class)
 

//REFACTOR - Data Class
//begining of smell with identificator: DC1 
//SMELL: #SmellType(Data Class)
 
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
//end of smell with identificator: DC1 
//end of smell with identificator: LAZC1 
