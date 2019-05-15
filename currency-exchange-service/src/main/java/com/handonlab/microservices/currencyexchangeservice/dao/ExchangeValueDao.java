/**
 * 
 */
package com.handonlab.microservices.currencyexchangeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handonlab.microservices.currencyexchangeservice.bean.ExchangeValue;

/**
 * @author M.Othman
 *
 */
public interface ExchangeValueDao extends JpaRepository<ExchangeValue, Long> {
	
	
	public ExchangeValue findByFromAndTo(String from , String to);

}
