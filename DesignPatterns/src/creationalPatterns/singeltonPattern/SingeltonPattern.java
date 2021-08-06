package creationalPatterns.singeltonPattern;

class EarlyInstantiation{
	private static EarlyInstantiation instance= new EarlyInstantiation();
	 private EarlyInstantiation() {}
	 public static EarlyInstantiation getInstance() {
		 return instance;
	 }
}

class LazyInstantiation{
	private static LazyInstantiation instance;
	private LazyInstantiation() {}
	public static LazyInstantiation getInstance(){
		if (instance==null) {
			instance=new LazyInstantiation();
			return instance;
		}
		else 
			return instance;
	}
}
public class SingeltonPattern {
	public static void main(String[] args) {
		EarlyInstantiation instance1= EarlyInstantiation.getInstance();
		System.out.println(instance1);
		EarlyInstantiation instance2= EarlyInstantiation.getInstance();	//this will return same object beacuse of it's singelton property.
		System.out.println(instance2);
		System.out.println("");
		LazyInstantiation instance3= LazyInstantiation.getInstance();
		System.out.println(instance3);
		LazyInstantiation instance4= LazyInstantiation.getInstance();	//this will return same object beacuse of it's singelton property.
		System.out.println(instance4);
		
	}
}
