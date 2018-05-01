package sk.fiit.dp.refactor.model.explanation;


//REFACTOR - Lazy Class
//SMELL: #SmellType(Lazy Class) 

//REFACTOR - Data Class
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
