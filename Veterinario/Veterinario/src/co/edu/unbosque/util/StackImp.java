package co.edu.unbosque.util;

public class StackImp<T> implements Stack<T> {
	private DequeList<T> infos;

	public StackImp() {
		infos = new DequeList<T>();
	}

	@Override
	public void push(T info) {
		// TODO Auto-generated method stub
		infos.insertFirst(info);

	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return infos.removeFirst();

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return infos.size();
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		T temp = infos.removeFirst();
		infos.insertFirst(temp);
		return temp;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Top \n");
		DNode<T> aux = infos.getHead();
		for (int i = 0; i < infos.size(); i++) {
			sb.append(aux.getInfo());
			if (aux == infos.getTail()) {
				break;
			}
			sb.append("\n");
			aux = aux.getNext();
		}
		sb.append("\n Bottom");
		return sb.toString();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return infos.isEmpty();
	}

}
