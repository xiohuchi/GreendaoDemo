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
    @Override
    public void insert(TABUser user) {
        getTABUserDao().insertOrReplace(user);
        List<TABUser> userList = new ArrayList<>();
        getTABUserDao().insertInTx(userList);
        getTABUserDao().insertOrReplaceInTx(userList);
    }

    @Override
    public List<TABUser> getAllUser() {
        List<TABUser> list;
        QueryBuilder<TABUser> qb = getTABUserDao().queryBuilder()
                .where(TABUserDao.Properties.Name.isNotNull(),
                        TABUserDao.Properties.Name.eq("XiaoMing"),
                        TABUserDao.Properties.Age.between(20, 30),
                        TABUserDao.Properties.PhoneNumber.like("177"))
                .whereOr(TABUserDao.Properties.Age.between(20, 30),
                        TABUserDao.Properties.PhoneNumber.like("177"))
                .limit(10)
                .orderAsc()
                .orderDesc(TABUserDao.Properties.Name);
        long count = qb.count();
        list = qb.list();
        return getTABUserDao().loadAll();
    }

    @Override
    public TABUser updateUser(TABUser user) {
        getTABUserDao().updateInTx();
        return null;
    }

    @Override
    public void updateUser(String name1, String name2) {

    }

    @Override
    public void deleteUser(int id) {
        getTABUserDao().deleteByKey(1l);
    }

    @Override
    public void insertUserAsync(TABUser uselr) {

    }

    @Override
    public TABUser findByNameOrAge(String name1, int age1) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    private greendao.TABUserDao getTABUserDao() {
        return App.getDaoSession().getTABUserDao();
    }
}
