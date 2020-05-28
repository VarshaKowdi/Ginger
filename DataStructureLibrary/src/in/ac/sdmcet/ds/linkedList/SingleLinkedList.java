package in.ac.sdmcet.ds.linkedList;
/**
 * 
 * @author dshekhar
 *
 * @param <T>
 */
public class SingleLinkedList<T> implements LinkedList<T> {
	private SingleLinkedNode<T> head = null;
    
	//add elements to the list
	@Override
	public void add(T data) {
		if (head == null) {
			head = new SingleLinkedNode<T>(data);
		} else {
			SingleLinkedNode<T> node = head;
			while (node.getNext() != null) {
				node = node.getNext();
			}
			node.setNext(new SingleLinkedNode<T>(data));
		}
	}

	@Override
	public T remove(int i) {
		return null;
	}

	@Override
	public T get(int i) {
		return null;
	}

}
