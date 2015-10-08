import java.util.*;

@SuppressWarnings("unchecked")
class MyHashTableLinearProbing<K, V> {
	Node<K, V>[] nodeObj;
	private K key;
	private V value;
	private int size;
	private int indexCount;
	
	MyHashTableLinearProbing(int size) {
		this.size = size;
		indexCount = 0;
		nodeObj = new Node[size];
	}

	public void insertElement(K key, V value) {
		int hashCode = hashFunction(key);
		if(nodeObj[hashCode] == null) {
			nodeObj[hashCode] = new Node(key,value);
			
		} else {
			for(int i = (hashCode + 1) % size; i < size; i++) {
				if(nodeObj[i] == null) {
					nodeObj[i] = new Node(key,value);
					break;
					
				}
			}
		}
	}

	public int hashFunction(K dkey) {
		String hashstr = dkey.toString();
		int hashCode = 0;
		for(int i = 0; i < hashstr.length(); i++) {
			int code = (int)hashstr.charAt(i) * 32^i;
			hashCode = hashCode + code;
		}

		hashCode = hashCode % size;
		// System.out.println(hashCode);
		return hashCode;
	}
	
	public void removeElement(K key) {
		int hashCode = hashFunction(key);
		if(nodeObj[hashCode].getKey() == key) {
			nodeObj[hashCode] = null;
			
		} else {

			for(int i = (hashCode + 1) % size; i < size; i++) {
				if (nodeObj[i] != null){
					hashCode = hashFunction(nodeObj[i].getKey());
					if(nodeObj[i].getKey() == key) {
						if(nodeObj[hashCode] == null) {
							nodeObj[hashCode] = nodeObj[i];
						}
					}
				}
			}
		}

	}
	public void print(){
		for(int i = 0; i < size; i++) {
			if(nodeObj[i] != null) {
				if (nodeObj[i].getNextKey() == null)
					System.out.print(i + " : " +nodeObj[i].getKey());
				else{
					Node temp = nodeObj[i];
					System.out.print(temp.getKey());
					while(temp != null) {
						temp = temp.getNextKey();
						if(temp!= null)
							System.out.print( " --> " + temp.getKey());
					}
				}
				System.out.println();
			}
			
		}
	}

}
