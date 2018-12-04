class Day22
{	//读取数值来输出
	public static void main(String[] args)
	{
		/*		
		Scanner input= new Scanner(System.in);
		System.out.println("请输入月份：");
		int x=input.nextInt();
		*/
		int x=9;
		switch(x)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(x+"月是春季");break;
			case 6:
			case 7:
			case 8:
				System.out.println(x+"月是夏季");break;
			case 9:
			case 10:
			case 11:
				System.out.println(x+"月是秋季");break;
			case 12:
			case 1:
			case 2:
				System.out.println(x+"月是冬季");break;
			default:
				System.out.println("SB");
		}
	}
}
/*
if和switch语句很像。
具体说明情况下应用哪个？
如果判断的具体数值不多，而是符合byte short int char这四种类型，建议用switch。
其他情况：对区间判断，对结果为Boolean类型判断，使用if。
*/