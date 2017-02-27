package com.project.moli.callbackdemo;

/**
 * Created by ${jacksen-hss} on 2017/2/27.
 */

public class You {
    //设置成静态的
    public static void executeMessage(CallBack callBack, String question){
        System.out.print("我的问题"+question);
        //模拟你办自己的事情需要很长时间
        for(int i=0; i<10000;i++){
            //.......
        }
        //最后想出来结果等于2
        String result = "答案是2";
        /**
         * 于是就打电话告诉我，调用我中的方法
         * 这就相当于B类反过来调用A的方法D
         */
        callBack.solve(result);


    }
}
