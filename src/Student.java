
public class Student extends Person{
	
	private final EClassYear classyear;

	public EClassYear getClassyear() {
		return classyear;
	}
	
	public Student(EClassYear classyear, String name, String address, double phone, String email){
		
		super(name, address, phone, email);
		this.classyear = classyear;
			
		}
	}
	
	
	
	


