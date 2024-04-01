
public class Static {
	private static void login(int a,int b) {
		System.out.println(a+"  "+b);
	}
    public final void login(String h,String j) {
		System.out.println(h+"  "+j);
	}
    protected final void login(int s,String j) {
		System.out.println(s+"  "+j);
	}
   public Emp login(Emp u) {
    	Emp p=new Emp();
    	return p;
    }
	public static void main(String[] args) {
		Static s= new Static();
        s.login(10, 20);
        s.login("bhuvna", "slokam");
        s.login(20,"bhuvana"); 
        
        //access modifiers, static,final methods can be overloaded
	}

}
