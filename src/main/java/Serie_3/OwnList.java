package Serie_3;

public class OwnList {

	private OwnInteger firstElement;

	public OwnList() {
	}

	public void addBeginning(OwnInteger element) {
		if (getSize() < 1) {
			this.firstElement = element;
		} else {
			element.setNext(firstElement);
			this.firstElement = element;
		}
	}

	public void addEnd(OwnInteger element) {
		if (getSize() < 1) {
			this.firstElement = element;
		} else {
			getLastElement().setNext(element);
		}
	}

	public OwnInteger getFirstElement() {
		return this.firstElement;
	}

	public OwnInteger getLastElement() {
		OwnInteger element = firstElement;
		if (element == null){
			return null;
		}
		while (element.getNext() != null) {
			element = element.getNext();
		}
		return element;
	}

	public int getSize() {
		int size = 1;
		OwnInteger element = firstElement;
		if (element == null) {
			return 0;
		}
		while (element.getNext() != null) {
			element = element.getNext();
			size++;
		}
		return size;
	}

	public boolean doesExist(OwnInteger element) {
		OwnInteger elmt = firstElement;
		if (elmt == null){
			return false;
		}
		while (elmt.getNext() != null) {
			if (element.equals(elmt)) {
				return true;
			}
			elmt = elmt.getNext();
		}
		if (element.equals(elmt)) {
			return true;
		}
		return false;
	}

	public void removeElement(OwnInteger element) {
		OwnInteger elmt = firstElement;
		if (elmt == null){
			return;
		}
		while (elmt.equals(element)) {
			if (elmt.getNext() != null) {
				firstElement = elmt.getNext();
				elmt = elmt.getNext();
			} else {
				firstElement = null;
			}
		}
		while (elmt.getNext() != null) {
			if (elmt.getNext().equals(element)) {
				elmt.changeNext(elmt.getNext().getNext());
			} else {
				elmt = elmt.getNext();
			}
		}
	}

	@Override
	public int hashCode() {
		if (firstElement == null) {
			return 0;
		}
		int hashCode = 0;
		int pos = 1;
		OwnInteger element = firstElement;
		while (element.getNext() != null) {
			hashCode += element.get() * pos * 17;
			element = element.getNext();
			pos++;
		}
		hashCode += element.get() * pos * 17;
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OwnList == false) {
			return false;
		}
		if (hashCode() == ((OwnList) obj).hashCode()) {
			return true;
		}
		return false;
	}

}
