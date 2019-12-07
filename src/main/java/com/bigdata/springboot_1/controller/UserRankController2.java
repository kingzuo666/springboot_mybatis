package com.bigdata.springboot_1.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bigdata.springboot_1.mapper.UserRankMapper;
import com.bigdata.springboot_1.pojo.UserRank;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class UserRankController2 {
	@Autowired UserRankMapper userrankmapper;
	@RequestMapping("/listuserrank1") 
//	@RequestMapping注解是用来映射请求的，即指明处理器可以处理哪些URL请求，该注解既可以用在类上，也可以用在方法上。
//	当使用@RequestMapping标记控制器类时，方法的请求地址是相对类的请求地址而言的；
//	当没有使用@RequestMapping标记类时，方法的请求地址是绝对路径。
	public 	PageInfo<UserRank> listCategory(
			HttpServletResponse res,
			@RequestParam(value = "start", defaultValue = "1") int start,
			@RequestParam(value = "size", defaultValue = "10") int size) 
					throws Exception {
		//解决跨域问题
		res.setHeader("Access-Control-Allow-Origin", "*"); //允许所有域名访问
		
		PageHelper.startPage(start,size,"mjhym"); //start当前页面数这里默认返回第一页的内容，size页面数据的条数，返回的数据按mjhym排序
		List<UserRank> ur=userrankmapper.findall();
		PageInfo<UserRank> page = new PageInfo<>(ur);
		return page;
	}
}
