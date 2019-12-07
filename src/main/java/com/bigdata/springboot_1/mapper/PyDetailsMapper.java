package com.bigdata.springboot_1.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.bigdata.springboot_1.pojo.PyDetails;

@Mapper
public interface PyDetailsMapper {
	@Select("select * from simple_tm_pydetails")
	List<PyDetails> findall();
}
