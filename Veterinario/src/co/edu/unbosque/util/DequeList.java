package co.edu.unbosque.util;

public class DequeList<T> extends MyDoubleLinkedList<T> implements Deque<T> {

	private DNode<T> tail;
	private int size;

	public DequeList() {
		head = new DNode<T>();
		tail = new DNode<T>();
		head.setNext(tail);
		head.setPrevious(head);
		size = 0;
	}

	@Override
	public void insertLast(T info) {
		DNode<T> t = this.tail;
		DNode<T> temporal = new DNode<T>();
		temporal.setInfo(info);
		temporal.setPrevious(t);
		t.setNext(temporal);
		tail = temporal;
		if (size == 0) {
			head = temporal;
		}
		size++;
	}

	@Override
	public T removeLast() {
		if (tail == null) {
			return null;

		}
		T value = tail.getInfo();
		tail = tail.getPrevious();
		size--;
		return value;
	}

	@Override
	public void insertFirst(T info) {
		DNode<T> h = this.head;
		DNode<T> temporal = new DNode<T>();
		temporal.setInfo(info);
		temporal.setNext(h);
		h.setPrevious(temporal);
		this.head = temporal;
		if (size == 0) {
			tail = temporal;
		}
		size++;

	}

	@Override
	public T removeFirst() {
		if (head == null) {
			return null;
		}
		T value = this.head.getInfo();
		head = head.getNext();
		size--;
		return value;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public DNode<T> getTail() {
		return tail;
	}

	public void setTail(DNode<T> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Head [");
		DNode<T> aux = head;
		for (int i = 0; i < size; i++) {
			sb.append(aux.getInfo());
			if (aux == tail) {
				break;
			}
			sb.append("-");
			aux = aux.getNext();
		}
		sb.append("] tail");
		return sb.toString();
	}

}
