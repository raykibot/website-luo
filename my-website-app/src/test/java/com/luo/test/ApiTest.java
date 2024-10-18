package com.luo.test;

import com.luo.domain.entity.ProjectEntity;
import com.luo.domain.repository.IRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApiTest {

    @Resource
    private IRepository repository;


    @Test
    public void homeTest(){

        List<ProjectEntity> projectEntities = repository.queryProjects();
        System.out.println(projectEntities);
        
    }


}
