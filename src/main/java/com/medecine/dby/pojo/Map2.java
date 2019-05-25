package com.medecine.dby.pojo;

import java.util.List;

public class Map2 {
	private List<drugPojo> rows;
 	private int total;
	public List<drugPojo> getRows() {
		return rows;
	}
	public void setRows(List<drugPojo> rows) {
		this.rows = rows;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Map1 [rows=" + rows + ", total=" + total + "]";
	}
	public Map2(List<drugPojo> rows, int total) {
		super();
		this.rows = rows;
		this.total = total;
	}
	public Map2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
 	
}
