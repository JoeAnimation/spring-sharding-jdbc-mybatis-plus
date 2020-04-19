package com.longyx.multidatasource.mapper.cluster;

import com.longyx.multidatasource.dataobject.Student;
import com.longyx.multidatasource.dataobject.User;
import com.longyx.multidatasource.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户数据接口
 * @author Mr.Longyx
 * @date 2020年01月11日 13:26
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
