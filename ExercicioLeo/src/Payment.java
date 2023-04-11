
public class Payment {
	
	private int PaymentID;
	private String PaymentType;
	private String PaymentDetails;
	private String Rewards;
	private User user;
	
	
	public int getPaymentID() {
		return PaymentID;
	}
	public void setPaymentID(int paymentID) {
		PaymentID = paymentID;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	public String getPaymentDetails() {
		return PaymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		PaymentDetails = paymentDetails;
	}
	public String getRewards() {
		return Rewards;
	}
	public void setRewards(String rewards) {
		Rewards = rewards;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
