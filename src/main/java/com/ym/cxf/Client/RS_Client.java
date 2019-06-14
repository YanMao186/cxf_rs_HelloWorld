package com.ym.cxf.Client;

import com.ym.cxf.Service.IUserService;
import com.ym.cxf.domain.User;
import org.apache.cxf.jaxrs.client.WebClient;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

/**
 * @program: common_parent
 * @description:客户端
 * @author: Mr.Yan
 * @create: 2019-05-27 09:56
 **/

public class RS_Client {
    public static void main(String[] args) {
        /**
         * create 建立与调用服务资源路径连接
         * type 发送给服务器数据格式 --@Consumes
         * accept 接受服务器传输数据格式  --@Produces
         * 采用http协议哪种方式访问服务器
         */
        Collection<? extends User> collection = WebClient.create("http://localhost:9997/userService/user").accept(MediaType.APPLICATION_XML).getCollection(User.class);
        System.out.println(collection);
        //添加用户
        User user = new User();
        WebClient.create("http://localhost:9997/userService/user").type(MediaType.APPLICATION_XML).post(user);
    }
}
