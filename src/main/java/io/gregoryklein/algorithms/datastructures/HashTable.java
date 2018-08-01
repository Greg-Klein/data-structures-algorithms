package io.gregoryklein.algorithms.datastructures;

/**
 * @author Gregory.KLEIN
 *
 */
@SuppressWarnings("unchecked")
public class HashTable<T> {
	
	private int initialSize;
	private HashEntry<T>[] data;
	private int size;
	
	@SuppressWarnings("hiding")
	public class HashEntry<T> {
		String key;
		T value;
		HashEntry<T> next;
		
		public HashEntry(String key, T value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}
	
	public HashTable(int initialSize) {
		this.size = 0;
		this.initialSize = initialSize;
		this.data = new HashEntry[initialSize];
	}
	
	public void put(String key, T value) {
		int index = getIndex(key);
		
		HashEntry<T> entry = new HashEntry<T>(key, value);
		
		if(data[index] == null) {
			data[index] = entry;
		} else {
			HashEntry<T> entries = data[index];
			
			while(entries.next != null) {
				entries = entries.next;
			}
			
			entries.next = entry;
		}
		
		size++;
		
	}
	
	public T get(String key) {
		int index = getIndex(key);
		
		HashEntry<T> entries = data[index];
		
		if(entries != null) {
			while(!entries.key.equals(key) && entries.next != null) {
				entries = entries.next;
			}
			
			return entries.value;
		}
		
		return null;
	}
	
	public int size() {
		return size;
	}
	
	/* --- Utils --- */
	
	private int getIndex(String key) {
		int hashCode = Math.abs(key.hashCode());
		return hashCode % initialSize;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		
		for (int i = 0; i < data.length; i++) {
			if(data[i] != null) {
				sb.append(data[i].key + ": ");
				sb.append(data[i].value + ", ");
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		
		sb.append("}");
		
		return sb.toString();
	}

}
