package oopWithNLayeredApp.core.logging;

public class MainLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("mail gönderildi: " + data);
		
	}
	
}
