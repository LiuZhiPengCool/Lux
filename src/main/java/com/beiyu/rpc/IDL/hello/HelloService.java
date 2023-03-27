package com.beiyu.rpc.IDL.hello;

public interface HelloService {
    HelloResponse hello(HelloRequest request);
    HelloResponse hi(HelloRequest request);
}
