package Loop;

public class Mobile {
	String mic = "Mic";
	String sound = "Sound";
	String camera = "Camera";
	int price = 200;
	
	static void mic()
	{
		System.out.println("Mic");
	}
	static void sound()
	{
		System.out.println("Sound");
	}
	static void camera()
	{
		System.out.println("Camera");
	}
	public static void main(String[]args)
	{
		Mobile.mic();
		Mobile.sound();
}
