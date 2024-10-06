package com.kimlien.novel.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

@TableName("pay_wechat")
public class PayWechat implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String outTradeNo;

    private String transactionId;

    private String tradeType;

    private String tradeState;

    private String tradeStateDesc;

    private Integer amount;

    private Integer payerTotal;

    private LocalDateTime successTime;

    private String payerOpenid;

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

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeState() {
        return tradeState;
    }

    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    public String getTradeStateDesc() {
        return tradeStateDesc;
    }

    public void setTradeStateDesc(String tradeStateDesc) {
        this.tradeStateDesc = tradeStateDesc;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPayerTotal() {
        return payerTotal;
    }

    public void setPayerTotal(Integer payerTotal) {
        this.payerTotal = payerTotal;
    }

    public LocalDateTime getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(LocalDateTime successTime) {
        this.successTime = successTime;
    }

    public String getPayerOpenid() {
        return payerOpenid;
    }

    public void setPayerOpenid(String payerOpenid) {
        this.payerOpenid = payerOpenid;
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
        return "PayWechat{" +
        "id=" + id +
        ", outTradeNo=" + outTradeNo +
        ", transactionId=" + transactionId +
        ", tradeType=" + tradeType +
        ", tradeState=" + tradeState +
        ", tradeStateDesc=" + tradeStateDesc +
        ", amount=" + amount +
        ", payerTotal=" + payerTotal +
        ", successTime=" + successTime +
        ", payerOpenid=" + payerOpenid +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
