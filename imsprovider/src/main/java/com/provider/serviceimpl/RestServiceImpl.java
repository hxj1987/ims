package com.provider.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.api.model.UserModel;
import com.api.services.IRestService;
import com.provider.dao.IUserDao;
import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service(interfaceClass = IRestService.class,protocol = {"dubbo","rest"},version = "1.0.0")
public class RestServiceImpl implements IRestService {

    @Autowired
    private IUserDao iUserDao;
    @Override
    public List<UserModel> getUserList4Rest(String data) {
        Map<String, Object> maps = null;
        if(StringUtils.isNotEmpty(data)){
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                maps = objectMapper.readValue(data, Map.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //System.out.println(maps.toString());
        System.out.println("========"+iUserDao.getUserList(maps));
        return iUserDao.getUserList(maps);
    }
}
