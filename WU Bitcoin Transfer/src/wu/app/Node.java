package wu.app;

public class Node {
	private String status;
	private Transaction t1;
	private Transaction t2;
	private Transaction t3;
	private Node nextNode;

	public Node() {
		status="PENDING";
		t1=new Transaction();
		t2=new Transaction();
		t3=new Transaction();
		nextNode = null;

	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Transaction getT1() {
		return t1;
	}

	public void setT1(Transaction t1) {
		this.t1 = t1;
	}

	public Transaction getT2() {
		return t2;
	}

	public void setT2(Transaction t2) {
		this.t2 = t2;
	}

	public Transaction getT3() {
		return t3;
	}

	public void setT3(Transaction t3) {
		this.t3 = t3;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
}
