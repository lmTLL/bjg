package com.imtll.bjg.controller;

import com.imtll.bjg.common.vo.ResultVo;
import com.imtll.bjg.service.TrolleyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Create with IDEA
 *
 * @ClassName TrolleyController
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/16 21:39
 * @Version 1.0
 */
@RestController
public class TrolleyController {
    @Autowired
    private TrolleyService trolleyService;

    /**
     * 展示购物车信息
     * @param session
     * @return
     */
    @GetMapping("/queryInTrolley.do")
    public ResultVo queryInTrolley(HttpSession session){
        return trolleyService.queryAllTrollery(session);
    }

    /**
     * 添加到购物车
     * @param id
     * @param session
     * @return
     */
    @PostMapping("/saveTOTrolley.do")
    public ResultVo saveToTrolley(int id,HttpSession session){
        return trolleyService.saveToTrollery(id,session);
    }
}
