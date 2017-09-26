package com.provider.dao;

import com.api.model.UserModel;

import java.util.List;
import java.util.Map;

public interface IUserDao {

    public List<UserModel> getUserList(Map<String,Object> map);

}
