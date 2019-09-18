package com.zxl.model;

import java.io.Serializable;

/**
 * 数据库的表对应的用户实体
 * @author ElijahZheng
 * @date 2019/9/7
 */

public class ZxlUser implements Serializable {
    private Integer id;
    private String name;
    private String password;

    public Integer getId () {
        return this.id;
    }
    public String getName () {
        return this.name;
    }
}
