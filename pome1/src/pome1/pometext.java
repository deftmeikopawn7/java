package pome1;
import java.util.Scanner;
public class pometext {
	public static void main(String[] args) {
		String pome = new String("汉皇重色思倾国"
				+ "御宇多年求不得杨家"
				+ "有女初长成养在深闺"
				+ "人未识天生丽质难自"
				+ "弃一朝选在君王侧回"
				+ "眸一笑百媚生六宫粉"
				+ "黛无颜色春寒赐浴华"
				+ "清池温泉水滑洗凝脂"
				+ "侍儿扶起娇无力始是"
				+ "新承恩泽时云鬓花颜"
				+ "金步摇芙蓉帐暖度春"
				+ "宵春宵苦短日高起从"
				+ "此君王不早朝承欢侍"
				+ "宴无闲暇春从春游夜"
				+ "专夜后宫佳丽三千人"
				+ "三千宠爱在一身金屋"
				+ "妆成娇侍夜玉楼宴罢"
				+ "醉和春姊妹弟兄皆列"
				+ "士可怜光采生门户遂"
				+ "令天下父母心不重生"
				+ "男重生女骊宫高处入"
				+ "青云仙乐风飘处处闻"
				+ "缓歌慢舞凝丝竹尽日"
				+ "君王看不足渔阳鼙鼓"
				+ "动地来惊破霓裳羽衣"
				+ "曲九重城阙烟尘生千"
				+ "乘万骑西南行");
		
        
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的字：");
        String word = sc.nextLine();
        System.out.println();
        
        System.out.println("请输入要查找的词：");
        Scanner sc1 = new Scanner(System.in);
        String words = sc1.nextLine();
        
        Pome.main(pome,word,words);
	}
}
