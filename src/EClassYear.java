
public enum EClassYear {
	
	FRESHMAN(1),
	SOPHMORE(2),
	JUNIOR(3),
	SENIOR(4),
	SUPERSENIOR(5);
	
	private int classyear;
	
	private EClassYear(int year){
		this.classyear = year;
	}

	public int getEClassYear(){
		return this.classyear;
	}
}
