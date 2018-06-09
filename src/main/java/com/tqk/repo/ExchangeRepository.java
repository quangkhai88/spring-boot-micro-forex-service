package com.tqk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqk.entity.Exchange;

/**
*
*khaitq on 9 juin 2018
*/

public interface ExchangeRepository extends JpaRepository<Exchange, Long> {

	Exchange findByFromAndTo(String from, String to);
}


