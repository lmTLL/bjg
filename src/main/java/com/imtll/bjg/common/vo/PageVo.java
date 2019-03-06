package com.imtll.bjg.common.vo;

import java.util.List;

/**
 * Create with IDEA
 *
 * @ClassName PageVo
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/5 15:26
 * @Version 1.0
 */
public class PageVo<T> {

    private long count;
    private int page;
    private int size;
    private int totalpage;
    private int code;
    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
