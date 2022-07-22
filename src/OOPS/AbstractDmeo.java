package OOPS;
abstract class RBI{
	abstract public void interest();
	abstract public void HL();
	public void reporate() {
		System.out.println("+-4%");
	}
}
class SBI extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("sbj interest : 5%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("sbi loan : 7%");
	}
	
}
class PNB extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("pnb interest : 6%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("pnb loan : 8%");
	}
	
}
class JAVA extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("java interest : 7%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("java loan : 7.5%");
	}
	
}
public class AbstractDmeo {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.HL();
		PNB p = new PNB();
		p.interest();
		p.HL();
		JAVA j = new JAVA();
		j.interest();
		j.HL();
	}
}
