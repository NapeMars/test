class Day21
{	//60变16进制
	public static void main(String[] args)
	{
		int num = 60;
		//获取60的最低4位
		int n1=num & 15;
		System.out.println(n1>9?(char)(n1-10+'A'):n1);
		//获取下一组4位，先将60右移4位
		int temp = 60>>4;
		//对temp的值进行最低4位的获取
		int n2=temp & 15;
		System.out.println(n2>9?(char)(n2-10+'A'):n2);
		
	}
}