package com.luo.trigger.controller;

import com.luo.domain.entity.ProjectEntity;
import com.luo.domain.service.IDisplayService;
import com.luo.type.commons.Constant;
import com.luo.type.response.ResponseType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/web")
@Slf4j
public class WebsiteController {

    @Resource
    private IDisplayService displayService;

    @RequestMapping(value = "one", method = RequestMethod.GET)
    public ResponseType<List<ProjectEntity>> getProjects(){

        try {
            log.info("查询项目列表");
            List<ProjectEntity> projectEntities = displayService.queryProjectList();
            return ResponseType.<List<ProjectEntity>>builder()
                    .code(Constant.ResponseCode.SUCCESS_CODE)
                    .info(Constant.ResponseCode.SUCCESS_INFO)
                    .data(projectEntities)
                    .build();
        } catch (Exception e) {
            return ResponseType.<List<ProjectEntity>>builder()
                    .code(Constant.ResponseCode.FAIL_CODE)
                    .info(Constant.ResponseCode.FAIL_INFO)
                    .data(null)
                    .build();
        }

    }


}
