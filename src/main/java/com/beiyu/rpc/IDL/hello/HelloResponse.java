package com.beiyu.rpc.IDL.hello;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class HelloResponse implements Serializable {
    String msg;
}
