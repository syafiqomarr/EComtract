/*
 * This software is the confidential and proprietary information of Ssm
 * ("Confidential Information").
 * You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the
 * license agreement you entered into
 * with Ssm.
 */
package com.ssm.supplyinfo.dao;

import com.ssm.llp.base.common.dao.BaseDao;
import com.ssm.supplyinfo.model.SupplyInfoTransDtl;

/**
 * TODO DOCUMENTTHIS
 *
 * @author zamzam
 * @version 1.0
  */
public interface SupplyInfoTransDtlDao extends BaseDao<SupplyInfoTransDtl, Long> {

	void deleteByHdrCode(String transCode);
}
