/**
 * 鸡兔同笼，鸡和兔的头有h个，脚共有f个，设计程序，根据用户输入的h和f，
计算分别有几只鸡,几只兔

 * @author Administrator
 *
 */
public class Demo4 {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("请输入一共的头数h:");
		int head = sc.nextInt();
		System.out.print("请输入一共的脚数f:");
		int foot = sc.nextInt();
		
		
		int rabit = (foot-2*head)/2;
		int chicken = head-rabit;
		System.out.println("鸡："+chicken+"只\t兔子："+rabit+"只");
	}
}
