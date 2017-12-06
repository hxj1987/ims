package com.api.services;


import com.api.model.UserModel;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/restService")
@Consumes({MediaType.APPLICATION_JSON})    // @Consumes 注释代表的是一个资源可以接受的 MIME 类型
@Produces({MediaType.APPLICATION_JSON})    //@Produces 注释代表的是一个资源可以返回的 MIME 类型
public interface IRestService {

    @GET
    @Path("/getUserList4Rest")
    public List<UserModel> getUserList4Rest(@QueryParam("data") String data);
}
