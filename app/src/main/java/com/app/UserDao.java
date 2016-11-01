package com.app;

import java.util.List;

import greendao.TABUser;

/**
 * 操作数据库的接口Dao
 *
 * @author nanchen
 * @date 2016-08-08  17:23:18
 */
public interface UserDao {

    /**
     * 插入一个用户
     *
     * @param user
     */
    void insert(TABUser user);

    /**
     * 插入多个用户
     *
     * @param userList
     */
    void insertList(List<TABUser> userList);

    /**
     * 获得所有的用户列表
     *
     * @return 用户列表
     * @
     */
    List<TABUser> getAllUser();

    /**
     * 更新一个用户
     *
     * @param user 需要更新的用户类
     * @return 更新后的对象
     * @
     */
    TABUser updateUser(TABUser user);

    /**
     * 根据姓名修改新姓名
     *
     * @param nameOld 老名字
     * @param nameNew 新名字
     * @
     */
    void updateUser(String nameOld, String nameNew);

    /**
     * 根据id删除用户
     *
     * @param id 用户主键
     * @
     */
    void deleteUser(int id);

    /**
     * 按名字或者年龄查找第一个User
     */
    TABUser findByNameOrAge(String name1, int age1);

    /**
     * 清楚所有
     *
     * @
     */
    void deleteAll();
}
