package co.edu.unbosque.util;

public class QueueImp <T>implements Queue<T>{
private DequeList <T> infos;
	
	
	
	public QueueImp() {
		infos=new DequeList <T> ();
}

	@Override
	public void enqueue(T info) {
		infos.insertLast(info);
		
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		return infos.removeFirst();//tambien se puede con last y first en el otro
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return infos.size();
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		T temp=infos.removeFirst();
		infos.insertFirst(temp);
		return temp;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Front [");
		DNode<T> aux=infos.getHead();
		for(int i=0;i<infos.size(); i++) {
			sb.append(aux.getInfo());
			if(aux==infos.getTail()) {
				break;
			}
			sb.append("-");
			aux=aux.getNext();
		}
		sb.append("] Back");
		return sb.toString();
	}

}
