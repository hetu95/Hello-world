/**
 * ����ѧ�����Ƶĳɼ��������ƽ����
 * @author Administrator
 *
 */
public class Demo2 {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("������ѧ�������ĳɼ���");
		int chianese = sc.nextInt();
		System.out.println("������ѧ������ѧ�ɼ���");
		int math = sc.nextInt();
		System.out.println("������ѧ����Ӣ��ɼ���");
		int english = sc.nextInt();
		
		//�ж������ֵ�Ƿ���������Χ
		if(((0<=chianese)&&(chianese<=100))&&((0<=math)&&(math<=100))&&((0<=english)&&(english<=100))){
		double avg = (chianese+math+english)/3;
		
		System.out.println("ѧ����ƽ���ɼ��ǣ�"+avg);
		}else{
			System.out.println("������������д�");
		}
	}
}
