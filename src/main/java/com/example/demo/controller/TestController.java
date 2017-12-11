package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.UserRedisModel;
import com.example.demo.service.impl.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author fkj
 * @date 2017/12/11 14:02
 **/
@Controller
public class TestController {


    @Autowired
    private RedisServiceImpl userRedisService;

    //添加
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public void test() {
        System.out.println("start.....");
        UserRedisModel m = new UserRedisModel();
        m.setName("张三2");
        m.setPhone(132L);
        m.setAge(24);
        m.setRedisKey("zhangsanKey02");
        userRedisService.put(m.getRedisKey(), m, -1);


        System.out.println("add success end...");
    }

    @RequestMapping(value = "/addJson",method=RequestMethod.GET)
    @ResponseBody
    public void add(){
        System.out.println("start.....");
        UserRedisModel m = new UserRedisModel();
        m.setName("张三3");
        m.setPhone(13333L);
        m.setAge(25);
        m.setRedisKey("zhangsanKey03");
        userRedisService.putJsonString(m.getRedisKey(), m.toString(), -1);
    }

    //查询所有对象
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public Object getAll() {
        return userRedisService.getAll();
    }

    //查询所有key
    @RequestMapping(value = "/getKeys", method = RequestMethod.GET)
    @ResponseBody
    public Object getKeys() {
        return userRedisService.getKeys();
    }

    //根据key查询
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Object get() {
        UserRedisModel m = new UserRedisModel();
        m.setRedisKey("zhangsanKey01");
        return userRedisService.get(m.getRedisKey());
    }

    //删除
    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    @ResponseBody
    public void remove() {
        UserRedisModel m = new UserRedisModel();
        m.setRedisKey("zhangsanKey01");
        userRedisService.remove(m.getRedisKey());
    }

    //判断key是否存在
    @RequestMapping(value = "/isKeyExists", method = RequestMethod.GET)
    @ResponseBody
    public void isKeyExists() {
        User m = new User();
        m.setRedisKey("zhangsanKey01");
        boolean flag = userRedisService.isKeyExists(m.getRedisKey());
        System.out.println("zhangsanKey01 是否存在: "+flag);
    }

    //查询当前缓存的数量
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ResponseBody
    public Object count() {
        return userRedisService.count();
    }

    //清空所有key
    @RequestMapping(value = "/empty", method = RequestMethod.GET)
    @ResponseBody
    public void empty() {
        userRedisService.empty();
    }

}