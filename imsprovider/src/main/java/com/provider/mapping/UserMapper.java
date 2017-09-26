package com.provider.mapping;

import com.api.model.UserModel;

import java.util.List;
import java.util.Map;
public interface UserMapper {
    public List<UserModel> getUserList(Map<String,Object> map);

}
