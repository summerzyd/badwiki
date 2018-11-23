package com.github.xufengtian14.badwiki.controller;

import com.github.xufengtian14.badwiki.common.response.ObjectRestResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sginin")
public class SigninController {
    /**
     * 获取登录页面
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse getSigninPage(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 登录
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse signin(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 发送忘记密码邮件
     * @return
     */
    @RequestMapping(value = "forget_password", method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse sendForgetPasswordEmail(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 验证忘记密码用户
     * @return
     */
    @RequestMapping(value = "forget_password", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse validateForgetPasswordUser(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 修改用户密码
     * @return
     */
    @RequestMapping(value = "re_password", method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse changeUserPassword(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }
}
