package com.longyx.multidatasource.controller;

import com.longyx.multidatasource.dataobject.Student;
import com.longyx.multidatasource.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Mr.Longyx
 * @date 2020年01月11日 14:04
 */
@RestController
@RequestMapping(value = "/api")
public class StudentRestController {
    @Autowired
    private StudentService service;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public boolean addStudent(@RequestBody Student student) {
        System.out.println("开始新增...");
        return service.insert(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    public boolean updateStudent(@RequestBody Student student) {
        System.out.println("开始更新...");
        return service.update(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.DELETE)
    public boolean delete(@RequestBody Student student) {
        System.out.println("开始删除...");
        return service.delete(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<Student> findByStudent(Student student) {
        System.out.println("开始查询...");
        return service.findByListData(student);
    }
}
