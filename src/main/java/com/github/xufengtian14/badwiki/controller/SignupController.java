package com.github.xufengtian14.badwiki.controller;

import com.github.xufengtian14.badwiki.common.response.ObjectRestResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sginup")
public class SignupController {
    /**
     * 获取注册页面
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse getSignupPage(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 注册
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse signup(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 激活用户
     * @return
     */
    @RequestMapping(value = "/active", method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse activeUser(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }
}
