package com.bigdata.springboot_1.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.bigdata.springboot_1.pojo.HZB;

@Mapper
public interface HZBMapper {
	@Select("select * from hzb")
	List<HZB> findall();
}
