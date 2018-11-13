package org.bill99.playdemo.service;

import org.bill99.playdemo.dao.TxnCtrlInfoDao;
import org.bill99.playdemo.entity.TxnCtrlInfo;
import org.bill99.playdemo.enums.MyEnum;
import org.bill99.playdemo.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.Optional;

@Service
public class TxnCtrlInfoService {

    private final TxnCtrlInfoDao txnCtrlInfoDao;

    @Autowired
    public TxnCtrlInfoService(TxnCtrlInfoDao txnCtrlInfoDao) {
        this.txnCtrlInfoDao = txnCtrlInfoDao;
    }

    public TxnCtrlInfo query(String idTxnCtrl) throws MyException{
//        TxnCtrlInfo txnCtrlInfo = txnCtrlInfoDao.selectByIdTxnCtrl(idTxnCtrl);
        Optional<TxnCtrlInfo> txnCtrlInfo = txnCtrlInfoDao.findById(idTxnCtrl);
        if (!txnCtrlInfo.isPresent()) {
            throw new MyException(MyEnum.NOTFOUND_ERROR);
        }

        return txnCtrlInfo.get();
    }

    public boolean insert(TxnCtrlInfo txnCtrlInfo){
        if (StringUtils.isEmpty(txnCtrlInfo.getIdTxnCtrl()) || StringUtils.isEmpty(txnCtrlInfo.getIdTxn())){
            throw new MyException(MyEnum.INVALIDPARA_ERROR);
        }
        txnCtrlInfoDao.saveAndFlush(txnCtrlInfo);
        return txnCtrlInfoDao.existsById(txnCtrlInfo.getIdTxnCtrl());
    }

    public TxnCtrlInfo update(TxnCtrlInfo txnCtrlInfo){
//        int result = txnCtrlInfoDao.update(txnCtrlInfo);
        if (StringUtils.isEmpty(txnCtrlInfo.getIdTxnCtrl())){
            throw new MyException(MyEnum.INVALIDPARA_ERROR);
        }
        return txnCtrlInfoDao.saveAndFlush(txnCtrlInfo);
    }

    public boolean delete(String idTxnCtrl){
//        int result = txnCtrlInfoDao.delete(idTxnCtrl);
        if (StringUtils.isEmpty(idTxnCtrl)){
            throw new MyException(MyEnum.INVALIDPARA_ERROR);
        }
        txnCtrlInfoDao.deleteById(idTxnCtrl);
        return txnCtrlInfoDao.existsById(idTxnCtrl);
    }
}
