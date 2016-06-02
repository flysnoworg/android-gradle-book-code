package org.flysnow.app.example132;

/**
 * @author 飞雪无情
 * @since 16-6-1 下午9:24
 */
public class HelloWorld {
    static {
        System.loadLibrary("helloworld");
    }
    public native String getHelloWorld();
}
