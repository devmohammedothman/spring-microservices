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
	
	private BigDecimal exchangeValue;
	
	private BigDecimal amount;

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
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal exchangeValue, BigDecimal amount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeValue = exchangeValue;
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
	 * @return the exchangeValue
	 */
	public BigDecimal getExchangeValue() {
		return exchangeValue;
	}

	/**
	 * @param exchangeValue the exchangeValue to set
	 */
	public void setExchangeValue(BigDecimal exchangeValue) {
		this.exchangeValue = exchangeValue;
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

}
