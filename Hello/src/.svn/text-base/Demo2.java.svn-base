/**
 * 输入学生三科的成绩，计算出平均分
 * @author Administrator
 *
 */
public class Demo2 {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("请输入学生的语文成绩：");
		int chianese = sc.nextInt();
		System.out.println("请输入学生的数学成绩：");
		int math = sc.nextInt();
		System.out.println("请输入学生的英语成绩：");
		int english = sc.nextInt();
		
		//判断输入的值是否是正常范围
		if(((0<=chianese)&&(chianese<=100))&&((0<=math)&&(math<=100))&&((0<=english)&&(english<=100))){
		double avg = (chianese+math+english)/3;
		
		System.out.println("学生的平均成绩是："+avg);
		}else{
			System.out.println("你输入的数据有错！");
		}
	}
}
