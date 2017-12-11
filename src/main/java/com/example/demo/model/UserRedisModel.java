package com.example.demo.model;

import java.io.Serializable;

/**
 * @author fkj
 * @date 2017/12/11 15:11
 **/
//用来redis的实体类
public class UserRedisModel implements Serializable {

    private String redisKey;

    private Integer id;

    private String name;

    private Integer age;

    private Long phone;

    public void setRedisKey(String redisKey) {
        this.redisKey = redisKey;
    }

    public String getRedisKey() {
        return redisKey;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
}

