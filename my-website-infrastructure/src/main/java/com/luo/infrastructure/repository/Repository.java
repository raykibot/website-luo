package com.luo.infrastructure.repository;

import com.luo.domain.entity.ProjectEntity;
import com.luo.domain.repository.IRepository;
import com.luo.infrastructure.dao.ProjectDao;
import com.luo.infrastructure.model.Project;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository implements IRepository {

    @Resource
    private ProjectDao projectDao;

    @Override
    public List<ProjectEntity> queryProjects() {
        List<Project> projectList = projectDao.queryProjects();
        List<ProjectEntity> list = new ArrayList<>();
        for (Project project : projectList) {
            ProjectEntity projectEntity = ProjectEntity.builder()
                    .title(project.getTitle())
                    .photo(project.getPhoto())
                    .description(project.getDescription())
                    .frontTechnology(project.getFrontTechnology())
                    .backendTechnology(project.getBackendTechnology())
                    .createTime(project.getCreateTime())
                    .updateTime(project.getUpdateTime())
                    .build();
            list.add(projectEntity);
        }
        return list;
    }
}
