package services;

public interface OnlinePaymentService {

	abstract double paymentFree(double amount);
	double interest(double amount, int months);
}
