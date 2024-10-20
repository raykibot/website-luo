package com.luo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class ProjectEntity {

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
