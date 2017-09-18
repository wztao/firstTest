package com.eigpay.batchcard.infra.dao.chief.clear;

import java.util.Date;

import com.eigpay.batchcard.infra.dao.chief.common.GenericDao;
import com.eigpay.batchcard.infra.dao.chief.model.clear.BatchPrincDO;

/**
 * 
 * @author Diego_wztao
 * @date 2017年9月18日
 * 
 * @ClassName: BatchPrincDao 
 * @since JDK1.7
 *
 * @Description:
 *
 */
public interface BatchPrincDao extends GenericDao<BatchPrincDO, String> {
	
	/**
	 * 
	 * @Title: getRecordByInstIdForUpdate  
	 * @return BatchSettPostDO
	 * @throws 
	 *
	 * @param @param InstId
	 * @param @param clearDate
	 * @param @return
	 *
	 * @Description:select for update batch_sett_post_data
	 */
	BatchPrincDO getRecordByInstIdForUpdate(String InstId , Date clearDate);
	
	/**
	 * 
	 * @Title: getIssRecordByInstIdForUpdate  
	 * @return BatchSettPostDO
	 * @throws 
	 *
	 * @param @param InstId
	 * @param @param clearDate
	 * @param @return
	 *
	 * @Description:select for update batch_sett_post_data_midd
	 */
	BatchPrincDO getIssRecordByInstIdForUpdate(String InstId , Date clearDate);
	
	/**
	 * 
	 * @Title: insertIssMiddle  
	 * @return int
	 * @throws 
	 *
	 * @param @param batchSettPostDO
	 * @param @return
	 *
	 * @Description:insert to batch_sett_post_data_midd
	 */
	int insertIssMiddle(BatchPrincDO batchSettPostDO);
	
	/**
	 * 
	 * @Title: updateIssMiddle  
	 * @return int
	 * @throws 
	 *
	 * @param @param batchSettPostDO
	 * @param @return
	 *
	 * @Description:update batch_sett_post_data_midd
	 */
	int updateIssMiddle(BatchPrincDO batchSettPostDO);

}
