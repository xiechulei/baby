package com.pojo;


public class TWithdraw {

  private String id;
  private String userId;
  private long amount;
  private long fee;
  private String bankName;
  private String realname;
  private String cardNumber;
  private String branchName;
  private java.sql.Timestamp createTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }


  public long getFee() {
    return fee;
  }

  public void setFee(long fee) {
    this.fee = fee;
  }


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

}
