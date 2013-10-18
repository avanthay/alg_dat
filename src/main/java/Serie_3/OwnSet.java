package Serie_3;

public class OwnSet extends OwnList {

	public OwnSet() {
	}

	// Die Methoden doesExist, addBeginning und addEnding können von der
	// Superklasse aufgerufen werden

	public void merge(OwnSet set) {
		OwnInteger element = set.getFirstElement();
		if (element == null){
			return;
		}
		while (element.getNext() != null) {
			if (this.doesExist(element) == false) {
				this.addBeginning(new OwnInteger(element.get()));
			}
			element = element.getNext();
		}
		if (this.doesExist(element) == false) {
			this.addBeginning(new OwnInteger(element.get()));
		}
	}

	public void slice(OwnSet set) {
		OwnInteger element = getFirstElement();
		if (element == null){
			return;
		}
		while (element.getNext() != null) {
			if (set.doesExist(element) == false) {
				this.removeElement(element);
			}
			element = element.getNext();
		}
		if (set.doesExist(element) == false) {
			this.removeElement(element);
		}
	}
	
	@Override
	public int getSize(){
		int size = 1;
		OwnInteger element = copyWithoutDuplicate().getFirstElement();
		if (element == null) {
			return 0;
		}
		while (element.getNext() != null) {
			element = element.getNext();
			size++;
		}
		return size;
	}
	
	@Override
	public int hashCode(){
		OwnInteger element = copyWithoutDuplicate().getFirstElement();
		if (element == null) {
			return 0;
		}
		int hashCode = 0;
		while (element.getNext() != null) {
			hashCode += element.get() * 17;
			element = element.getNext();
		}
		hashCode += element.get() * 17;
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof OwnSet == false) {
			return false;
		}
		if (hashCode() == ((OwnSet) obj).hashCode()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		if (getFirstElement() == null) {
			return "{}";
		}
		String string = "{";
		OwnInteger element = getFirstElement();
		while (element.getNext() != null) {
			string += element.toString() + ";";
			element = element.getNext();
		}
		string += element.toString() + "}";
		return string;
	}
	
	
	private OwnList copyWithoutDuplicate(){
		OwnSet set = new OwnSet();
		OwnInteger element = getFirstElement();
		if (element == null) {
			return set;
		}
		while(element.getNext() != null){
			if (set.doesExist(element) == false){
				set.addBeginning(new OwnInteger(element.get()));
			}
			element = element.getNext();
		}
		if (set.doesExist(element) == false){
			set.addBeginning(new OwnInteger(element.get()));
		}		
		return set;
	}
}
