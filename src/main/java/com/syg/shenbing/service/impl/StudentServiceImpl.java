package com.syg.shenbing.service.impl;

import com.syg.shenbing.mapper.StudentMapper;
import com.syg.shenbing.entity.Student;
import com.syg.shenbing.service.StudentService;
import com.syg.shenbing.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
* @Author 田志武
* @create 2021/03/23 13:17
*/
@Service
@Transactional
public class StudentServiceImpl extends AbstractService<Student> implements StudentService {
@Resource
private StudentMapper studentMapper;

}
