package com.longyx.multidatasource.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.longyx.multidatasource.dataobject.Student;
import com.longyx.multidatasource.dataobject.User;
import com.longyx.multidatasource.mapper.BaseMapper;
import com.longyx.multidatasource.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 数据层公共实现类
 * @author Mr.Longyx
 * @date 2020年01月11日 13:37
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {
    private static final Logger logger= LoggerFactory.getLogger(BaseServiceImpl.class);

    protected abstract BaseMapper<T> getMapper();


    @Override
    public boolean insert(T data)  {
        boolean falg=false;
        try {
            getMapper().insert(data);
            falg=true;
        } catch (Exception e) {
            logger.error("新增"+getClassName(data)+"失败!原因是:",e);
        }
        return falg;
    }


    @Override
    public boolean update(T data){
        boolean falg=false;
        try {
            getMapper().update(data);
            falg=true;
        } catch (Exception e) {
            logger.error("更新"+getClassName(data)+"失败!原因是:",e);
        }
        return falg;
    }

    @Override
    public boolean deleteByPrimaryKey(int id)  {
        boolean falg=false;
        try {
            getMapper().deleteByPrimaryKey(id);
            falg=true;
        } catch (Exception e) {
            logger.error("id:"+id+"删除失败!原因是:",e);
        }
        return falg;
    }

    @Override
    public boolean delete(T data){
        boolean falg=false;
        try {
            getMapper().delete(data);
            falg=true;
        } catch (Exception e) {
            logger.error("删除"+getClassName(data)+"失败!原因是:",e);
        }
        return falg;
    }

    @Override
    public T findByPrimaryKey(int id) {
        T obj = null;
        try {
            obj = getMapper().findByPrimaryKey(id);
        } catch (Exception e) {
            logger.error("id:"+id+"查询失败!原因是:",e);
        }
        return obj;
    }

    @Override
    public T findByData(T data) {
        T obj = null;
        try {
            obj = getMapper().findByData(data);
        } catch (Exception e) {
            logger.error("查询"+getClassName(data)+"失败!原因是:",e);
        }
        return obj;
    }

    @Override
    public List<T> findByListData(T data) {
        List<T> list = null;
        try {
            Page<?> page =PageHelper.startPage(1,2);
            System.out.println(getClassName(data)+"设置第一页两条数据!");
            list = getMapper().findByListData(data);
            System.out.println("总共有:"+page.getTotal()+"条数据,实际返回:"+list.size()+"两条数据!");
        } catch (Exception e) {
            logger.error("查询"+getClassName(data)+"失败!原因是:",e);
        }
        return list;
    }

    @Override
    public List<T> findAll() {
        List<T> list = null;
        try {
            list =  getMapper().findAll();
        } catch (Exception e) {
            logger.error("查询失败!原因是:",e);
        }
        return list;
    }

    @Override
    public Object findByObject(Object obj) {
        Object result = null;
        try {
            result = getMapper().findByObject(obj);
        } catch (Exception e) {
            logger.error("查询"+obj+"失败!原因是:",e);
        }
        return result;
    }

    private String getClassName(T t){
        String str="";
        if(t instanceof User){
            str="User";
        }else if(t instanceof Student){
            str="Student";
        }
        return str;
    }
}