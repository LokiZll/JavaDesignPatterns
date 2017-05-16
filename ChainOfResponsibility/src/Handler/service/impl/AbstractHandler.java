package Handler.service.impl;

import Handler.service.Handler;

/**
 * Created by ll on 2017/5/16.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
