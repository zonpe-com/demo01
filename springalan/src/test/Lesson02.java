/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: Lesson02
 *Auther: Administrator
 *Date: 2020/6/13 10:19
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */

import com.zp.service.CustomerService;
import com.zp.service.CustomerServiceImpl;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Lesson02 {
    @Test
    public void test1(){
//        CustomerService service = new CustomerServiceImpl();
//        System.out.println("service = " + service);
//        service.add();
//
        ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
        CustomerService customerService = (CustomerService) context.getBean("customerService");
//        CustomerService customerService2 = (CustomerService) context.getBean("customerService");
//        System.out.println("customerService = " + customerService);
//        System.out.println("customerService2 = " + customerService2);
        customerService.add();

        //spring容器创建的三种方式
        //第一种 通过class类路径加载配置文件，也就是classes的路径
        //第二种 通过文件系统的全路径获得配置文件
        //第三种 使用BeanFactory
//        String path = "E:\\ideaspace\\xiaobao\\springalan\\src\\main\\resources\\beans.xml";
//        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource(path));
//        CustomerService customerService3 = (CustomerService) beanFactory.getBean("customerService");
//        customerService3.add();
    }
}
