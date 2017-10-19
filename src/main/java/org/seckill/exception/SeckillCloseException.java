package org.seckill.exception;


/**
 * 秒杀关闭异常
 *
 * @author adXiang
 * @date 2017/10/19
 */
public class SeckillCloseException extends SeckillException {
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
