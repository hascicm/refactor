package sk.fiit.dp.refactor;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


//REFACTOR - Large Class
//SMELL: #SmellType(Large Class) 
//EXPLANATION smellname : Large Class 
//EXPLANATION description :A class contains many fields/methods/lines of code. 
//EXPLANATION possible repairs :Duplicate Observed Data, Extract Interface, Extract Class, Extract Subclass, 
 public class App extends Application {

	int x = call1().call2().call3().call4();

	
//REFACTOR - Feature Envy
//SMELL: #SmellType(Feature Envy) 
//EXPLANATION smellname : Feature Envy 
//EXPLANATION description :A method accesses the data of another object more than its own data. 
//EXPLANATION possible repairs :Extract Method, Move Method, 
 public void featureEnvy() {
		mobilePhone.getAreaCode();
		mobilePhone.getPrefix();
		mobilePhone.getNumberA();
		mobilePhone.getNumberC();

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
