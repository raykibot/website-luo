package com.luo.type.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseType<T>{

    private String code;

    private String info;

    private T data;


}
