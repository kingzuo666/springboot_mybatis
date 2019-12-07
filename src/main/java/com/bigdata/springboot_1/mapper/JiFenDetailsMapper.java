package com.bigdata.springboot_1.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bigdata.springboot_1.pojo.JiFenDetails;

@Mapper
public interface JiFenDetailsMapper {
	@Select("select * from jf_details")
	List<JiFenDetails> findall();
}
