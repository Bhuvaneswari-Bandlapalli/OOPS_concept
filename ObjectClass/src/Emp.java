
public class Emp {
	private int eid;
	private String esame;
	private double esal;
	
	
	public String toString() {
		return "eid---"+eid+"   ename-----"+esame+"   esal------"+esal;

	}


	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getEsame() {
		return esame;
	}



	public void setEsame(String esame) {
		this.esame = esame;
	}



	public double getEsal() {
		return esal;
	}



	public void setEsal(double esal) {
		this.esal = esal;
	}



	public static void main(String[] args) {
		Emp p=new Emp();
		p.setEid(1);
		p.setEsame("Bhuvna");
		p.setEsal(234556.8990);
		System.out.println(p);

	}

}
