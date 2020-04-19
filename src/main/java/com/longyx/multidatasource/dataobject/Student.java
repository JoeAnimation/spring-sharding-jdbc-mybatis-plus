package com.longyx.multidatasource.dataobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 *
 * @Title: Student
 * 学生信息表
 * @author Mr.Longyx
 * @date 2020年01月11日 13:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student implements Serializable {
    private static final long serialVersionUID = 5215503227111296946L;
    /** 学生编号*/
    private Long id;
    /** 学生姓名*/
    private String name;
    /** 学生年龄*/
    private Integer age;

}