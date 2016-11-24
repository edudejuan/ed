package or.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
//		int index = 0;
//		while (index <5) {
//				System.out.println("index=" + index);
//				index ++;		
//		}
//		System.out.println("fuera del ciclo index=" + index);
		int [] v = new int[]{32, 15, 7, 9, 12};
		for (int index = 0 ; index < v.length; index ++)
			System.out.println(v[index]);
	
		System.out.println("indexOf=" + indexOf(v, 9));

	
	}
	
	public static int indexOf(int[] v, int value) {
		for (int index = 0; index < v.length; index++)
			if (v[index] == value)
				return index;
		return -1;
	}
	
//	

}
