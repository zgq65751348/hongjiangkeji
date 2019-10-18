package com.hongjiang.share.exception;

import com.hongjiang.share.response.BaseResponse;
import com.hongjiang.share.response.ResponseCode;
import com.hongjiang.share.response.ResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 异常处理器
 * </p>
 * windows 7  旗舰版
 *
 * @author 墨茗琦妙
 * @since 2019/10/18 0018 下午 5:33
 */

@ControllerAdvice(annotations = BaseResponse.class)
@ResponseBody
@Slf4j
public class ExceptionHandlerAdvice {
    /**
     * 处理未捕获的Exception
     * @param e 异常
     * @return 统一响应体
     */
    @ExceptionHandler(Exception.class)
    public ResponseData handleException(Exception e){
        log.error(e.getMessage(),e);
        return new ResponseData(ResponseCode.SERVICE_ERROR.getCode(),ResponseCode.SERVICE_ERROR.getMessage(),null);
    }

    /**
     * 处理未捕获的RuntimeException
     * @param e 运行时异常
     * @return 统一响应体
     */
    @ExceptionHandler(RuntimeException.class)
    public ResponseData handleRuntimeException(RuntimeException e){
        log.error(e.getMessage(),e);
        return new ResponseData(ResponseCode.SERVICE_ERROR.getCode(),ResponseCode.SERVICE_ERROR.getMessage(),null);
    }

    /**
     * 处理业务异常BaseException
     * @param e 业务异常
     * @return 统一响应体
     */
    @ExceptionHandler(BaseException.class)
    public ResponseData handleBaseException(BaseException e){
        log.error(e.getMessage(),e);
        ResponseCode code=e.getCode();
        return new ResponseData(code.getCode(),code.getMessage(),null);
    }
}
