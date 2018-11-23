package com.github.xufengtian14.badwiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.xufengtian14.badwiki.common.response.ObjectRestResponse;

@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 获取用户自身信息
     * @return
     */
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse userInfo(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 修改用户自身密码
     * @return
     */
    @RequestMapping(value = "/password", method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse userPassword(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

}
