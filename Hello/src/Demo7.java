
public class Demo7 {

	public static void main(String[] args) {
		int i= 2;
		System.out.println(i++);
		System.out.println(++i);
		
		int[] arr = new int[]{8,2,1,0,3};
		int[] index = new int [] {2,0,3,2,4,0,1,3,2,3,3};
		String tel ="";
		for (int j : index) {
			tel+=arr[j];
		}
		System.out.println(tel);
	}
}
