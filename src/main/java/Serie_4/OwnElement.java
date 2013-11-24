package Serie_4;

public class OwnElement {
	
	private int value;
	private OwnElement leftElement;
	private OwnElement rightElement;
	
	public OwnElement(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	@Override
	public String toString(){
		return String.valueOf(this.value);
	}
	
	
	// getter & setter

	public void setValue(int value) {
		this.value = value;
	}

	public OwnElement getLeftElement() {
		return leftElement;
	}

	public void setLeftElement(OwnElement leftElement) {
		this.leftElement = leftElement;
	}

	public OwnElement getRightElement() {
		return rightElement;
	}

	public void setRightElement(OwnElement rightElement) {
		this.rightElement = rightElement;
	}

}
