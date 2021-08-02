package encapsulation;

class Machine{
	private String name;		//these are instance variable which are public
	private int id;			//because other class is going to access it
	
	private int batchNo=23;	//we set these private because we don't need to share it with other class
	private int edition=34;	//and its good practice to hide information which is not necessary for other classes. Thus enforcing ENCAPSULATION.
	
	public Machine(String name,int id) {
		this.name=name;
		this.id=id;
	} 
	
	public void showInfo() {
		System.out.printf("The name if machine is %s and ID no. is %d.\n",name,id);
	}
	
	public void showUniqueID() {
		System.out.println("The unique ID is : "+uniqueID());
	}
	
	
	private String uniqueID(){		//we make it private to follow encapsulation because how a unique ID is formed is class specific and we dont want to share it with another class
		StringBuilder s= new StringBuilder();
		s.append(batchNo).append("-").append(id).append("-").append(edition);
		return s.toString();
	}
	
}

public class EncasulationExample {
	public static void main(String[] args) {
		Machine m1= new Machine("Crane",41);
		m1.showInfo();
		m1.showUniqueID();
		
	}
}
