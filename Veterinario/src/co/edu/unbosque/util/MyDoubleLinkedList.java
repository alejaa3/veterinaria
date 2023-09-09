package co.edu.unbosque.util;

public class MyDoubleLinkedList<T> {
	protected DNode<T> head;
	protected DNode<T> currentPosition;

	public MyDoubleLinkedList() {

	}

	public DNode<T> getHead() {
		return head;
	}

	public void setHead(DNode<T> head) {
		this.head = head;
	}

	public DNode<T> getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(DNode<T> currentPosition) {
		this.currentPosition = currentPosition;
	}

	public void forward(int... numposition) { // multiatrobutos
		if (numposition[0] > 0 && head != null) {
			int forwardPosition = numposition[0];
			if (currentPosition == null) {
				currentPosition = head;
				forwardPosition--;

			}
			while (currentPosition.getNext() != null && forwardPosition > 0) {
				currentPosition = currentPosition.getNext();
				forwardPosition--;
			}
		}
	}
	public void insert(T data) {
		DNode<T> temporal=new DNode<T>(data);
		if(currentPosition==null) {
			temporal.setNext(head);
			if(head!=null) {
				head.setPrevious(temporal);
			}
			head=temporal;
		}else{
			temporal.setNext(currentPosition.getNext());
			temporal.setPrevious(currentPosition);
			if(currentPosition.getNext()!=null){
				currentPosition.getNext().setPrevious(temporal);
			}
			currentPosition.setNext(temporal);
		}
		currentPosition=temporal;
		
	}
	public T extract() {
		T info=null;
		if(currentPosition!=null) {
			info=currentPosition.getInfo();
			if(head==currentPosition) {
				head=currentPosition.getNext();
			}else {
				currentPosition.getPrevious().setNext(currentPosition.getNext());
			}
			if(currentPosition.getNext()!=null){
				currentPosition.getNext().setPrevious(currentPosition.getPrevious());
			}
			currentPosition=currentPosition.getNext();
		}
		return info;
	}//plurales para listas y contenedores
	public void backwards(int ...numPosition ) {
		if(numPosition[0]<=0 || head==null||currentPosition==null) {
			return;
		}
		int backwardsPosition=numPosition[0];
		while(currentPosition!=null &&backwardsPosition>0) {
			currentPosition=currentPosition.getPrevious();
			backwardsPosition--;
		}
	}
	@Override
	public String toString() {
		DNode<T> temporal=head;
		StringBuilder sb= new StringBuilder();
		while(temporal!=null) {
			sb.append(temporal.getInfo());
			if(temporal.getNext()!=null) {
				sb.append("<-->");
			}temporal=temporal.getNext();
		}
		return sb.toString();
	}
}



















