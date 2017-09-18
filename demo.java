package com.eigpay.batchcard.infra.dao.chief.clear;

import com.eigpay.batchcard.infra.dao.chief.common.GenericDao;
import com.eigpay.batchcard.infra.dao.chief.model.clear.dual.princ.BatchFinPostDO;

/**
 * 
 * @author Diego_wztao
 * @date 2017年9月18日
 * 
 * @ClassName: BatchFinPostDao 
 * @since JDK1.7
 *
 * @Description:
 *
 */
public interface BatchFinPostDao extends GenericDao<BatchFinPostDO , String>  {
	
	/**
	 * 
	 * @Title: getRecordByInstIdForUpdate  
	 * @return BatchFinPostDO
	 * @throws 
	 *
	 * @param @param batchFinPostDO
	 * @param @return
	 *
	 * @Description:
	 */
	BatchFinPostDO getRecordByInstIdForUpdate(BatchFinPostDO batchFinPostDO);
	
	/**
	 * 
	 * @Title: getIssRecordByInstIdForUpdate  
	 * @return BatchFinPostDO
	 * @throws 
	 *
	 * @param @param batchFinPostDO
	 * @param @return
	 *
	 * @Description:select from batch_fin_post_detail
	 */
	BatchFinPostDO getIssRecordByInstIdForUpdate(BatchFinPostDO batchFinPostDO);
	
	/**
	 * 
	 * @Title: insertIssMiddle  
	 * @return int
	 * @throws 
	 *
	 * @param @param batchFinPostDO
	 * @param @return
	 *
	 * @Description:
	 */
	int insertIssMiddle(BatchFinPostDO batchFinPostDO);
	
	/**
	 * 
	 * @Title: updateIssMiddle  
	 * @return int
	 * @throws 
	 *
	 * @param @param batchFinPostDO
	 * @param @return
	 *
	 * @Description:
	 */
	int updateIssMiddle(BatchFinPostDO batchFinPostDO);
}
