package com.zhihua.demo.domain.mapper;
import com.zhihua.demo.domain.model.User;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Description:
 * @Author: zhihua
 * @Date: 2019/5/15
 */
public interface UserMapper {
    @Select("SELECT * FROM pre_common_member")
    List<User> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    User getOne(Long id);

    @Insert("INSERT INTO users(email,username,password) VALUES(#{email}, #{userName}, #{passWord})")
    void insert(User user);

    @Update("UPDATE users SET nickname=#{nickName} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);

}
