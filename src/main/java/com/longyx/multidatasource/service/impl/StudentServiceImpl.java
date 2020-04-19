package com.longyx.multidatasource.service.impl;

import com.longyx.multidatasource.dataobject.Student;
import com.longyx.multidatasource.mapper.BaseMapper;
import com.longyx.multidatasource.mapper.cluster.StudentMapper;
import com.longyx.multidatasource.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 学生操作实现类
 * @author Mr.Longyx
 * @date 2020年01月11日 13:59
 */
@Service
public class StudentServiceImpl extends BaseServiceImpl<Student> implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    protected BaseMapper<Student> getMapper() {
        return this.studentMapper;
    }
}
