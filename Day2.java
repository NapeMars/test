class Day2
{
	public static void main(String[] args)
	{
		int n=3,m=8;
		System.out.println("n="+n+" m="+m);
		/*
		//不用第三方变量
		n=n+m;
		m=n-m;
		n=n-m;//若果n和m非常大就会出问题
		*/
		n=n^m;//^异或
		m=n^m;//(n^m)^m导致m=n
		n=n^m;//(n^m)^n
		System.out.println("n="+n+" m="+m);
		//但是实际应用的时候最好用第三变量，容易看懂
	}
}