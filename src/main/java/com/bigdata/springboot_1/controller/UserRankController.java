package com.bigdata.springboot_1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.springboot_1.mapper.UserRankMapper;
import com.bigdata.springboot_1.pojo.UserRank;

@Controller
public class UserRankController {
	@Autowired UserRankMapper userrankmapper;
	@RequestMapping("/listuserrank") 
	public String listCategory(Model m) throws Exception {
		List<UserRank> cs=userrankmapper.findall();
		m.addAttribute("cs", cs);
		return "userrank";
	}
}
