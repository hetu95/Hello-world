import java.util.Scanner;


public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������εĸߣ�");
		double gao = scanner.nextDouble();
		System.out.println("���������εĵף�");
		double di = scanner.nextDouble();
		double sum=Sum(gao,di);
		System.out.println("�����ε�����ǣ�"+sum);
	}
	public static double Sum(double a,double b){
		return a*b/2;
	}

}
