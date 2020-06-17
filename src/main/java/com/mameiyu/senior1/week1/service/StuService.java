package com.mameiyu.senior1.week1.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.mameiyu.senior1.week1.domain.Cla;
import com.mameiyu.senior1.week1.domain.Stu;

public interface StuService {

	PageInfo selStu(String name, Integer s1, Integer s2, Integer pageNum);

	Stu selOne(Integer id);

	List<Cla> selCla();

	void addJ(Integer sid, Integer[] cid);

	List<Map> selById(Integer id);

	Map selById2(Integer id);

	void del(Integer sid, Integer cid);

}
