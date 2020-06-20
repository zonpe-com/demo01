/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: CarTest
 *Auther: Administrator
 *Date: 2020/6/13 16:10
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */

import com.zp.domain.Car;
import com.zp.service.CarService;
import com.zp.service.CarServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
    @Test
    public void test1(){
        //xml里配置方式
//        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans2.xml");
//        CarServiceImpl bean = (CarServiceImpl) context1.getBean("carService");
//        Car bmw = new Car("bmw", 1980);
//        bean.add(bmw);
        //使用注解后的方式
        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans3.xml");
        CarService bean2 = context2.getBean(CarService.class);//接口或者实现类皆可
        bean2.add(new Car("byd",1978));

    }
}
