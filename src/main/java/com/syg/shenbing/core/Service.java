package com.syg.shenbing.core;

import org.apache.ibatis.exceptions.TooManyResultsException;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * Service 层 基础接口，其他Service 接口 请继承该接口
 * @Author 田志武
 * @create 2021/3/23 11:22
 */
public interface Service<T> {

    /**
     * 保存数据
     * @param t
     */
    void save(T t);

    /**
     * 批量保存
     * @param ts
     */
    void save(List<T> ts);

    /**
     * 根据id删除数据
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 批量删除  ids -> “1,2,3,4”
     * @param ids
     */
    void deleteByIds(String ids);

    /**
     * 更新数据
     * @param t
     */
    void update(T t);

    /**
     * 通过id查询
     * @param id
     * @return
     */
    T findById(Integer id);

    /**
     * 通过 t 中某个成员变量名称（非数据表中column的名称）查找,value需符合unique约束
     * @param fieldName
     * @param value
     * @return
     * @throws TooManyResultsException
     */
    T findBy(String fieldName,Object value) throws TooManyResultsException;

    /**
     * 根据ids查询 ids -> “1,2,3,4”
     * @param ids
     * @return
     */
    List<T> findByIds(String ids);

    /**
     * 根据条件查询
     * @param condition
     * @return
     */
    List<T> findByCondition(Condition condition);

    /**
     * 查询所有
     * @return
     */
    List<T> findAll();
}
