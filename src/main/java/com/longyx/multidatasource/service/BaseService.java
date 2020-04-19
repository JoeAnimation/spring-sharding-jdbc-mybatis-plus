package com.longyx.multidatasource.service;

import java.util.List;

/**
 * @author Mr.Longyx
 * @date 2020年01月11日 13:33
 */
public interface BaseService<T> {
    /**
     * 插入数据
     *
     * @param data
     * @return
     * @throws
     */
    boolean insert(T data) ;

    /**
     * 更新数据
     *
     * @param data
     * @return
     * @throws
     */
    boolean update(T data) ;

    /**
     * 根据ID删除数据
     * @param id
     * @throws Exception
     * @throws
     */
    boolean deleteByPrimaryKey(int id) ;

    /**
     * 删除数据
     * @param data
     * @throws Exception
     * @throws
     */
    boolean delete(T data) ;


    /**
     * 根据id查询单个记录
     *
     * @param id
     * @return
     * @throws Exception
     * @throws
     */
    T findByPrimaryKey(int id);

    /**
     * 根据对象查询单个记录
     *
     * @param data
     * @return
     * @throws Exception
     * @throws
     */
    T findByData(T data);



    /**
     * 根据对象查询多条记录
     * @param data
     * @return
     */
    List<T> findByListData(T data);

    /**
     * 查询所有记录
     * @return
     */
    List<T> findAll();

    /**
     * 根据对象查询信息
     *
     * @param obj
     * @return
     * @throws Exception
     * @throws
     */
    Object findByObject(Object obj);
}
