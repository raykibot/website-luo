package com.luo.infrastructure.dao;

import com.luo.infrastructure.model.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectDao {

    List<Project>  queryProjects();


}
