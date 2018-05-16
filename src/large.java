
//SMELL: #SmellType(This file "large.java" should be located in "sk\fiit\dp\refactor" directory, not in "C:\Users\Lukas\AppData\Local\Temp\Refactor556670189332869222756219274906678471\src". [SONAR])

//SMELL: #SmellType(1 duplicated blocks of code must be removed. [SONAR])

//SMELL: #SmellType(Remove this unused import 'javax.ws.rs.ApplicationPath'. [SONAR])
package sk.fiit.dp.refactor;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


//REFACTOR - Large Class
//begining of smell with identificator: LC1 
//SMELL: #SmellType(Large Class) 
public class App extends Application {

	int x = call1().call2().call3().call4();

	
//REFACTOR - Feature Envy
//begining of smell with identificator: FE1 
//SMELL: #SmellType(Feature Envy) 
public void featureEnvy() {
		mobilePhone.getAreaCode();
		mobilePhone.getPrefix();
		mobilePhone.getNumberA();
		mobilePhone.getNumberC();

	}
//end of smell with identificator: FE1 

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])

	public void a() {

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
	}


//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
	public void b() {
	}

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])

	public void c() {

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
	}


//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
	public void d() {
	}

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])

	public void e() {

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
	}


//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
	public void f() {
	}

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])

	public void g() {

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
	}


//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
	public void h() {
	}

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])

	public void i() {

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
	}


//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
	public void j() {
	}

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])

	public void k() {

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
	}


//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
	public void l() {
	}

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])

	public void m() {

//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
	}


//SMELL: #SmellType(Add a nested comment explaining why this method is empty, throw an UnsupportedOperationException or complete the implementation. [SONAR])
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
//end of smell with identificator: LC1 
