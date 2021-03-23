package com.syg.shenbing;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 单元测试类 继承该类即可测试
 * @Author 田志武
 * @create 2021/3/23 13:04
 */
@Rollback
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShenbingApplication.class)
public abstract class Tester {
}
