
public class CastTest extends CivilEnginner{

	public static void main(String[] args) {

		
		Engineer e = new CivilEnginner();   // upcasting 
		e.work();
		
		Engineer e1 = new SoftwareEngineer();  // upcasting 
		e1.work();  
		
		SoftwareEngineer s = (SoftwareEngineer) new Engineer();
		s.work();
		
	}
}
