package com.eigpay.batchcard.infra.dao.chief.clear;

import com.eigpay.batchcard.infra.dao.chief.common.GenericDao;
import com.eigpay.batchcard.infra.dao.chief.model.clear.dual.princ.BatchSettPostDO;

/**
 * 
 * @author Diego_wztao
 * @date 2017年9月15日
 * 
 * @ClassName: BatchSettPostDao2 
 * @since JDK1.7
 *
 * @Description:
 *
 */
public interface BatchSettPostDao extends GenericDao<BatchSettPostDO, String> {
	

	/**
	 * 
	 * @Title: getRecordByInstIdForUpdate  
	 * @return BatchSettPostDO
	 * @throws 
	 *
	 * @param @param batchSettPostDO
	 * @param @return
	 *
	 * @Description:select from batch_sett_post_detail
	 */
	BatchSettPostDO getRecordByInstIdForUpdate(BatchSettPostDO batchSettPostDO);
	
	/**
	 * 
	 * @Title: getIssRecordByInstIdForUpdate  
	 * @return BatchSettPostDO
	 * @throws 
	 *
	 * @param @param batchSettPostDO
	 * @param @return
	 *
	 * @Description:select from batch_sett_post_detail_midd
	 */
	BatchSettPostDO getIssRecordByInstIdForUpdate(BatchSettPostDO batchSettPostDO);
	
	/**
	 * 
	 * @Title: insertIssMiddle  
	 * @return int
	 * @throws 
	 *
	 * @param @param batchSettPostDO
	 * @param @return
	 *
	 * @Description:
	 */
	int insertIssMiddle(BatchSettPostDO batchSettPostDO);
	
	/**
	 * 
	 * @Title: updateIssMiddle  
	 * @return int
	 * @throws 
	 *
	 * @param @param batchSettPostDO
	 * @param @return
	 *
	 * @Description:
	 */
	int updateIssMiddle(BatchSettPostDO batchSettPostDO);

}
