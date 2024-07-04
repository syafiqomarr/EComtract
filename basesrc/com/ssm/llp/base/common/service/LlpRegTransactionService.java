/*
 * This software is the confidential and proprietary information of Ssm
 * ("Confidential Information").
 * You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the
 * license agreement you entered into
 * with Ssm.
 */
package com.ssm.llp.base.common.service;

import com.ssm.llp.base.common.service.BaseService;
import com.ssm.llp.base.common.model.LlpRegTransaction;

public interface LlpRegTransactionService extends BaseService<LlpRegTransaction, Long>{

	LlpRegTransaction findByReserverNameRefNo(String nsRefNo);
}

