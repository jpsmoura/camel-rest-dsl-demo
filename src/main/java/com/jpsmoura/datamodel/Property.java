package com.jpsmoura.datamodel;

public class Property  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    private java.lang.Integer price;
    
    private java.lang.String address;

    public Property() {
    }

    public Property(java.lang.String address, java.lang.Integer price) {
        this.address = address;
        this.price = price;
    }

    public java.lang.Integer getPrice() {
        return this.price;
    }

    public void setPrice(  java.lang.Integer price ) {
        this.price = price;
    }
    
    public java.lang.String getAddress() {
        return this.address;
    }

    public void setAddress(  java.lang.String address ) {
        this.address = address;
    }

	@Override
	public String toString()
	{
		return "Property [price=" + price + ", address=" + address + "]";
	}




}