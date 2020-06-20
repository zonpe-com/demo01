/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: Aoptest
 *Auther: Administrator
 *Date: 2020/6/14 10:48
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */

import com.zp.dao.CarDao;
import com.zp.domain.Car;
import com.zp.service.CarService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aoptest {
    //spring半自动实现AOP编程
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        CarDao bean = context.getBean(CarDao.class);
//        CarService carService = (CarService) context.getBean("serviceProxy");
//        carService.add(new Car("lzwl",3575));
    }
    //spring自动实现AOP编程
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
        CarDao bean = context.getBean(CarDao.class);
//        CarService carService = (CarService) context.getBean("carService");
//        carService.add(new Car("lzwl",3575));
    }
}
