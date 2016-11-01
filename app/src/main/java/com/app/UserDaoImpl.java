package com.app;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.ArrayList;
import java.util.List;

import greendao.TABUser;
import greendao.TABUserDao;

/**
 * Author：YangBin
 * Time：2016/10/31.
 * Email：1250211588@qq.com
 * explain：
 */

public class UserDaoImpl implements UserDao {

    private greendao.TABUserDao getTABUserDao() {
        return App.getDaoSession().getTABUserDao();
    }

    @Override
    public void insert(TABUser user) {

    }

    @Override
    public void insertList(List<TABUser> userList) {

    }

    @Override
    public List<TABUser> getAllUser() {
        return null;
    }

    @Override
    public TABUser updateUser(TABUser user) {
        return null;
    }

    @Override
    public void updateUser(String nameOld, String nameNew) {

    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public TABUser findByNameOrAge(String name1, int age1) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
