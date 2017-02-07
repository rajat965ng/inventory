package com.model.domain;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InventoryDate implements Serializable{

	private DateFormat format;
	private String date;
	
	public InventoryDate() {
	}
	
	public InventoryDate(String str) {
		format = new SimpleDateFormat("dd/MM/yyyy");
		date = str;
	}
	
	public Date getDate() throws Exception{
		return format.parse(date);
	}
	
	@Override
	public String toString() {
		String str = "";
		try {
			str = format.parse(date).toString();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return str;
	}
}
