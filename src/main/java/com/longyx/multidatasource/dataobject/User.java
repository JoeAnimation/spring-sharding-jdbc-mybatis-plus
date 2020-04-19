package com.longyx.multidatasource.dataobject;
import	java.io.DataInput;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户实体类
 * @author Mr.Longyx
 * @date 20Data1月11日 13:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -4840343480890071933L;
    /** 编号*/
    private Long id;
    /** 姓名*/
    private String name;
    /** 年龄*/
    private Integer age;
}
