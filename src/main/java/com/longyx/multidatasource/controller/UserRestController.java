package com.longyx.multidatasource.controller;

import com.longyx.multidatasource.dataobject.User;
import com.longyx.multidatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制层
 * @author Mr.Longyx
 * @date 2020年01月11日 14:02
 */
@RestController
@RequestMapping(value = "/api")
public class UserRestController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public boolean insert(@RequestBody User user) {
        System.out.println("开始新增...");
        return userService.insert(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public boolean update(@RequestBody User user) {
        System.out.println("开始更新...");
        return userService.update(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public boolean delete(@RequestBody User user)  {
        System.out.println("开始删除...");
        return userService.delete(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> findByUser(User user) {
        System.out.println("开始查询...");
        return userService.findByListData(user);
    }
}
