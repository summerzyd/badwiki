package com.github.xufengtian14.badwiki.controller;

import com.github.xufengtian14.badwiki.common.response.ObjectRestResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/system")
public class SystemController {
    /**
     * 获取用户列表
     * @param
     * @return
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse systemGetUser(@RequestBody Map<String, Object> parameter){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 编辑用户
     * @param
     * @return
     */
    @RequestMapping(value = "/user/{user_id}", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse systemEditUser(@PathVariable Integer user_id, @RequestBody Map<String, Object> parameter){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 新增本地用户
     * @param
     * @return
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse systemAddUser(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 删除用户
     * @param
     * @return
     */
    @RequestMapping(value = "/user/{user_id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ObjectRestResponse systemDeleteUser(@PathVariable Integer user_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 获取角色列表
     * @param
     * @return
     */
    @RequestMapping(value = "/role", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse systemGetRole(@RequestBody Map<String, Object> parameter){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 编辑角色
     * @param
     * @return
     */
    @RequestMapping(value = "/role/{role_id}", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse systemEditRole(@PathVariable Integer role_id, @RequestBody Map<String, Object> parameter){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 新增角色
     * @param
     * @return
     */
    @RequestMapping(value = "/role", method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse systemAddRole(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 删除角色
     * @param
     * @return
     */
    @RequestMapping(value = "/role/{role_id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ObjectRestResponse systemDeleteRole(@PathVariable Integer role_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 获取文档空间列表
     * @param
     * @return
     */
    @RequestMapping(value = "/space", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse systemGetSpace(@RequestBody Map<String, Object> parameter){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 编辑文档空间
     * @param
     * @return
     */
    @RequestMapping(value = "/space/{space_id}", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse systemEditSpace(@PathVariable Integer space_id, @RequestBody Map<String, Object> parameter){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 新增文档空间
     * @param
     * @return
     */
    @RequestMapping(value = "/space", method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse systemAddSpace(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 删除文档空间
     * @param
     * @return
     */
    @RequestMapping(value = "/space/{space_id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ObjectRestResponse systemDeleteSpace(@PathVariable Integer space_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 获取站点设置信息
     * @param
     * @return
     */
    @RequestMapping(value = "/site", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse systemGetSite(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 编辑站点设置信息
     * @param
     * @return
     */
    @RequestMapping(value = "/site", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse systemEditSite(@RequestBody Map<String, Object> parameter){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 获取邮箱设置信息
     * @param
     * @return
     */
    @RequestMapping(value = "/email", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse systemGetEmail(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 编辑邮箱设置信息
     * @param
     * @return
     */
    @RequestMapping(value = "/email", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse systemEditEmail(@RequestBody Map<String, Object> parameter){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 获取注册设置信息
     * @param
     * @return
     */
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse systemGetSignup(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 编辑注册设置信息
     * @param
     * @return
     */
    @RequestMapping(value = "/signup", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse systemEditSignup(@RequestBody Map<String, Object> parameter){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 获取LDAP设置信息
     * @param
     * @return
     */
    @RequestMapping(value = "/ldap", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse systemGetLdap(){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }

    /**
     * 编辑LDAP设置信息
     * @param
     * @return
     */
    @RequestMapping(value = "/ldap", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse systemEditLdap(@RequestBody Map<String, Object> parameter){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("hello world");
        return response;
    }
}
