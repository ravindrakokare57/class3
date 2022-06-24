package Encapsulation;

public class Main {
	
	public static void main(String[] args) {
		long r;
		class1 ad =new class1();
		ad.setA(10);
		r=ad.getA();
		System.out.println(r);
		
		class2 y=new class2();
		y.setT(10);
		r=y.GetT();
		System.out.println(r);
		class3 v=new class3();
		v.setname("REYANSH");
		class4 o=new class4();
		o.setu(524);
		r=o.Getu();
		System.out.println(r);
		class5 p=new class5();
		p.setw("ARYAN");
		class6 l=new class6();
		l.setab(45, 45.365f);
		class7 i=new class7();
		i.setAB(10, 20);
		
	}

}
