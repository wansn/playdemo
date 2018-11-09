package org.bill99.playdemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_txn_ctrl")
public class TxnCtrlInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTxnCtrl")
    private String idTxnCtrl;

    @Column(name = "idTxn")
    private String idTxn;

    @Column(name = "merchantId")
    private String merchantId;

    @Column(name = "amt")
    private String amt;

    @Column(name = "remark")
    private String remark;

    public String getIdTxnCtrl() {
        return idTxnCtrl;
    }

    public void setIdTxnCtrl(String idTxnCtrl) {
        this.idTxnCtrl = idTxnCtrl;
    }

    public String getIdTxn() {
        return idTxn;
    }

    public void setIdTxn(String idTxn) {
        this.idTxn = idTxn;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TxnCtrlInfo{" +
                "idTxnCtrl='" + idTxnCtrl + '\'' +
                ", idTxn='" + idTxn + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", amt='" + amt + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}