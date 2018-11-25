package com.github.xufengtian14.badwiki.controller;

import com.github.xufengtian14.badwiki.model.Role;
import com.github.xufengtian14.badwiki.model.Space;
import com.github.xufengtian14.badwiki.model.User;
import com.github.xufengtian14.badwiki.service.IRoleService;
import com.github.xufengtian14.badwiki.service.ISpaceService;
import com.github.xufengtian14.badwiki.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.github.xufengtian14.badwiki.common.response.ObjectRestResponse;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/space")
public class SpaceController {
    @Autowired
    IUserService userService;

    @Autowired
    IRoleService roleService;

    @Autowired
    ISpaceService spaceService;
    /**
     * 获取用户有权限查看的文档空间列表
     * 1. 获取用户角色列表
     * 2.
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse spaceGetList(){
        ObjectRestResponse<List> response = new ObjectRestResponse<>();
//        List<Space> spaces = spaceService.selectSpaceByUserId(Integer user_id);
//        response.setData(spaces);
        return response;
    }

    /**
     * 获取文档的文档信息
     * @param space_id
     * @param doc_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/doc/{doc_id}", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse spaceGetDoc(@PathVariable Integer space_id, @PathVariable Integer doc_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 删除文档
     * @param space_id
     * @param doc_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/doc/{doc_id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ObjectRestResponse spaceDeleteDoc(@PathVariable Integer space_id, @PathVariable Integer doc_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 获取文档的文档内容
     * @param space_id
     * @param doc_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/doc/{doc_id}/content", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse spaceGetDocContent(@PathVariable Integer space_id, @PathVariable Integer doc_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 发布文档的文档内容
     * @param space_id
     * @param doc_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/doc/{doc_id}/content", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse spacePostDocContent(@PathVariable Integer space_id, @PathVariable Integer doc_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 获取文档的子文档列表
     * @param space_id
     * @param doc_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/doc/{doc_id}/sub", method = RequestMethod.GET)
    public ObjectRestResponse spaceGetDocSub(@PathVariable Integer space_id, @PathVariable Integer doc_id, Map<String, Object> parameter){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 新建文档的子文档
     * @param space_id
     * @param doc_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/doc/{doc_id}/sub", method = RequestMethod.POST)
    public ObjectRestResponse spaceAddDocSub(@PathVariable Integer space_id, @PathVariable Integer doc_id, Map<String, Object> parameter){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 获取文档的文档树
     * @param space_id
     * @param doc_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/doc/{doc_id}/tree", method = RequestMethod.GET)
    public ObjectRestResponse spaceGetDocTree(@PathVariable Integer space_id, @PathVariable Integer doc_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 获取文档的正在编辑者
     * @param space_id
     * @param doc_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/doc/{doc_id}/editor", method = RequestMethod.GET)
    public ObjectRestResponse spaceGetDocEditor(@PathVariable Integer space_id, @PathVariable Integer doc_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 更新文档的缓存
     * @param space_id
     * @param doc_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/doc/{doc_id}/content/cache", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse spaceUpdateDocContentCache(@PathVariable Integer space_id, @PathVariable Integer doc_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 删除文档的缓存
     * @param space_id
     * @param doc_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/doc/{doc_id}/content/cache", method = RequestMethod.DELETE)
    @ResponseBody
    public ObjectRestResponse spaceDeleteDocContentCache(@PathVariable Integer space_id, @PathVariable Integer doc_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 获取回收站的文档列表
     * @param space_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/trash", method = RequestMethod.GET)
    public ObjectRestResponse spaceGetTrash(@PathVariable Integer space_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 还原回收站的文档
     * @param space_id
     * @param doc_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/trash/{doc_id}", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse spaceRestoreTrash(@PathVariable Integer space_id, @PathVariable Integer doc_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 彻底删除回收站的文档
     * @param space_id
     * @param doc_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/trash/{doc_id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ObjectRestResponse spaceDeleteTrash(@PathVariable Integer space_id, @PathVariable Integer doc_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 获取文档动态
     * @param space_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/history", method = RequestMethod.GET)
    public ObjectRestResponse spaceGetDocHistory(@PathVariable Integer space_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 获取媒体文件列表
     * @param space_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/media", method = RequestMethod.GET)
    public ObjectRestResponse spaceGetMedia(@PathVariable Integer space_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 上传媒体文件
     * @param space_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/media", method = RequestMethod.POST)
    public ObjectRestResponse spaceUploadMedia(@PathVariable Integer space_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }

    /**
     * 删除媒体文件
     * @param space_id
     * @return
     */
    @RequestMapping(value = "/{space_id}/media/{media_id}", method = RequestMethod.DELETE)
    public ObjectRestResponse spaceUploadMedia(@PathVariable Integer space_id, @PathVariable Integer media_id){
        ObjectRestResponse<String> response = new ObjectRestResponse<>();
        response.setData("Hello World");
        return response;
    }
}
