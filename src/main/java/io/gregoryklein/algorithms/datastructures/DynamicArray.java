package io.gregoryklein.algorithms.datastructures;

@SuppressWarnings("unchecked")
public class DynamicArray<T> {
	
	private Object[] data;
	private int size;
	private int initialSize;
	
	public DynamicArray() {
		this.initialSize = 10;
		this.size = 0;
		this.data = new Object[initialSize];
	}
	
	public void push(T item) {
		if(size == initialSize) {
			doubleSize();
		}
		
		data[size] = item;
		size++;
	}
	
	public T pop() {
		T result = (T) data[size - 1];
		data[size - 1] = null;
		size--;
		return result;
	}
	
	public void unshift(T item) {
		if(size == initialSize) {
			doubleSize();
		}
		
		for (int i = size - 1; i >= 0; i--) {
			data[i + 1] = data[i];
		}
		
		data[0] = item;
		size++;
	}
	
	public T shift() {
		T result = (T) data[0];
		
		for (int i = 0; i < size; i++) {
			data[i] = data[i + 1];
		}
		size--;
		
		return result;
	}
	
	public int size() {
		return this.size;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		
		for (int i = 0; i < data.length; i++) {
			if(data[i] != null) {
				sb.append(data[i] + ", ");
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		
		sb.append("]");
		
		return sb.toString();
	}
	
	private void doubleSize() {
		initialSize = initialSize * 2;
		Object[] newData = new Object[initialSize];
		
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		
		data = newData;
	}

}
