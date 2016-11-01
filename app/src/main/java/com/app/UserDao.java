package com.app;

import java.util.List;

import greendao.TABUser;

/**
 * 操作数据库的接口Dao
 *
 * @author  nanchen
 * @date   2016-08-08  17:23:18
 *
 */
public interface UserDao {

    /**
     * 插入一个用户
     * @param user    需要插入的用户对象
     * @
     */
    void insert(TABUser user) ;

    /**
     * 获得所有的用户列表
     * @return 用户列表
     * @
     */
    List<TABUser> getAllUser() ;

    /**
     * 更新一个用户
     * @param user 需要更新的用户类
     * @return      更新后的对象
     * @
     */
    TABUser updateUser(TABUser user) ;

    /**
     * 根据姓名修改新姓名
     * @param name1 老名字
     * @param name2 新名字
     * @
     */
    void updateUser(String name1, String name2) ;

    /**
     * 根据id删除用户
     * @param id 用户主键
     * @
     */
    void deleteUser(int id) ;

    /**
     * 异步添加用户
     * @param user 需要添加的用户对象
     * @
     */
    void insertUserAsync(TABUser user) ;

    /**
     * 按名字或者年龄查找第一个User
     */
    TABUser findByNameOrAge(String name1, int age1) ;

    /**
     * 清楚所有
     * @
     */
    void deleteAll() ;
}
