

//REFACTOR - Large Class
//SMELL: #SmellType(Large Class) 
//EXPLANATION smellname : Large Class 
//EXPLANATION description :A class contains many fields/methods/lines of code. 
//EXPLANATION possible repairs :Duplicate Observed Data, Extract Interface, Extract Class, Extract Subclass, 
 public class largeAndSwitch {
	public void switchsmell() {

		
//REFACTOR - Switch Statement
//SMELL: #SmellType(Switch Statements) 
//EXPLANATION smellname : Switch Statements 
//EXPLANATION description :Relatively rare use of switch and case operators is one of the hallmarks of object-oriented code. Often code for a single switch can be scattered in different places in the program. When a new condition is added, you have to find all the switch code and modify it. 
//EXPLANATION possible repairs :Replace Conditional with Polymorphism, Replace Parameter with Explicit Methods, Replace Type Code with State/Strategy, Replace Type Code with Subclasses, Introduce Null Object, Move Method, 
 switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
	}

	public void a() {
	}

	public void b() {
	}

	public void c() {
	}

	public void d() {
	}

	public void e() {
	}

	public void f() {
	}

	public void g() {
	}

	public void h() {
	}

	public void i() {
	}

	public void j() {
	}

	public void k() {
	}

	public void l() {
	}

	public void m() {
	}

	public void n() {
	}

	public void o() {
	}

	public void p() {
	}

	public void q() {
	}

	public void r() {
	}

	public void s() {
	}

	public void t() {
	}

	public void u() {
	}
}
