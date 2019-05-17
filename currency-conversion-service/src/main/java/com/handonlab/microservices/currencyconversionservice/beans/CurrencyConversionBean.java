/**
 * 
 */
package com.handonlab.microservices.currencyconversionservice.beans;

import java.math.BigDecimal;

/**
 * @author M.Othman
 *
 */
public class CurrencyConversionBean {
	
	private Long id;
	
	private String from;
	
	private String  to;
	
	private BigDecimal exchangeRate;
	
	private BigDecimal amount;
	
	private int port;

	/**
	 * 
	 */
	public CurrencyConversionBean() {
		
	}

	/**
	 * @param id
	 * @param from
	 * @param to
	 * @param exchangeValue
	 * @param amount
	 */
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal exchangeRate, BigDecimal amount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
		this.amount = amount;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return the exchangeRate
	 */
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	/**
	 * @param exchangeRate the exchangeRate to set
	 */
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}	

}
