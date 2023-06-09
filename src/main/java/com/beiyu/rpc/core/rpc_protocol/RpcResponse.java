package com.beiyu.rpc.core.rpc_protocol;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class RpcResponse implements Serializable {

    // 协议头
    private String header;

    // 协议体
    private byte[] body;

}
