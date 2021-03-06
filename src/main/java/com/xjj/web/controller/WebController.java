package com.xjj.web.controller;

import com.xjj.config.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/web")
public class WebController {
	@Autowired
	private MyProperties myProps;
	
	@RequestMapping("/hi")
	public String hi(Map<String, Object> model) {
//		model.put("time", XDateUtils.nowToString());
		model.put("message", "这是测试的内容。。。");
		model.put("toUserName", "张三");
		model.put("fromUserName", "老许");
		model.put("ArrayProps", myProps.getArrayProps());
		return "welcome"; //自动寻找resources/templates中名字为welcome.ftl/welcome.vm的文件作为模板，拼装后返回
	}
}
