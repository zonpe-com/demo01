/*
 *Copyright (C), 2020-2020, www.zonpe.com
 *FileName: ProxyTest
 *Auther: Administrator
 *Date: 2020/6/13 19:47
 *Description:
 *History:
 *<author>          <time>          <version>          <desc>
 *作者姓名           修改时间           版本号              描述
 */

import com.zp.domain.Car;
import com.zp.service.CarService;
import com.zp.service.CarServiceFactory;
import com.zp.service.CarServiceImpl;
import org.junit.Test;

public class ProxyTest {
    /**
     * 测试自己使用jdk动态代理增强的接口
     */
    @Test
    public void test(){
        CarService carService = CarServiceFactory.createCarService();
        carService.add(new Car("hanma",5224));
    }
    /**
     * 测试自己使用cglib实现代理增强的类
     */
    @Test
    public void test2(){
        CarService carService = CarServiceFactory.createCarService2();
        carService.add(new Car("hanma",5224));
    }
}
