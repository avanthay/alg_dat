package Serie_3;

public class OwnList {
	
	private OwnInteger firstElement;
	
	public OwnList(){
	}
	
	public void addBeginning(OwnInteger element){
		if (getSize() < 1){
			this.firstElement = element;
		} else {
			element.setNext(firstElement);
			this.firstElement = element;
		}
	}
	
	public void addEnd(OwnInteger element){
		if (getSize() < 1){
			this.firstElement = element;
		} else {
			getLastElement().setNext(element);
		}
	}
	
	public OwnInteger getFirstElement(){
		return this.firstElement;
	}
	
	public OwnInteger getLastElement(){
		OwnInteger element = firstElement;
		while(element.getNext() != null){
			element = element.getNext();
		}
		return element;
	}
	
	public int getSize(){
		int size = 1;
		OwnInteger element = firstElement;
		if (element == null){
			return 0;
		}
		while(element.getNext() != null){
			element = element.getNext();
			size++;
		}
		return size;
	}
	
	public boolean doesExist(OwnInteger element){
		OwnInteger elmt = firstElement;
		if (element.equals(elmt)){
			return true;
		}
		while(elmt.getNext() != null){
			if(element.equals(elmt)){
				return true;
			}
			elmt = elmt.getNext();
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		if (firstElement == null){
			return 0;
		}
		int hashCode = 0;
		int pos = 1;
		OwnInteger element = firstElement;
		while(element.getNext() != null){
			hashCode += element.get()*pos*17;
			element = element.getNext();
			pos++;
		}
		hashCode += element.get()*pos*17;
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof OwnList == false){
			return false;
		}
		if (hashCode() == ((OwnList)obj).hashCode()){
			return true;
		}
		return false;
	}
	
	

}
