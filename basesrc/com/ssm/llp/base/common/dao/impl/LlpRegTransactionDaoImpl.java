/*
 * This software is the confidential and proprietary information of Ssm
 * ("Confidential Information").
 * You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the
 * license agreement you entered into
 * with Ssm.
 */
package com.ssm.llp.base.common.dao.impl;

import org.springframework.stereotype.Repository;

import com.ssm.llp.base.common.dao.impl.BaseDaoImpl;
import com.ssm.llp.base.common.dao.LlpRegTransactionDao;
import com.ssm.llp.base.common.model.LlpRegTransaction;

@Repository
public class LlpRegTransactionDaoImpl extends BaseDaoImpl<LlpRegTransaction, Long>  implements LlpRegTransactionDao{
}
