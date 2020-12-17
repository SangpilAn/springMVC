package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice")
public class NoticeController {
	
	@RequestMapping("list")
	public String list() {
		return "";
	}
	
	@RequestMapping("reg")
	@ResponseBody
	public String reg(String title,String content,String category) {
		return "title : "+title+"<br> content : "+content+"<br> category : "+category;
	}
	
	@RequestMapping("edit")
	public String edit() {
		return "reg";
	}
	
	@RequestMapping("del")
	public String del() {
		return "";
	}
}
