package model.service;

import java.security.InvalidParameterException;

public class BrazilInterestService {

	private Double interestRate;
	
	public BrazilInterestService() {
	}
	
	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public Double getInterestRate() {
		return interestRate;
	}
	
	public double payment(double amount, int months) {
		if(months < 1) {
			throw new InvalidParameterException("Month must be greater than zero");
		}
		return amount * Math.pow(1 + interestRate / 100, months);
	}
	
}
