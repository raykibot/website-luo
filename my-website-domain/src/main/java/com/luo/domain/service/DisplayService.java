package com.luo.domain.service;

import com.luo.domain.entity.ProjectEntity;
import com.luo.domain.repository.IRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DisplayService implements IDisplayService{

    @Resource
    private IRepository repository;


    @Override
    public List<ProjectEntity> queryProjectList() {
        return repository.queryProjects();
    }
}
