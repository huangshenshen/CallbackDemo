package com.project.moli.callbackdemo;

/**
 * Created by ${jacksen-hss} on 2017/2/27.
 */

public class Me implements CallBack{
    //我问你一个问题必须持有你的引用
    private You you;

    public Me(You you) {
        this.you = you;
    }
    public void hasquestion(final String question){
        new Thread(new Runnable() {
            @Override
            public void run() {
                /**
                 * 我调用你中的方法，在这里注册回调接口
                 * 这就相当于A类调用B的方法C
                 */
                You.executeMessage(Me.this, question);
            }
        }).start();
        play();

    }
    public void play(){
        System.out.print("逛街办事去了");
    }
    //你知道答案后调用此方法告诉我，就是所谓的我的回调方法
    @Override
    public void solve(String result) {//实现接口中的回调方法
        System.out.println(result);

    }
}
