package com.utils;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.api.model.User;

import java.util.Collection;
import java.util.*;

public class SerializationOptimizerImpl implements SerializationOptimizer {
    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        //这里可以把所有需要进行序列化的类进行添加
        classes.add(User.class);
        return classes;
    }
}
