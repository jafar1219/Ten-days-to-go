package tendaystogo;

public class OverLoading {
	public void teamDetails(int teamsize) {
		 System.out.println("Teamsize is:"+teamsize);
	}
	public void teamDetails(String colour) {
System.out.println("Team colour is :"+colour);
	}
	public void teamDetails(Float salary) {
System.out.println("salary of total players is:"+salary);
	}
	public void teamDetails(String address ,String email) {
System.out.println("email & address:"+"\t"+address+"\t"+email);
	}
	public static void main(String[] args) {
		OverLoading OL=new OverLoading();
		OL.teamDetails(50005.00f);
		OL.teamDetails(11);
		OL.teamDetails("blue");
		OL.teamDetails("chennai", "bcci@gmail.com");
	
	}

}
