package org.bill99.playdemo.controller;


import org.bill99.playdemo.entity.TxnCtrlInfo;
import org.bill99.playdemo.exception.MyException;
import org.bill99.playdemo.service.TxnCtrlInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TxnCtrlController {

    private final TxnCtrlInfoService txnCtrlInfoService;

    @Autowired
    public TxnCtrlController(TxnCtrlInfoService txnCtrlInfoService) {
        this.txnCtrlInfoService = txnCtrlInfoService;
    }

    // index页面
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("txnCtrlInfo", new TxnCtrlInfo());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    // 查询页面
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public ModelAndView query(@RequestParam(value = "idTxnCtrl") String idTxnCtrl) throws MyException {
        TxnCtrlInfo txnCtrlInfo = txnCtrlInfoService.query(idTxnCtrl);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("txnCtrlInfo", txnCtrlInfo);
        modelAndView.setViewName("details");
        return modelAndView;
    }

    // 新增页面
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ModelAndView insert(@ModelAttribute(value = "txnCtrlInfo") TxnCtrlInfo txnCtrlInfo){
        ModelAndView modelAndView = new ModelAndView();
        int result = txnCtrlInfoService.insert(txnCtrlInfo);
        modelAndView.getModel().put("result",result);
        modelAndView.getModel().put("txnCtrlInfo",txnCtrlInfo);
        modelAndView.setViewName("insert");
        return modelAndView;
    }

    // 修改页面
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ModelAndView update(@ModelAttribute(value = "txnCtrlInfo") TxnCtrlInfo txnCtrlInfo){
        ModelAndView modelAndView = new ModelAndView();
        boolean result = txnCtrlInfoService.update(txnCtrlInfo);
        modelAndView.getModel().put("result",result);
        modelAndView.getModel().put("txnCtrlInfo",txnCtrlInfo);
        modelAndView.setViewName("update");
        return modelAndView;
    }

    //删除页面
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ModelAndView delete(@RequestParam(value = "idTxnCtrl") String idTxnCtrl){
        ModelAndView modelAndView = new ModelAndView();
        boolean result = txnCtrlInfoService.delete(idTxnCtrl);
        modelAndView.getModel().put("result",result);
        modelAndView.setViewName("delete");
        return modelAndView;
    }
}
