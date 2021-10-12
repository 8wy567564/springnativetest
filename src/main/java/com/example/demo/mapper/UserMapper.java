package com.example.demo.mapper;

import com.example.demo.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

  @Select("select * from users")
  List<User> getUser();
}
