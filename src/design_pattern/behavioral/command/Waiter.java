package design_pattern.behavioral.command;

public class Waiter {
 
	void placeOrder(Order order) {
		order.execute();
	}
}
