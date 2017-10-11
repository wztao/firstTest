    private Long id;

    private String msgType;

    private String pan;

    private String pcode;

    private BigDecimal tranAmount;

    private BigDecimal reconAmount;

    private BigDecimal billAmount;

    private BigDecimal reconRate;

    private BigDecimal billRate;

    private String stan;

    private Date tranDate;

    private Date tranTime;

    private Date localTime;

    private String expireDate;

    private String posEntryMode;

    private String posData;

    private String posPinCap;

    private String cardSeq;

    private String funcCode;

    private String reasonCode;

    private String mcc;

    private BigDecimal origAmount;

    private String acqReferData;

    private String acqInstId;

    private String forInstId;

    private String referNo;

    private String approveCode;

    private String serviceCode;

    private String terminalId;

    private String acceptorId;

    private String acceptorName;

    private String addData1;

    private String tranCcy;

    private String reconCcy;

    private String billCcy;

    private String addAmount;

    private String iccRelaData;

    private String addData2;

    private String tranLifeCycleId;

    private String issuer;

    private String acquirer;

    private String recvInstId;

    private BigDecimal ccyConvAmount;

    private String addData3;

    private String addData4;

    private String addData5;

    private Date clearDate;

    private String clearStatus;

    private Date settDate;

    private String reversalStatus;

    private String creator;

    private Date createDatetime;

    private String modifier;

    private Date modifyDatetime;

    private Boolean isEnable;

    private Boolean isDeleted;

    private String acqMsgFlag;

    private String issMsgFlag;

    private String msgStatus;

    private String panEncrypt;

    private String respCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan == null ? null : pan.trim();
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode == null ? null : pcode.trim();
    }

    public BigDecimal getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(BigDecimal tranAmount) {
        this.tranAmount = tranAmount;
    }

    public BigDecimal getReconAmount() {
        return reconAmount;
    }

    public void setReconAmount(BigDecimal reconAmount) {
        this.reconAmount = reconAmount;
    }

    public BigDecimal getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
    }

    public BigDecimal getReconRate() {
        return reconRate;
    }

    public void setReconRate(BigDecimal reconRate) {
        this.reconRate = reconRate;
    }

    public BigDecimal getBillRate() {
        return billRate;
    }

    public void setBillRate(BigDecimal billRate) {
        this.billRate = billRate;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan == null ? null : stan.trim();
    }

    public Date getTranDate() {
        return tranDate;
    }

    public void setTranDate(Date tranDate) {
        this.tranDate = tranDate;
    }

    public Date getTranTime() {
        return tranTime;
    }

    public void setTranTime(Date tranTime) {
        this.tranTime = tranTime;
    }

    public Date getLocalTime() {
        return localTime;
    }

    public void setLocalTime(Date localTime) {
        this.localTime = localTime;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate == null ? null : expireDate.trim();
    }

    public String getPosEntryMode() {
        return posEntryMode;
    }

    public void setPosEntryMode(String posEntryMode) {
        this.posEntryMode = posEntryMode == null ? null : posEntryMode.trim();
    }

    public String getPosData() {
        return posData;
    }

    public void setPosData(String posData) {
        this.posData = posData == null ? null : posData.trim();
    }

    public String getPosPinCap() {
        return posPinCap;
    }

    public void setPosPinCap(String posPinCap) {
        this.posPinCap = posPinCap == null ? null : posPinCap.trim();
    }

    public String getCardSeq() {
        return cardSeq;
    }

    public void setCardSeq(String cardSeq) {
        this.cardSeq = cardSeq == null ? null : cardSeq.trim();
    }

    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode == null ? null : funcCode.trim();
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode == null ? null : reasonCode.trim();
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc == null ? null : mcc.trim();
    }

    public BigDecimal getOrigAmount() {
        return origAmount;
    }

    public void setOrigAmount(BigDecimal origAmount) {
        this.origAmount = origAmount;
    }

    public String getAcqReferData() {
        return acqReferData;
    }

    public void setAcqReferData(String acqReferData) {
        this.acqReferData = acqReferData == null ? null : acqReferData.trim();
    }

    public String getAcqInstId() {
        return acqInstId;
    }

    public void setAcqInstId(String acqInstId) {
        this.acqInstId = acqInstId == null ? null : acqInstId.trim();
    }

    public String getForInstId() {
        return forInstId;
    }

    public void setForInstId(String forInstId) {
        this.forInstId = forInstId == null ? null : forInstId.trim();
    }

    public String getReferNo() {
        return referNo;
    }

    public void setReferNo(String referNo) {
        this.referNo = referNo == null ? null : referNo.trim();
    }

    public String getApproveCode() {
        return approveCode;
    }

    public void setApproveCode(String approveCode) {
        this.approveCode = approveCode == null ? null : approveCode.trim();
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId == null ? null : terminalId.trim();
    }

    public String getAcceptorId() {
        return acceptorId;
    }

    public void setAcceptorId(String acceptorId) {
        this.acceptorId = acceptorId == null ? null : acceptorId.trim();
    }

    public String getAcceptorName() {
        return acceptorName;
    }

    public void setAcceptorName(String acceptorName) {
        this.acceptorName = acceptorName == null ? null : acceptorName.trim();
    }

    public String getAddData1() {
        return addData1;
    }

    public void setAddData1(String addData1) {
        this.addData1 = addData1 == null ? null : addData1.trim();
    }

    public String getTranCcy() {
        return tranCcy;
    }

    public void setTranCcy(String tranCcy) {
        this.tranCcy = tranCcy == null ? null : tranCcy.trim();
    }

    public String getReconCcy() {
        return reconCcy;
    }

    public void setReconCcy(String reconCcy) {
        this.reconCcy = reconCcy == null ? null : reconCcy.trim();
    }

    public String getBillCcy() {
        return billCcy;
    }

    public void setBillCcy(String billCcy) {
        this.billCcy = billCcy == null ? null : billCcy.trim();
    }

    public String getAddAmount() {
        return addAmount;
    }

    public void setAddAmount(String addAmount) {
        this.addAmount = addAmount == null ? null : addAmount.trim();
    }

    public String getIccRelaData() {
        return iccRelaData;
    }

    public void setIccRelaData(String iccRelaData) {
        this.iccRelaData = iccRelaData == null ? null : iccRelaData.trim();
    }

    public String getAddData2() {
        return addData2;
    }

    public void setAddData2(String addData2) {
        this.addData2 = addData2 == null ? null : addData2.trim();
    }

    public String getTranLifeCycleId() {
        return tranLifeCycleId;
    }

    public void setTranLifeCycleId(String tranLifeCycleId) {
        this.tranLifeCycleId = tranLifeCycleId == null ? null : tranLifeCycleId.trim();
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer == null ? null : issuer.trim();
    }

    public String getAcquirer() {
        return acquirer;
    }

    public void setAcquirer(String acquirer) {
        this.acquirer = acquirer == null ? null : acquirer.trim();
    }

    public String getRecvInstId() {
        return recvInstId;
    }

    public void setRecvInstId(String recvInstId) {
        this.recvInstId = recvInstId == null ? null : recvInstId.trim();
    }

    public BigDecimal getCcyConvAmount() {
        return ccyConvAmount;
    }

    public void setCcyConvAmount(BigDecimal ccyConvAmount) {
        this.ccyConvAmount = ccyConvAmount;
    }

    public String getAddData3() {
        return addData3;
    }

    public void setAddData3(String addData3) {
        this.addData3 = addData3 == null ? null : addData3.trim();
    }

    public String getAddData4() {
        return addData4;
    }

    public void setAddData4(String addData4) {
        this.addData4 = addData4 == null ? null : addData4.trim();
    }

    public String getAddData5() {
        return addData5;
    }

    public void setAddData5(String addData5) {
        this.addData5 = addData5 == null ? null : addData5.trim();
    }

    public Date getClearDate() {
        return clearDate;
    }

    public void setClearDate(Date clearDate) {
        this.clearDate = clearDate;
    }

    public String getClearStatus() {
        return clearStatus;
    }

    public void setClearStatus(String clearStatus) {
        this.clearStatus = clearStatus == null ? null : clearStatus.trim();
    }

    public Date getSettDate() {
        return settDate;
    }

    public void setSettDate(Date settDate) {
        this.settDate = settDate;
    }

    public String getReversalStatus() {
        return reversalStatus;
    }

    public void setReversalStatus(String reversalStatus) {
        this.reversalStatus = reversalStatus == null ? null : reversalStatus.trim();
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

    public String getAcqMsgFlag() {
        return acqMsgFlag;
    }

    public void setAcqMsgFlag(String acqMsgFlag) {
        this.acqMsgFlag = acqMsgFlag == null ? null : acqMsgFlag.trim();
    }

    public String getIssMsgFlag() {
        return issMsgFlag;
    }

    public void setIssMsgFlag(String issMsgFlag) {
        this.issMsgFlag = issMsgFlag == null ? null : issMsgFlag.trim();
    }

    public String getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(String msgStatus) {
        this.msgStatus = msgStatus == null ? null : msgStatus.trim();
    }

    public String getPanEncrypt() {
        return panEncrypt;
    }

    public void setPanEncrypt(String panEncrypt) {
        this.panEncrypt = panEncrypt == null ? null : panEncrypt.trim();
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode == null ? null : respCode.trim();
    }
