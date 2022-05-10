package com.lagou.educourseboot.controller;

import com.lagou.educourseboot.entity.Course;
import com.lagou.educourseboot.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author littlelee
 * @date 2022/5/10 11:30
 * @description:
 */
@RestController
@RequestMapping("course")
@CrossOrigin //跨域
public class CourseController {

    @Autowired
    private CourseService courseService;


    @GetMapping("getAllCourse")
    public List<Course> getAllCourse() {
//        ExecutorService es = Executors.newFixedThreadPool(20);
//        for(int i = 1 ;i<=20;i++){
//            es.submit(new Runnable() {
//                @Override
//                public void run() {
//                    courseService.getAllCourse();
//                }
//            });
//        }
        return courseService.getAllCourse();
    }

    @GetMapping("getCourseById/{courseid}")
    public Course getCourseById(@PathVariable("courseid")Integer courseid) {
        Course course = courseService.getCourseById(courseid);
        return course;
    }

    @GetMapping("getMyCoursesById")
    public List<Course> getMyCoursesById( String ids ) {
        System.out.println("待查询的课程id：" +ids);

        List<String> idList = new ArrayList<>();
        String id = null;
        while(ids.indexOf("=")>0) {
            if (ids.indexOf("&") > 0) {
                id = ids.substring(ids.indexOf("=") + 1, ids.indexOf("&"));
                System.out.println(id);
                ids = ids.substring(ids.indexOf("&")+1);
            } else {
                id = ids.substring(ids.indexOf("=") + 1);
                System.out.println(id);
                ids = ids.substring(ids.indexOf("=")+1);
            }
            idList.add(id);
        }
        System.out.println(idList);  //[7, 9]

        List<Course> list = courseService.getMyCoursesById(idList);
        return list;
    }

}
