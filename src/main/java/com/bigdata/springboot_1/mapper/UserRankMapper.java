package com.bigdata.springboot_1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.bigdata.springboot_1.pojo.UserRank;

@Mapper
public interface UserRankMapper {
	@Select("select * from user_rank")
	List<UserRank> findall();
}
