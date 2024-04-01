
public class Dynamic2 extends Dynamic{
	public Two login() {
		Two t=new Two();
		System.out.println("child");
		return t;
	}
	public static void main(String[] args) {
		Dynamic d=new Dynamic2();
		d.login();
		Dynamic d1=new Dynamic();
		d1.login();
		

	}

}
