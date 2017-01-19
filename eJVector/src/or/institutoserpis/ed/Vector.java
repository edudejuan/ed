package or.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		int index = indexOf(new int []{32, 15, 7, 9, 12}, 99);
		System.out.println("Vector index=" + index);
	}
	public static int indexOf(int[]v, int data){
		int index = 1;
		while(v[index]  != data && index < v.length -1)
			index++;
			if (index = v.length)
					return -1;
			return index;
	}
//	
	public static Object min(int[] is) {
		// TODO Auto-generated method stub
		return null;
	}

}
