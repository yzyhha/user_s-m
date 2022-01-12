package com.yzy.mapper;

import com.yzy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {
    List<User> queryUserList();

    User queryUserById(@PathVariable("id") int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUserById(@PathVariable("id") int id);
}
