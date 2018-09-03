public class test
{
	public static void main(String[] args)
	{
		byte ba = 100;
		short sa = 3000;
		int ia = 123456789;
		long la = 123456789987654L;
		char ca1= 55;
		char ca2 = 'a';
		float fl = 1.23F;
		double doo = 3.1415926D;
		String ss = "123123";
		
		System.out.println(ba);
		System.out.println(sa);
		System.out.println(ia);
		System.out.println(la);
		System.out.println(ca1);
		System.out.println(ca2);
		System.out.println(fl);
		System.out.println(doo);
		System.out.println(ss);

		System.out.println(Integer.parseInt(ss) + 123);
	}
}