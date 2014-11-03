package exam.shop.dto;

import java.sql.*;

public class Order {
	
	private int orderNum;
	private String userId;
	private Date orderDate;
	private int itemId;
	private int count;
	
	public Order(int orderNum, String userId, Date orderDate, int itemId,
			int count) {
		super();
		this.orderNum = orderNum;
		this.userId = userId;
		this.orderDate = orderDate;
		this.itemId = itemId;
		this.count = count;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
