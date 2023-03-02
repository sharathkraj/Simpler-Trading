package PageObject;

public class ClassPage {
	
	
	private static ClassPage ClassInstance;
	
	
	private  ClassPage() {
		
	}
	
	public static ClassPage getInstance() {
		
		if(ClassInstance== null) {
			ClassInstance = new ClassPage();
		}
		return ClassInstance;
	}

}
