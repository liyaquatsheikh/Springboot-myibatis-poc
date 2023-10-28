package com.myibatis.mapper;

import com.myibatis.model.Product;
import com.myibatis.model.UserDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER")
    List<UserDto> findAll();

    @Select("SELECT * FROM USER WHERE id = #{id}")
    UserDto findById(@Param("id") int id);

    @Delete("DELETE FROM USER WHERE id = #{id}")
    int deleteById(@Param("id") int id);

    @Insert("INSERT INTO USER(id, name, mobileNumber) VALUES (#{id}, #{name}, #{mobileNumber})")
    int save(UserDto item);

    @Update("UPDATE USER SET name=#{name}, status=#{mobileNumber} WHERE id=#{id}")
    int update(UserDto item);

}
