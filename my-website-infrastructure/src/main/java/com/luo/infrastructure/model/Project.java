package com.luo.infrastructure.model;

import lombok.Data;

@Data
public class Project {

    //自增id
    private Integer id;

    //项目名称
    private String title;

    //项目图片
    private String photo;

    //项目描述
    private String description;

    //前端技术
    private String frontTechnology;

    //后端技术
    private String backendTechnology;

    //创建时间
    private String createTime;

    //更新时间
    private String updateTime;
}
