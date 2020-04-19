package com.longyx.multidatasource.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.longyx.multidatasource.dataobject.User;
import com.longyx.multidatasource.mapper.BaseMapper;
import com.longyx.multidatasource.mapper.master.UserMapper;
import com.longyx.multidatasource.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户操作实现
 * @author Mr.Longyx
 * @date 2020年01月11日 13:48
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    protected  BaseMapper<User> getMapper(){
        return this.userMapper;
    }

}
