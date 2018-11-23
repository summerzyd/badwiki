package com.github.xufengtian14.badwiki.controller;

import com.github.xufengtian14.badwiki.common.response.ObjectRestResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
    /**
     * 登录后的首页
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse index(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }
}
