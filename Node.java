class Node<K, V> {
	private K key;
	private V value;
	private Node nxtKey;
	Node(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(K key) {
		this.value = value;
	}

	public void setNextKey(Node nxtKey) {
		this.nxtKey = nxtKey;
	}


	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public Node getNextKey() {
		return nxtKey;
	}

	public String toString() {
		return key + "  " +nxtKey;
	} 
}