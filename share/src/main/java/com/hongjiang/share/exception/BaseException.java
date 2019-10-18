package com.hongjiang.share.exception;

import com.hongjiang.share.response.ResponseCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 业务异常类，继承运行时异常，确保事务正常回滚
 * </p>
 * windows 7  旗舰版
 *
 * @author 墨茗琦妙
 * @since 2019/10/18 0018 下午 5:32
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseException extends RuntimeException {

    private ResponseCode code;

    public BaseException(ResponseCode code) {
        this.code = code;
    }

    public BaseException(Throwable cause, ResponseCode code) {
        super(cause);
        this.code = code;
    }
}
