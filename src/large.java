package sk.fiit.dp.refactor;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//REFACTOR - Large Class
  // smelltag end   : LC1 //SMELL: #SmellType(Large Class)
 public class App extends Application {

	int x = call1().call2().call3().call4();

	//REFACTOR - Feature Envy
  // smelltag end   : FE1 //SMELL: #SmellType(Feature Envy)
 public void featureEnvy() {
		mobilePhone.getAreaCode();
		mobilePhone.getPrefix();
		mobilePhone.getNumberA();
		mobilePhone.getNumberC();

	}// smelltag start : FE1 

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

}// smelltag start : LC1 
