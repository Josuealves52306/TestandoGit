
public class User {
	
	private int UserID;
	private String UserName;
	private String UserAdd;
	private String UserEmail;
	private double ContacNo;
	private Payment payment;
	
	
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserAdd() {
		return UserAdd;
	}
	public void setUserAdd(String userAdd) {
		UserAdd = userAdd;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public double getContacNo() {
		return ContacNo;
	}
	public void setContacNo(double contacNo) {
		ContacNo = contacNo;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
		
	

}
