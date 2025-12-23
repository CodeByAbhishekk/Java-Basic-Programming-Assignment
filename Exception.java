package Java1;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {10,20,30,40,50};
		int [] b = {0,2,4,0};
		
		for(int i = 0; i < 6;i++) {
			try {
				System.out.println(a[i]/b[i]);
			}
			catch(ArrayIndexOutOfBoundException aq) {
				System.out.print("out of bound");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}
