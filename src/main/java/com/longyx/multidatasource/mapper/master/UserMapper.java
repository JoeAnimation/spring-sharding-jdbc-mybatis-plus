package com.longyx.multidatasource.mapper.master;
import	java.awt.TrayIcon.MessageType;

import com.longyx.multidatasource.dataobject.User;
import com.longyx.multidatasource.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户数据接口
 * @author Mr.Longyx
 * @date 2020年01月11日 13:31
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
