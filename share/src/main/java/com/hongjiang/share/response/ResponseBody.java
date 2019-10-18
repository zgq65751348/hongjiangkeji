package com.hongjiang.share.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p>
 *Controller增强后统一响应体对应的对象
 * </p>
 * windows 7  旗舰版
 *
 * @author 墨茗琦妙
 * @since 2019/10/18 0018 下午 5:27
 */
@Data
@AllArgsConstructor
public class ResponseBody {

    /**
     * 返回状态码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 数据
     */
    private Object data;


}
