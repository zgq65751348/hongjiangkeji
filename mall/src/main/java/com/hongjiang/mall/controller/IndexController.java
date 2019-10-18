package com.hongjiang.mall.controller;

import com.hongjiang.mall.entity.User;
import com.hongjiang.mall.service.IndexService;
import com.hongjiang.share.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 * windows 7  旗舰版
 *
 * @author 墨茗琦妙
 * @since 2019/10/18 0018 下午 4:52
 */
@RestController
@BaseResponse
@RequestMapping(value = "/index")
public class IndexController  {

    @Autowired
    private IndexService indexService;

   @GetMapping(value = "/app")
    public User index(Integer id){
        return indexService. getOnrUserById(id);

    }

}
