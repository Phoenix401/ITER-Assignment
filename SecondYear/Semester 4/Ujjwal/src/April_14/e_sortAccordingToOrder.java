package April_14;

//	Given An Array, sort the array according to the Order of the Array.
public class e_sortAccordingToOrder {
	public static void main(String[] args) {
		printUsingOrder();
	}
	public static void printUsingOrder() {
		int[] arr = {2,1,2,2,5,7,1,9,3,6,8,8};
		int[] data = {2,1,8,3};
		
		java.util.Hashtable<Integer, Integer> obj = new java.util.Hashtable();
		
		for(int i=0 ; i<arr.length ; i++) {
			if(obj.containsKey(arr[i])) {
				obj.replace(arr[i], obj.get(arr[i])+1);
			}else {
				obj.put(arr[i], 1);
			}
		}
		
		for(int i=0 ; i<data.length ;i++) {
			if(obj.contains(data[i])) {
				for(int j=0 ; j<obj.get(data[i]) ; j++) {
					System.out.println(data[i]);
				}
				obj.remove(data[i]);
			}
		}
		for(int i=0 ; i<obj.size() ; i++) {
			if(obj.get(i)!=null) {
				System.out.println(obj.get(i));
			}
		}
	}
}
