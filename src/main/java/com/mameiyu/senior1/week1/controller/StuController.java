package com.mameiyu.senior1.week1.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.mameiyu.senior1.week1.domain.Cla;
import com.mameiyu.senior1.week1.domain.Stu;
import com.mameiyu.senior1.week1.service.StuService;
/**
 * 
    * @ClassName: StuController
    * @Description: TODO���Ʋ�
    * @author ������
    * @date 2020��6��17��
    *
 */
@Controller
public class StuController {
	@Resource
	private StuService service;
	
	//��ѯѧ����Ϣ
	@RequestMapping("sels")
	public String sels(@RequestParam(defaultValue = "1")Integer pageNum,String name,Integer s1,Integer s2,Model model) {
		
		PageInfo info=service.selStu(name,s1,s2,pageNum);
		model.addAttribute("info", info);
		model.addAttribute("name", name);
		model.addAttribute("s1", s1);
		model.addAttribute("s2", s2);
		return "stulist";
	}
	//��ת�����Υ��ҳ��
	@RequestMapping("addJ")
	public String addJ(Integer id,Model model) {
		Stu stu=service.selOne(id);
		List<Cla> list=service.selCla();
		System.out.println(list);
		model.addAttribute("stu", stu);
		model.addAttribute("list", list);
		return "addJ";
	}
	//��Ӷ�Ӧ��Υ��
	@RequestMapping("add")
	public String add(Integer sid,Integer[] cid) {
		System.out.println(sid);
		for (Integer integer : cid) {
			System.out.println("---"+integer);
		}
		service.addJ(sid,cid);
		return "redirect:sels";
	}
	//��ת����ϸҳ��
	@RequestMapping("selM")
	public String selM(Integer id,Model model) {
		List<Map> list1=service.selById(id);
		Map list2=service.selById2(id);
		
		for (Map map1 : list1) {
			System.out.println(map1);
		}
	
		model.addAttribute("list1", list1);
		model.addAttribute("list2", list2);
		return "selM";
	}
	//ɾ��
	@RequestMapping("del")
	public String del(Integer sid,Integer cid) {
		service.del(sid,cid);
		return "redirect:selM?id="+sid;
	}
}
