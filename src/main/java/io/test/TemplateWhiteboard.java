package io.test;

public class TemplateWhiteboard {

	public static void main(String[] args) {
		int i = 1000000000;
		long l = 1000000000L;
		
		System.out.println(i + ":" +l);
		
		TemplateWhiteboard t = new TemplateWhiteboard();
		t.doSomthing(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	private void doSomthing(Runnable r) {
		// TODO Auto-generated method stub

	}

}
