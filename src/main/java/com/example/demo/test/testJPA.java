package com.example.demo.test;

import com.example.demo.dao.CategoryDAO;
import com.example.demo.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.example.demo.DemoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class testJPA {

    @Autowired
    CategoryDAO dao;

    @Test
    public void test(){
        List<Category> cs = dao.findAll();
        for (Category c : cs){
            System.out.println("c.getName():", c.getName());
        }
    }
}
