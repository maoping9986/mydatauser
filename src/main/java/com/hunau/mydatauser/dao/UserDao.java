package com.hunau.mydatauser.dao;

import com.hunau.mydatauser.entity.User;
import com.hunau.mydatauser.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface UserDao {//接口
    @Select("select id,name,pwd,isuse ,birthday from tb_user where name like'%${value}%'")
        //@Transactional(readOnly = true)//模糊查询
    List<User> findBy(String name);

    @Select("select id,name,pwd,isuse ,birthday from tb_user where id=#{id}")
    User selectUser(int id);
}//精准查询
