package com.kimlien.novel.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

@TableName("pay_alipay")
public class PayAlipay implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String outTradeNo;

    private String tradeNo;

    private String buyerId;

    private String tradeStatus;

    private Integer totalAmount;

    private Integer receiptAmount;

    private Integer invoiceAmount;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtPayment;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(Integer receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public Integer getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Integer invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtPayment() {
        return gmtPayment;
    }

    public void setGmtPayment(LocalDateTime gmtPayment) {
        this.gmtPayment = gmtPayment;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "PayAlipay{" +
        "id=" + id +
        ", outTradeNo=" + outTradeNo +
        ", tradeNo=" + tradeNo +
        ", buyerId=" + buyerId +
        ", tradeStatus=" + tradeStatus +
        ", totalAmount=" + totalAmount +
        ", receiptAmount=" + receiptAmount +
        ", invoiceAmount=" + invoiceAmount +
        ", gmtCreate=" + gmtCreate +
        ", gmtPayment=" + gmtPayment +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
