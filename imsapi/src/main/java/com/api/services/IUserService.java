package com.api.services;

import com.api.model.UserModel;

import java.util.*;

public interface IUserService {

    public List<UserModel> getUserList(Map<String, Object> map);
}
