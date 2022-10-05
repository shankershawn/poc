package poc;

class Pair<K, V> {
	Pair<K, V> next;
	K key;
	V value;
	
	Pair(K key, V value){
		this.key = key;
		this.value = value;
	}
}

public class MyMap<K, V> {
	
	Pair<K, V>[] buckets = null;
	int capacity;
	
	@SuppressWarnings("unchecked")
	MyMap(int capacity){
		this.buckets = new Pair[capacity];
		this.capacity = capacity;
	}
	
	private int getIndex(K key) {
		return (key.hashCode() < 0 ? key.hashCode() * -1 : key.hashCode()) % this.capacity;
	}
	
	public V get(K key) {
		V value = null;
		Pair<K, V> pair = buckets[getIndex(key)];
		while(pair.key != key && pair.next != null) {
			pair = pair.next;
		}
		if(pair.key == key) {
			value = pair.value;
		}
		return value;
	}
	
	public void put(K key, V value) {
		int index = getIndex(key);
		Pair<K, V> pair = buckets[index];
		if(pair == null || pair.key == key) {
			buckets[index] = new Pair<K, V>(key, value);
		}else {
			while(pair.next != null) {
				pair = pair.next;
			}
			pair.next = new Pair<K, V>(key, value);
		}
	}

}
