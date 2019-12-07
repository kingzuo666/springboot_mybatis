package com.bigdata.springboot_1.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bigdata.springboot_1.mapper.EcharsMapper;
import com.bigdata.springboot_1.pojo.Echars;

@RestController
public class EcharsController {
	@Autowired
	EcharsMapper echarsmapper;
	@RequestMapping("/listechars")
	public List<Echars> listCategory(HttpServletResponse res) throws Exception {
		// 解决跨域问题
		res.setHeader("Access-Control-Allow-Origin", "*"); // 允许所有域名访问
		List<Echars> echars = echarsmapper.findall();
		for(Echars e:echars) {
			System.out.println("总交易总额:"+e.getJyze()+"\t"+"总退款总额:"+e.getTkze());
		}
		return echars;
	}
}
