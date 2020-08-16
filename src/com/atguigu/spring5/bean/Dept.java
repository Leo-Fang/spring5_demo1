package com.atguigu.spring5.bean;

/**
 * @author Leo
 * @date 2020/7/25 - 14:33
 */

//部门类
public class Dept {

    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" + "dname='" + dname + '\'' + '}';
    }
}
