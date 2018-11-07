package com.javaman.chain.template;

/**
 * @author pengzhe
 * @date 2018/11/7 14:41
 */
public abstract class Handler {

    private Handler nextHandler;

    /**
     * 请求的处理方法
     *
     * @param request
     * @return
     */
    public final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {//不属于自己处理级别
            //判断是否有下一个处理者
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                //没有适当的处理者
            }

        }
        return response;
    }

    /**
     * 链的编排方法
     * 设置下一个处理者是谁
     *
     * @param handler
     */
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    /**
     * 每个处理者都有一个处理级别
     *
     * @return
     */
    protected abstract Level getHandlerLevel();

    /**
     * 每个处理者都必须实现处理任务
     *
     * @param request
     * @return
     */
    protected abstract Response echo(Request request);

}
