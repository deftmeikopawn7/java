package pome1;
import java.util.Scanner;
public class pometext {
	public static void main(String[] args) {
		String pome = new String("������ɫ˼���"
				+ "��������󲻵����"
				+ "��Ů�������������"
				+ "��δʶ������������"
				+ "��һ��ѡ�ھ������"
				+ "��һЦ������������"
				+ "������ɫ������ԡ��"
				+ "�����Ȫˮ��ϴ��֬"
				+ "�̶���������ʼ��"
				+ "�³ж���ʱ���޻���"
				+ "��ҡܽ����ů�ȴ�"
				+ "����������ո����"
				+ "�˾������糯�л���"
				+ "������Ͼ���Ӵ���ҹ"
				+ "רҹ�󹬼�����ǧ��"
				+ "��ǧ�谮��һ�����"
				+ "ױ�ɽ���ҹ��¥���"
				+ "��ʹ���õ��ֽ���"
				+ "ʿ����������Ż���"
				+ "�����¸�ĸ�Ĳ�����"
				+ "������Ů�깬�ߴ���"
				+ "�������ַ�Ʈ������"
				+ "����������˿����"
				+ "��������������ܱ��"
				+ "������������������"
				+ "�����س����̳���ǧ"
				+ "������������");
		
        
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ���ҵ��֣�");
        String word = sc.nextLine();
        System.out.println();
        
        System.out.println("������Ҫ���ҵĴʣ�");
        Scanner sc1 = new Scanner(System.in);
        String words = sc1.nextLine();
        
        Pome.main(pome,word,words);
	}
}
