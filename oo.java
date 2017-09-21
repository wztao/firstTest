package com.eigpay.feesnode.core.model;

import java.math.BigDecimal;
import java.util.Date;

public class BatchAckReportDataDO {
    private Long id;

    private String instId;

    private Date clearDate;

    private String cardPrd;

    private String busiServLevel;

    private String busiServId;

    private String fileId;

    private String settleInd;

    private String funcCode;

    private String pcode;

    private String origOrRev;

    private String interRateDes;

    private String interFeeCode;

    private Integer counts;

    private BigDecimal reconAmount;

    private String reconCcy;

    private BigDecimal transFee;

    private String feeCcy;

    private String creator;

    private Date createDatetime;

    private String modifier;

    private Date modifyDatetime;

    private Boolean isEnable;

    private Boolean isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId == null ? null : instId.trim();
    }

    public Date getClearDate() {
        return clearDate;
    }

    public void setClearDate(Date clearDate) {
        this.clearDate = clearDate;
    }

    public String getCardPrd() {
        return cardPrd;
    }

    public void setCardPrd(String cardPrd) {
        this.cardPrd = cardPrd == null ? null : cardPrd.trim();
    }

    public String getBusiServLevel() {
        return busiServLevel;
    }

    public void setBusiServLevel(String busiServLevel) {
        this.busiServLevel = busiServLevel == null ? null : busiServLevel.trim();
    }

    public String getBusiServId() {
        return busiServId;
    }

    public void setBusiServId(String busiServId) {
        this.busiServId = busiServId == null ? null : busiServId.trim();
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getSettleInd() {
        return settleInd;
    }

    public void setSettleInd(String settleInd) {
        this.settleInd = settleInd == null ? null : settleInd.trim();
    }

    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode == null ? null : funcCode.trim();
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode == null ? null : pcode.trim();
    }

    public String getOrigOrRev() {
        return origOrRev;
    }

    public void setOrigOrRev(String origOrRev) {
        this.origOrRev = origOrRev == null ? null : origOrRev.trim();
    }

    public String getInterRateDes() {
        return interRateDes;
    }

    public void setInterRateDes(String interRateDes) {
        this.interRateDes = interRateDes == null ? null : interRateDes.trim();
    }

    public String getInterFeeCode() {
        return interFeeCode;
    }

    public void setInterFeeCode(String interFeeCode) {
        this.interFeeCode = interFeeCode == null ? null : interFeeCode.trim();
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public BigDecimal getReconAmount() {
        return reconAmount;
    }

    public void setReconAmount(BigDecimal reconAmount) {
        this.reconAmount = reconAmount;
    }

    public String getReconCcy() {
        return reconCcy;
    }

    public void setReconCcy(String reconCcy) {
        this.reconCcy = reconCcy == null ? null : reconCcy.trim();
    }

    public BigDecimal getTransFee() {
        return transFee;
    }

    public void setTransFee(BigDecimal transFee) {
        this.transFee = transFee;
    }

    public String getFeeCcy() {
        return feeCcy;
    }

    public void setFeeCcy(String feeCcy) {
        this.feeCcy = feeCcy == null ? null : feeCcy.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifyDatetime() {
        return modifyDatetime;
    }

    public void setModifyDatetime(Date modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
