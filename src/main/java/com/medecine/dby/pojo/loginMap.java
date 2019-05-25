package com.medecine.dby.pojo;

import java.util.List;

public class loginMap {
	private List<loginPojo> rows;
 	private int total;
	public List<loginPojo> getRows() {
		return rows;
	}
	public void setRows(List<loginPojo> rows) {
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
	public loginMap(List<loginPojo> rows, int total) {
		super();
		this.rows = rows;
		this.total = total;
	}
	public loginMap() {
		super();
		// TODO Auto-generated constructor stub
	}
	
 	
}
