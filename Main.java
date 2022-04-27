package ie.gmit.classes;

public class Main {
	
	public static void main(String[] args) {
		
		//create a new keyboard object
		Keyboard keyboardObject1 = new Keyboard();
		Keyboard keyboardObject2 = new Keyboard();
		Keyboard keyboardObject3 = new Keyboard("Blue", 15, false);
		Keyboard keyboardObject4 = new Keyboard("Pink");
		
		keyboardObject1.setColour("Black");
		keyboardObject1.setNumKeys(20);
		keyboardObject1.setCapsLockOn(false);
		keyboardObject1.keyboardGreatMessage();
		System.out.println("Old colour = " + keyboardObject1.upgradeColour("Red")); 
		
		System.out.println( keyboardObject1.getColour()  );
		System.out.println( keyboardObject1.getNumKeys()  );
		System.out.println( keyboardObject1.getCapsLockOn()  );
		
		keyboardObject2.setColour("White");
		keyboardObject2.setNumKeys(10);
		keyboardObject2.setCapsLockOn(true);
		keyboardObject2.keyboardGreatMessage();
		
		System.out.println( keyboardObject2.getColour()  );
		System.out.println( keyboardObject2.getNumKeys()  );
		System.out.println( keyboardObject2.getCapsLockOn()  );
		
		System.out.println( keyboardObject3.getColour()  );
		System.out.println( keyboardObject3.getNumKeys()  );
		System.out.println( keyboardObject3.getCapsLockOn()  );
		
		System.out.println( keyboardObject4.getColour()  );
		System.out.println( keyboardObject4.getNumKeys()  );
		System.out.println( keyboardObject4.getCapsLockOn()  );
		
	}

	

}
