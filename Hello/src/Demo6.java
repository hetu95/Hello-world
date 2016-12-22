/**
 * 静态代码块
 * 随着类的加载而执行，而且只执行一次。
 * @author Administrator
 *
 */
public class Demo6 {
	
	static{
		System.out.println("a");
	}

	public static void main(String[] args){
		System.out.println("xixi");
		new StaticDemo().show();
		new StaticDemo().show();
		System.out.println("b");
	}
}
class StaticDemo{
	
	static
	{
		System.out.println("haha");
	}
	void show(){
		System.out.println("hehe");
	}
}