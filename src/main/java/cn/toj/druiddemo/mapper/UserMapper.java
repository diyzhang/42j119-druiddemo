package cn.toj.druiddemo.mapper;

import cn.toj.druiddemo.domain.User;

import java.util.List;

public interface UserMapper {

    int addUser(User user);

    List<User> getUsersByName(String userName);

}
