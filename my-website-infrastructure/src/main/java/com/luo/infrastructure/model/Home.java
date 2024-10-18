package com.luo.infrastructure.model;

import lombok.Data;

@Data
public class Home {

    //自增id
    private Integer id;

    //项目消息
    private String projects;

    //资源消息
    private String resources;

    //发展消息
    private String progress;

    //创建时间
    private String createTime;

    //更新时间
    private String updateTime;
}
