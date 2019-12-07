package com.bigdata.springboot_1.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.bigdata.springboot_1.pojo.Echars;

@Mapper
public interface EcharsMapper {
	@Select("select sum(jyze) jyze,sum(tkze) tkze from hzb")
	List<Echars> findall();
}
