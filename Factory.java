interface Sim{
	public void data();
	public void calling();
}
class Airtel implements Sim{

	@Override
	public void data() {
		System.out.println("airtel data u r using");
	}
	@Override
	public void calling() {
		System.out.println(" u r calling from airtel");
	}
}
class Vodafone implements Sim{
	@Override
	public void data() {
		System.out.println("vodafone data u r using");
	}
	@Override
	public void calling() {
		System.out.println(" u r calling from vodafone");
	}	
}
class Jio implements Sim{

	@Override
	public void data() {
		System.out.println("jio data u r using");
	}

	@Override
	public void calling() {
		System.out.println("u r calling from jio");	
	}
}
class BeanFactory{
	public static Sim m1(String str)
	{
		if(str.equals("airtel"))
			return new Airtel();
		else if(str.equals("vodafone"))
			return new Vodafone();
		return new Jio();
	}
}
public class Factory {
   public static void main(String[] args){
	   BeanFactory bf=new BeanFactory();
	   Sim obj=bf.m1("jio");
	   obj.calling();
	   obj.data();
   }
}
