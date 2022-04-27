package ie.gmit.classes;

public class Keyboard {
	
	// instance variables
	private String colour;
	private int numKeys;
	private boolean capsLockOn;
	
	// default constructor
	public Keyboard() {
		this.colour = null;
		this.numKeys = 0;
		this.capsLockOn = false;
		
	}
	public Keyboard(String colour) {
		this.colour = colour;
		
	}
	
	public Keyboard(String colour, int numKeys, boolean capsLockOn) {
		this(colour);
		this.numKeys = numKeys;
		this.capsLockOn = capsLockOn;
		
	}
	
	// Getters and Setters
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getNumKeys() {
		return numKeys;
	}
	
	public void setNumKeys(int numKeys) {
		this.numKeys = numKeys;
	}
	
	public boolean getCapsLockOn() {
		return capsLockOn;
	}
	
	public void setCapsLockOn(boolean capsLockOn) {
		this.capsLockOn = capsLockOn;
	}

	public void keyboardGreatMessage() {
		System.out.println("This "+ colour +" keyboard is great.");
	}
	
	public String upgradeColour(String newColour) {
		// store old colour
		String oldColour = this.colour;
		// upgrade colour
		this.colour = newColour;
		return oldColour;
	}
}
