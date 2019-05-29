package com.example.xts.greendaodemo.db;

import java.util.ArrayList;

import max.jy.hzl.myapplication.bean.Student;

/**
 * Created by asus on 2019/5/29.
 */

public class DBdao {
    public static Student queryOne(Student stu){
        return MyApplication.getDaoSession().queryBuilder(Student.class)
                .where(StudentDao.Properties.Name.eq(stu.getName()))
                .build()
                .unique();
    }


    public static ArrayList<Student> queryAll(){
        return (ArrayList<Student>) MyApplication.getDaoSession().loadAll(Student.class);
    }

    public static void insert(Student stu){
        Student student = queryOne(stu);
        if(student==null){
            MyApplication.getDaoSession().insert(stu);
        }
    }
}
