/**
 * 
 */
package com.handonlab.microservices.currencyexchangeservice.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author M.Othman
 *
 */
@Entity
public class ExchangeValue {

	@Id
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	private BigDecimal exchangeRate;
	
	private int port;

	/**
	 * Default Constructor
	 */
	public ExchangeValue() {
		
	}

	/**
	 * @param id
	 * @param from
	 * @param to
	 * @param exchangeRate
	 */
	public ExchangeValue(Long id, String from, String to, BigDecimal exchangeRate) {
		
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
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
