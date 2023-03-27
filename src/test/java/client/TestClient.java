package client;

import com.beiyu.rpc.IDL.hello.HelloRequest;
import com.beiyu.rpc.IDL.hello.HelloResponse;
import com.beiyu.rpc.IDL.hello.HelloService;
import com.beiyu.rpc.core.client.RpcClientProxy;

public class TestClient {

    public static void main(String[] args) {
        // 获取RpcService
        RpcClientProxy proxy = new RpcClientProxy();
        HelloService helloService = proxy.getService(HelloService.class);
        // 构造出请求对象HelloRequest
        HelloRequest helloRequest = new HelloRequest("刘志鹏");
        // rpc调用并返回结果对象HelloResponse
        HelloResponse helloResponse = helloService.hello(helloRequest);
        // 从HelloResponse中获取msg
        String msg = helloResponse.getMsg();
        System.out.println(msg);

        // 调用hi方法
        HelloResponse hiResponse = helloService.hi(helloRequest);
        String hiMsg = hiResponse.getMsg();
        System.out.println(hiMsg);
    }

}
