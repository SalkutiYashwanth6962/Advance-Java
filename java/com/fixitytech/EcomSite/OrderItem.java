package com.fixitytech.EcomSite;



public class OrderItem extends CartItem {
	int sid;
	int orderId;
public OrderItem() {
	// TODO Auto-generated constructor stub
}
public OrderItem(CartItem cartItem)
{this.id=cartItem.getId();
this.name=cartItem.getName();
this.price=cartItem.getPrice();
this.quantity=cartItem.getQuantity();
}


public int getSid() {
	return sid;
}


public void setSid(int sid) {
	this.sid = sid;
}


public int getOrderId() {
	return orderId;
}


public void setOrderId(int orderId) {
	this.orderId = orderId;
}

}

