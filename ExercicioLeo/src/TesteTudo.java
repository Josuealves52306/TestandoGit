
public class TesteTudo {

	public static void main(String[] args) {
		
		// Criando objetos das classes
        Driver driver = new Driver();
        driver.setDriverID(1);
        driver.setDriverName("John");
        driver.setDriverAdd("123 Main St");
        driver.setDriverEmail("john@example.com");
        driver.setDriverContacNo(1234567890);

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleType("Car");
        vehicle.setVehicleID("ABC123");
        vehicle.setDriver(driver);

        User user = new User();
        user.setUserID(1);
        user.setUserName("Alice");
        user.setUserAdd("456 Main St");
        user.setUserEmail("alice@example.com");
        //user.setUserContacNo("0987654321");

        Payment payment = new Payment();
        payment.setPaymentID(1);
        payment.setPaymentType("Credit");
        payment.setPaymentDetails("1234567890123456");
        payment.setRewards("10% cashback");
        payment.setUser(user);

        // Estabelecendo o relacionamento entre os objetos
        driver.setVehicle(vehicle);
        user.setPayment(payment);

        // Testando os métodos das classes
        System.out.println("Driver Name: " + driver.getDriverName());
        System.out.println("Vehicle ID: " + vehicle.getVehicleID());
        System.out.println("User Name: " + user.getUserName());
        System.out.println("Payment Type: " + payment.getPaymentType());
				
	}

}
