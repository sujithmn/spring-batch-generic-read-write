package com.spring.example.model;

import java.util.Date;

public class Report {

	private Date date;
	private String impressions;
	private int clicks;
	private double earning;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getImpressions() {
		return impressions;
	}
	public void setImpressions(String impressions) {
		this.impressions = impressions;
	}
	public int getClicks() {
		return clicks;
	}
	public void setClicks(int clicks) {
		this.clicks = clicks;
	}
	public double getEarning() {
		return earning;
	}
	public void setEarning(double earning) {
		this.earning = earning;
	}
	
		
}