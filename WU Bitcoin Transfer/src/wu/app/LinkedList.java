package wu.app;

public class LinkedList {
	protected Node head;
	private Node data;

	public LinkedList() {
		head = new Node();
	}

	public boolean isEmpty() {
		return head == null;
	}
	
	public void insertAtFront() {
		Node temp = new Node();
		temp.setNextNode(head.getNextNode());
		head.setNextNode(temp);
	}
	public boolean isNewBlockRequired() {
		Node temp = new Node();
		temp = head;
		temp = temp.getNextNode();
		if(head.getNextNode()==null||temp.getT1().isValid() && temp.getT2().isValid() && temp.getT3().isValid())
			return true;
		else
			return false;
	}
	
}
