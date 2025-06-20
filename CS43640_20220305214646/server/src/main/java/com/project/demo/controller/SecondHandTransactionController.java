package com.project.demo.controller;

import com.project.demo.entity.SecondHandTransaction;
import com.project.demo.service.SecondHandTransactionService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *二手交易：(SecondHandTransaction)表控制层
 *
 */
@RestController
@RequestMapping("/second_hand_transaction")
public class SecondHandTransactionController extends BaseController<SecondHandTransaction,SecondHandTransactionService> {

    /**
     *二手交易对象
     */
    @Autowired
    public SecondHandTransactionController(SecondHandTransactionService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
