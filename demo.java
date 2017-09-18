package com.eigpay.batchcard.infra.dao.chief.model.clear.dual.princ;

import java.math.BigDecimal;
import java.util.Date;

import com.eigpay.batchcard.infra.dao.chief.model.base.BaseFields;

/**
 * 
 * @author Diego_wztao
 * @date 2017年9月18日
 * 
 * @ClassName: BatchFinPostDO 
 * @since JDK1.7
 *
 * @Description:
 *
 */
public class BatchFinPostDO  extends BaseFields{

	
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 3504629663957510583L;

	private String instId;//机构编码
	
	private String instRole;//机构角色

	private String reconCcy;//结算币种
	
	private String tranSet;//交易集合
	
	private String msgRevFlag;//撤销标识
	
	private Date settdate;//结算日期
	
	private BigDecimal creAmount;//贷方金额
	
	private int  creCount;//贷方笔数
	
	private BigDecimal debAmount;//借方金额
	
	private int  debCount;//借方笔数
	
	private BigDecimal creFeeAmount;//贷方费用金额
	
	
	private BigDecimal debFeeAmount;//借方费用金额
	
	private String suffix;//发卡统计数据来源标识
	
	public String getTranSet() {
		return tranSet;
	}

	public void setTranSet(String tranSet) {
		this.tranSet = tranSet;
	}

	public String getMsgRevFlag() {
		return msgRevFlag;
	}

	public void setMsgRevFlag(String msgRevFlag) {
		this.msgRevFlag = msgRevFlag;
	}


	public String getSuffix() {
		return suffix;
	}


	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}


	public String getInstId() {
		return instId;
	}


	public void setInstId(String instId) {
		this.instId = instId;
	}


	public String getInstRole() {
		return instRole;
	}


	public void setInstRole(String instRole) {
		this.instRole = instRole;
	}
	

	public Date getSettdate() {
		return settdate;
	}


	public void setSettdate(Date settdate) {
		this.settdate = settdate;
	}


	public String getReconCcy() {
		return reconCcy;
	}


	public void setReconCcy(String reconCcy) {
		this.reconCcy = reconCcy;
	}


	public BigDecimal getCreAmount() {
		return creAmount;
	}


	public void setCreAmount(BigDecimal creAmount) {
		this.creAmount = creAmount;
	}


	public int getCreCount() {
		return creCount;
	}


	public void setCreCount(int creCount) {
		this.creCount = creCount;
	}


	public BigDecimal getDebAmount() {
		return debAmount;
	}


	public void setDebAmount(BigDecimal debAmount) {
		this.debAmount = debAmount;
	}


	public int getDebCount() {
		return debCount;
	}


	public void setDebCount(int debCount) {
		this.debCount = debCount;
	}


	public BigDecimal getCreFeeAmount() {
		return creFeeAmount;
	}


	public void setCreFeeAmount(BigDecimal creFeeAmount) {
		this.creFeeAmount = creFeeAmount;
	}


	public BigDecimal getDebFeeAmount() {
		return debFeeAmount;
	}


	public void setDebFeeAmount(BigDecimal debFeeAmount) {
		this.debFeeAmount = debFeeAmount;
	}
	
}
