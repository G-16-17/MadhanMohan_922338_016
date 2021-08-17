package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

	@Query("select s from Stock s where s.stockCode=?1 and month(s.stockDate)=?2 and year(s.stockDate)=?3")
	public List<Stock> findStockByCodeandMonthandYear(String code, int month, int year);

}