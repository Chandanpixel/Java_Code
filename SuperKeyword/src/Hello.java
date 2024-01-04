
public class Hello {
		public static void main(String[] args) {
			int ar[]= {767,87,0,12,12,43,23,1,0,45,343,3};
			Hello h = new Hello();
			h.print(ar);
		}
	public void print(int [] arr) {
		for (int i=0; i< arr.length-1; i++) {
			for(int j= i+1; j< arr.length; j++) {
				if( arr[i] == arr [j] && i!= j) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	
}
