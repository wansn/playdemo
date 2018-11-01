package org.bill99.playdemo.dao;

import org.bill99.playdemo.entity.TxnCtrlInfo;
import org.springframework.stereotype.Service;

@Service
public interface TxnCtrlInfoDao {
    int delete(String idtxnctrl);

    int insert(TxnCtrlInfo record);

    int insertSelective(TxnCtrlInfo record);

    TxnCtrlInfo selectByIdTxnCtrl(String idtxnctrl);

    int updateByPrimaryKeySelective(TxnCtrlInfo record);

    int update(TxnCtrlInfo record);
}