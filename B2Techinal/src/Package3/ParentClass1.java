package Package3;

public class ParentClass1 {
	
	//non static variable//
	int defultvariable120 = 900;
	public int  publicvariable120 = 1000;
	private int privatevariable120 = 1100;
	protected int protectedvariable120 = 1200;
	
	//static variable//
	static int defultvariable121 = 1300;
	public static int publicvariable121 = 1400;
	private static int privatevariable121 = 1500;
	protected static int protectedvariable121 = 1600; 
	
	
	public static void main(String[]args) {
		ParentClass1 f1=new ParentClass1();
		System.out.println(f1.defultvariable120);
		System.out.println(f1.privatevariable120);
		System.out.println(f1.protectedvariable120);
		System.out.println(f1.publicvariable120);
		
		System.out.println(ParentClass1.defultvariable121);
		System.out.println(ParentClass1.publicvariable121);
		System.out.println(ParentClass1.privatevariable121);
		System.out.println(ParentClass1.protectedvariable121);
	}
	
	

}
