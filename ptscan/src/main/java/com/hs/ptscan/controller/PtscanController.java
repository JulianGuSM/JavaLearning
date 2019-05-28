package com.hs.ptscan.controller;

import com.hs.ptscan.dao.ptppmc.PtPxjgMapper;
import com.hs.ptscan.model.PtPxjg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Julian
 * @date : 2019/5/27 16:28
 */
@RestController
public class PtscanController {
    @Autowired
    private PtPxjgMapper ptPxjgMapper;

    @CrossOrigin
    @RequestMapping(value = "/queryByCustomerCode",method = RequestMethod.GET)
    public List<PtPxjg> getPtPxjgsByCustomerCode(@RequestParam(name = "khdm",required = false) String customerCode){
        return ptPxjgMapper.getPtPxjgsByCustomerCode(customerCode);
    }
}
