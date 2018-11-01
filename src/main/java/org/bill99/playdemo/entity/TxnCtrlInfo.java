package org.bill99.playdemo.entity;

public class TxnCtrlInfo {
    private String idtxnctrl;

    private String idtxn;

    private String merchantid;

    private String amt;

    private String remark;

    public String getIdtxnctrl() {
        return idtxnctrl;
    }

    public void setIdtxnctrl(String idtxnctrl) {
        this.idtxnctrl = idtxnctrl == null ? null : idtxnctrl.trim();
    }

    public String getIdtxn() {
        return idtxn;
    }

    public void setIdtxn(String idtxn) {
        this.idtxn = idtxn == null ? null : idtxn.trim();
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid == null ? null : merchantid.trim();
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt == null ? null : amt.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "idtxnctrl='" + idtxnctrl + '\'' +
                ", idtxn='" + idtxn + '\'' +
                ", merchantid='" + merchantid + '\'' +
                ", amt='" + amt + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}