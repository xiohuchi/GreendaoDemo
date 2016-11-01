package com.app;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Schema;

/**
 * Author：YangBin
 * Time：2016/10/31.
 * Email：1250211588@qq.com
 * explain：
 */

public class Generator {
    public static void main(String args[]) throws Exception {
        Schema schema = new Schema(3, "greendao");
        addUser(schema);
        //E:\GitHub\GithubPull\RealmPKGreendao\GreendaoExample\src\main\java-gen
        new DaoGenerator().generateAll(schema, "E:\\GitHub\\GithubPull\\GreendaoDemo\\app\\src\\main\\java-gen");
    }
    //用户表
    private static void addUser(Schema schema) {
        Entity entity = schema.addEntity("TABUser");
        entity.addIdProperty().autoincrement();
        entity.addStringProperty("name");
        entity.addStringProperty("age");
        entity.addStringProperty("passWord");
        entity.addStringProperty("email");
        entity.addStringProperty("phoneNumber");
        entity.addStringProperty("description");
    }
}
