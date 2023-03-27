package com.beiyu.rpc.IDL.hello;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class HelloRequest implements Serializable {
    String name;
}
