package com.longyx.multidatasource.mapper;

import java.util.List;

/**
 * 基础数据层
 * @author Mr.Longyx
 * @date 2020年01月11日 13:24
 */
public interface BaseMapper<T> {
    /**
     * 单条新增插入数据
     * @param data
     * @return
     * @throws Exception
     * @throws
     */
    void insert(T data) throws Exception;


    /**
     * 批量新增插入数据
     * @param dataList
     * @return
     * @throws Exception
     * @throws
     */
    int insertBatch(List<T> dataList) throws Exception;

    /**
     * 更新数据
     *
     * @param data
     * @return
     * @throws Exception
     * @throws
     */
    void update(T data) throws Exception;

    /**
     * 根据ID删除数据
     * @param id
     * @throws Exception
     * @throws
     */
    void deleteByPrimaryKey(int id) throws Exception;

    /**
     * 删除数据
     * @param data
     * @throws Exception
     * @throws
     */
    void delete(T data) throws Exception;


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
