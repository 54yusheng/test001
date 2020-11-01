/*
	数据输入的初步使用之三个和尚的升级版
*/

/*
import java.util.Scanner;

public class DemoScanner{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int height1 = sc.nextInt();
		int height2 = sc.nextInt();
		int height3 = sc.nextInt();
		
		int Tempheight = (height1 > height2)?height1:height2;
		
		int Maxheight = (Tempheight > height3)?Tempheight:height3;
		
		System.out.println("The max height: " + Maxheight);
	}
}

*/

import java.util.Scanner;  //导包

public class DemoScanner{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);  //创建对象
		
		int height1 = sc.nextInt();  //获得输入1
		int height2 = sc.nextInt();  //获得输入2
		int height3 = sc.nextInt();  //获得输入3
		
		int Tempheight = (height1 > height2)?height1:height2;
		
		int TheMaxHeight = (Tempheight > height3)?Tempheight:height3;
		
		System.out.println("The Max Height:" + TheMaxHeight);  //输出比较后的结果
	}
}
