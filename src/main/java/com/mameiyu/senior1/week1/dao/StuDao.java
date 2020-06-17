package com.mameiyu.senior1.week1.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.mameiyu.senior1.week1.domain.Cla;
import com.mameiyu.senior1.week1.domain.Stu;

public interface StuDao {
	//列表展示
	List<Stu> selStu(@Param("name")String name, @Param("s1")Integer s1, @Param("s2")Integer s2);
	//查询该id的学生
	Stu selOne(@Param("id")Integer id);
	//查询违纪项
	List<Cla> selCla();
	//增加违纪
	void addF(@Param("sid")Integer sid, @Param("score")Integer score);
	//添加相应的违纪记录
	void addB(@Param("sid")Integer sid, @Param("cid")Integer score);
	//查询该学生的违纪信息
	List<Map> selById(@Param("id")Integer id);
	//查询该学生违纪的条数及扣分总和
	Map selById2(@Param("id")Integer id);
	//撤销违纪 修改综合积分
	void delF(@Param("sid")Integer sid, @Param("cid")Integer cid);
	//删除违纪记录
	void delB(@Param("sid")Integer sid, @Param("cid")Integer cid);

}
