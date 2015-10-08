public class LinearProbing {
	public static void main(String[] vb) {
		int[] input = {96, 43, 72, 68, 63, 28, 50};
		MyHashTableLinearProbing<String,Integer> hashObj = new MyHashTableLinearProbing<String,Integer>(10007);
		// for(int i = 0; i < input.length; i++) {
		// 	hashObj.insertElement(input[i]);
		// }
		hashObj.insertElement("vinay",50);
		hashObj.insertElement("purna",96);
		hashObj.insertElement("yesh",43);
		hashObj.insertElement("Bharath",72);
		hashObj.insertElement("ramesh",68);
		hashObj.insertElement("ramesh",63);
		hashObj.insertElement("venky",28);
		hashObj.insertElement("anjan",45);
		hashObj.insertElement("yaniv",70);
		hashObj.insertElement("vaniy",50);

		hashObj.print();
		System.out.println("-----------------");
		hashObj.removeElement("vinay");
		hashObj.print();
	}
}