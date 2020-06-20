/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: AspectjTest
 *Auther: Administrator
 *Date: 2020/6/14 14:22
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */

import com.zp.domain.Car;
import com.zp.service.CarService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectjTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans6.xml");
        CarService bean = context.getBean(CarService.class);
        bean.add(new Car("sada",245));
        //如果使用注解配置同时又在xml里配置会出现，重复通知
    }
}
