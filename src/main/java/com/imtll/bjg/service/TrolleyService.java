package com.imtll.bjg.service;

import com.imtll.bjg.common.vo.ResultVo;
import com.imtll.bjg.entity.Trolley;

import javax.servlet.http.HttpSession;

/**
 * Create with IDEA
 *
 * @ClassName TrolleyService
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/16 21:32
 * @Version 1.0
 */
public interface TrolleyService {
    ResultVo queryAllTrollery(HttpSession session);

    ResultVo saveToTrollery(Integer id, HttpSession session);
}
