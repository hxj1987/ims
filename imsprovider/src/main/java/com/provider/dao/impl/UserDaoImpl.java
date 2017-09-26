package com.provider.dao.impl;
import com.api.model.UserModel;
import com.provider.dao.IUserDao;
import com.provider.mapping.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
@Service("iUserDao")
public class UserDaoImpl implements IUserDao {
    @Autowired
    private UserMapper userMapper;

    public List<UserModel> getUserList(Map<String, Object> map) {
        List<UserModel> list = userMapper.getUserList(map);
        return list;
    }
}
