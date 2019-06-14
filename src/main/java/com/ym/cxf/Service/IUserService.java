package com.ym.cxf.Service;

import com.ym.cxf.domain.Car;
import com.ym.cxf.domain.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.*;
import java.util.List;

/**
 * @program: common_parent
 * @description:
 * @author: Mr.Yan
 * @create: 2019-05-27 09:00
 **/

/**
 * 第一种 @path服务访问资源路径
 * 如果访问saveUser方法   /userService/user
 * 第二种 @Produces 生成(方法返回值) @Consumes消费(方法参数)
 * @Consumes 指定能够处理客户端传递过来数据格式
 * @Produces 指定能否生成那种格式数据返回给客户端
 * 第三种 @GET 查询 @PUT 修改 @POST 增加 @DELETE 删除
 */
@Path("/userService")
@Produces("*/*")
public interface IUserService {
    /**
     */
    @POST
    @Path("/user")
    @Consumes({ "application/xml", "application/json" })
    public void saveUser(User user);

    @PUT
    @Path("/user")
    @Consumes({ "application/xml", "application/json" })
    public void updateUser(User user);

    @GET
    @Path("/user")
    @Produces({ "application/xml", "application/json" })
    public List<User> findAllUsers();

    @GET
    @Path("/user/{id}")
    @Consumes("application/xml")
    public User finUserById(@PathParam("id") Integer id);

    @DELETE
    @Path("/user/{id}")
    @Consumes("application/xml")
    public void deleteUser(@PathParam("id") Integer id);

}
