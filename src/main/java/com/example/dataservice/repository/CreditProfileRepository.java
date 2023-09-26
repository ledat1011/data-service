package com.example.dataservice.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dataservice.entity.CreditProfileEntity;

@Repository
public interface CreditProfileRepository extends JpaRepository<CreditProfileEntity, Integer> {
	@Query("SELECT c FROM CreditProfileEntity c WHERE c.paymentDeadline < :currentDate")
	List<CreditProfileEntity> findAllPastPaymentDeadline(Date currentDate);
	
}
