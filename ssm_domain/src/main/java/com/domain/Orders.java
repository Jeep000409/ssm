package com.domain;

public class Orders {
    private Integer id;
    private String orderNum;
    private String orderTime;
    private Integer peopleCount;
    private String ordersDesc;
    private Integer payType;
    private Integer orderStatus;

    private Product product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getOrdersDesc() {
        return ordersDesc;
    }

    public void setOrdersDesc(String ordersDesc) {
        this.ordersDesc = ordersDesc;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Orders(Integer id, String orderNum, String orderTime, Integer peopleCount, String ordersDesc, Integer payType, Integer orderStatus, Product product) {
        this.id = id;
        this.orderNum = orderNum;
        this.orderTime = orderTime;
        this.peopleCount = peopleCount;
        this.ordersDesc = ordersDesc;
        this.payType = payType;
        this.orderStatus = orderStatus;
        this.product = product;
    }

    public Orders() {
    }
}
