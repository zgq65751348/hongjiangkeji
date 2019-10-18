package com.hongjiang.mall.service;

import com.hongjiang.mall.entity.User;
import com.hongjiang.share.exception.BaseException;
import com.hongjiang.share.response.ResponseCode;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 * windows 7  旗舰版
 *
 * @author 墨茗琦妙
 * @since 2019/10/18 0018 下午 4:54
 */
@Service
public class IndexService {

    public User getOnrUserById(Integer id) {
        if (id == 2) {
            throw new RuntimeException();
        }

        if (id == 0) {
            throw new BaseException(ResponseCode.RESOURCES_NOT_EXIST);
        }
        User user = new User();
        user.setId(2);
        user.setName("易水玄裳");
        return user;
    }
}
