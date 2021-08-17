package com.cognizant.ormlearn.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "st_id")
	private int stockId;
	@Column(name = "st_code")
	private String stockCode;
	@Column(name = "st_date")
	private Date stockDate;
	@Column(name = "st_open")
	private BigDecimal openingStock;
	@Column(name = "st_close")
	private BigDecimal closingStock;
	@Column(name = "st_volume")
	private BigDecimal volume;

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public Date getStockDate() {
		return stockDate;
	}

	public void setStockDate(Date stockDate) {
		this.stockDate = stockDate;
	}

	public BigDecimal getOpeningStock() {
		return openingStock;
	}

	public void setOpeningStock(BigDecimal openingStock) {
		this.openingStock = openingStock;
	}

	public BigDecimal getClosingStock() {
		return closingStock;
	}

	public void setClosingStock(BigDecimal closingStock) {
		this.closingStock = closingStock;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public Stock(int stockId, String stockCode, Date stockDate, BigDecimal openingStock, BigDecimal closingStock,
			BigDecimal volume) {
		super();
		this.stockId = stockId;
		this.stockCode = stockCode;
		this.stockDate = stockDate;
		this.openingStock = openingStock;
		this.closingStock = closingStock;
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockCode=" + stockCode + ", stockDate=" + stockDate + ", openingStock="
				+ openingStock + ", closingStock=" + closingStock + ", volume=" + volume + "]";
	}

}
