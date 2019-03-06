package com.imtll.bjg.common.util;


import com.imtll.bjg.common.vo.JsonBean;

/**
 * Create with IDEA
 *
 * @ClassName JsonUtils
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/4 12:13
 * @Version 1.0
 */
public class JsonUtils {
    public static JsonBean createJsonBean(int code, Object info){
        JsonBean bean = new JsonBean();
        bean.setCode(code);
        bean.setInfo(info);
        return bean;
    }
}
