package Serie_4;

import java.util.List;

public class OwnTree {

	private OwnElement rootNode;

	public OwnTree() {
	}

	public OwnTree(OwnElement rootNode) {
		this.rootNode = rootNode;
	}

	public void addElement(OwnElement ownElement) {
		if (rootNode == null) {
			this.rootNode = ownElement;
			return;
		}
		OwnElement parentElement = null;
		OwnElement childElement = this.rootNode;
		while (childElement != null) {
			parentElement = childElement;
			if (ownElement.getValue() < childElement.getValue()) {
				childElement = childElement.getLeftElement();
			} else {
				childElement = childElement.getRightElement();
			}
		}
		if (ownElement.getValue() < parentElement.getValue()) {
			parentElement.setLeftElement(ownElement);
		} else {
			parentElement.setRightElement(ownElement);
		}
	}
	
	public void addElements(List<OwnElement> elements){
		for (OwnElement ownElement : elements){
			addElement(ownElement);
		}
	}

	// getter & setter

	public OwnElement getRootNode() {
		return rootNode;
	}

	public void setRootNode(OwnElement rootNode) {
		this.rootNode = rootNode;
	}

}
