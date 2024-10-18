package com.luo.domain.repository;

import com.luo.domain.entity.ProjectEntity;

import java.util.List;

public interface IRepository {


    List<ProjectEntity> queryProjects();


}
