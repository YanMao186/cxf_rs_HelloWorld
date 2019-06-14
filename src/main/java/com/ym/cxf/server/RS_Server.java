package com.ym.cxf.server;

import com.ym.cxf.Service.IUserService;
import com.ym.cxf.Service.Impl.IUserServiceImpl;
import com.ym.cxf.domain.Car;
import com.ym.cxf.domain.User;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import javax.xml.ws.Endpoint;

/**
 * @program: common_parent
 * @description:发布服务
 * @author: Mr.Yan
 * @create: 2019-05-27 09:41
 **/

public class RS_Server {
    public static void main(String[] args) {
       //创建业务接口,实现类对象
        IUserService userService = new IUserServiceImpl();
        //服务器FactoryBean创建对象
        JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
        jaxrsServerFactoryBean.setResourceClasses(User.class, Car.class);
        jaxrsServerFactoryBean.setServiceBean(userService);
        jaxrsServerFactoryBean.setAddress("http://localhost:9997");
        //3.发布服务
        jaxrsServerFactoryBean.create();
        System.out.println("服务已经启动");
    }
}
