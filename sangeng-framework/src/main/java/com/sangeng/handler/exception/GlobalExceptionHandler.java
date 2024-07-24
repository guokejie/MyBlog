package com.sangeng.handler.exception;

import com.sangeng.domain.ResponseResult;
import com.sangeng.enums.AppHttpCodeEnum;
import com.sangeng.exception.SystemException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

// 对controller的增强，在controller如果出现了任意的异常，都在这里处理
// 不会放到响应体中
//@ControllerAdvice
//@ResponseBody
@RestControllerAdvice
@Slf4j // 日志
public class GlobalExceptionHandler {
    @ExceptionHandler(SystemException.class) // 能处理异常的字节码对象
    public ResponseResult systemExceptionHandler(SystemException e) {
        // 打印异常信息
        log.error("出现了异常！{}", e);
        // 从异常对象中获取提示信息，封装返回
        return ResponseResult.errorResult(e.getCode(), e.getMsg());
    }

    @ExceptionHandler(Exception.class) // 能处理异常的字节码对象
    public ResponseResult exceptionHandler(Exception e) {
        // 打印异常信息
        log.error("出现了异常！{}", e);
        // 从异常对象中获取提示信息，封装返回
        return ResponseResult.errorResult(AppHttpCodeEnum.SYSTEM_ERROR.getCode(), e.getMessage());
    }
}
