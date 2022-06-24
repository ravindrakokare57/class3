package ad1;

public class Main {
public static void main(String[] args) {
	Kotak k=new Kotak();
	Sbi s=new Sbi();
	Icici i=new Icici();
	System.out.println("Rate of intrest for kotak is:" +k.rateOfIntrest());
	System.out.println("Rate of intrest for sbi is:" +s.rateOfIntrest());
	System.out.println("Rate of intrest fir Icici is:" +i.rateOfIntrest());
	
}
}
