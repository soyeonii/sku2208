package day02;

import java.util.*;

// Stack is-a -> has-a로 변환
public class MyStack<E> {
	Vector<E> vector;

	public MyStack() {
		vector = new Vector<>();
	}

	public E push(E item) {
		vector.addElement(item);

		return item;
	}

	public synchronized E pop() {
		E obj;
		int len = vector.size();

		obj = peek();
		vector.removeElementAt(len - 1);

		return obj;
	}

	public synchronized E peek() {
		int len = vector.size();

		if (len == 0)
			throw new EmptyStackException();
		return vector.elementAt(len - 1);
	}

	public boolean empty() {
		return vector.size() == 0;
	}

	public synchronized int search(Object o) {
		int i = vector.lastIndexOf(o);

		if (i >= 0) {
			return vector.size() - i;
		}
		return -1;
	}
}