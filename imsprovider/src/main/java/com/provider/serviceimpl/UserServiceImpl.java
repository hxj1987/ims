package com.provider.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.api.model.UserModel;
import com.api.services.IUserService;
import com.provider.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Service(interfaceClass = IUserService.class,protocol = {"dubbo"},version = "1.0.0")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao iUserDao;

    public List<UserModel> getUserList(Map<String, Object> map) {
        System.out.println("========"+iUserDao.getUserList(map));
        return iUserDao.getUserList(map);
    }
}
