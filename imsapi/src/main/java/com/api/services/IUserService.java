package com.api.services;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.api.model.UserModel;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;
public interface IUserService {

    public List<UserModel> getUserList(Map<String, Object> map);

}
