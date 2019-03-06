package com.imtll.bjg.common.util;

import com.imtll.bjg.common.sysconst.SystemCon;
import com.imtll.bjg.common.vo.PageVo;
import com.imtll.bjg.common.vo.ResultVo;


import java.util.List;

/**
 * Create with IDEA
 *
 * @ClassName ResultUtil
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/5 15:29
 * @Version 1.0
 */
public class ResultUtil {
    public static ResultVo exec(boolean istrue, String msg,Object data){
        ResultVo resultVo = new ResultVo();
        if(istrue){
            resultVo.setCode(SystemCon.OK);
        }else{
            resultVo.setCode(SystemCon.ERROR);
        }
        resultVo.setMsg(msg);
        resultVo.setData(data);
        return resultVo;
    }

    public static <T> PageVo<T> exec(int page, int size, long count, List<T> data){
        PageVo pageVo=new PageVo();
        pageVo.setPage(page);
        pageVo.setSize(size);
        pageVo.setCount(count);
        pageVo.setTotalpage((int)(count%size==0?count/size:count/size+1));
        pageVo.setData(data);
        return pageVo;
    }
}
