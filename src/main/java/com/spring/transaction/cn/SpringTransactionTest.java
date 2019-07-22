package com.spring.transaction.cn;

import com.spring.transaction.cn.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解版事务：
 * 1. 使用Spring本身的事务，需要在spring.xml文件里开启事务
 * 2. 不再像项目 spring-demon 中那样写 TransactionUtils 和 AopLog 联合处理（AOP和事务）
 */
public class SpringTransactionTest {

    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        // 加入事务方法
        userService.insert();
    }

    /**
     * 事务特性：原子性、一致性、持久性、隔离性
     */
}
