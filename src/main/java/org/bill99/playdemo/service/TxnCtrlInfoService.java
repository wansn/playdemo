package org.bill99.playdemo.service;

import org.bill99.playdemo.dao.TxnCtrlInfoDao;
import org.bill99.playdemo.entity.TxnCtrlInfo;
import org.bill99.playdemo.enums.MyEnum;
import org.bill99.playdemo.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

@Service
public class TxnCtrlInfoService {

    private final TxnCtrlInfoDao txnCtrlInfoDao;

    @Autowired
    public TxnCtrlInfoService(TxnCtrlInfoDao txnCtrlInfoDao) {
        this.txnCtrlInfoDao = txnCtrlInfoDao;
    }

    public TxnCtrlInfo query(String idTxnCtrl) throws MyException{
        TxnCtrlInfo txnCtrlInfo = txnCtrlInfoDao.selectByIdTxnCtrl(idTxnCtrl);
        if (null == txnCtrlInfo) {
            throw new MyException(MyEnum.NOTFOUND_ERROR);
        }
        return txnCtrlInfo;
    }

    public int insert(TxnCtrlInfo txnCtrlInfo){
        if (StringUtils.isEmpty(txnCtrlInfo.getIdtxnctrl()) || StringUtils.isEmpty(txnCtrlInfo.getIdtxn())){
            throw new MyException(MyEnum.NOTFOUND_ERROR);
        }
        return  txnCtrlInfoDao.insert(txnCtrlInfo);
    }

    public boolean update(TxnCtrlInfo txnCtrlInfo){
        int result = txnCtrlInfoDao.update(txnCtrlInfo);
        if (StringUtils.isEmpty(txnCtrlInfo.getIdtxnctrl())){
            throw new MyException(MyEnum.NOTFOUND_ERROR);
        }
        return 1 == result ? true : false;
    }

    public boolean delete(String idTxnCtrl){
        int result = txnCtrlInfoDao.delete(idTxnCtrl);
        if (StringUtils.isEmpty(idTxnCtrl)){
            throw new MyException(MyEnum.NOTFOUND_ERROR);
        }
        return 1 == result ? true : false;
    }
}
