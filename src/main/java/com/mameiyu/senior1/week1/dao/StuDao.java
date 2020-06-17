package com.mameiyu.senior1.week1.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.mameiyu.senior1.week1.domain.Cla;
import com.mameiyu.senior1.week1.domain.Stu;

public interface StuDao {
	//�б�չʾ
	List<Stu> selStu(@Param("name")String name, @Param("s1")Integer s1, @Param("s2")Integer s2);
	//��ѯ��id��ѧ��
	Stu selOne(@Param("id")Integer id);
	//��ѯΥ����
	List<Cla> selCla();
	//����Υ��
	void addF(@Param("sid")Integer sid, @Param("score")Integer score);
	//�����Ӧ��Υ�ͼ�¼
	void addB(@Param("sid")Integer sid, @Param("cid")Integer score);
	//��ѯ��ѧ����Υ����Ϣ
	List<Map> selById(@Param("id")Integer id);
	//��ѯ��ѧ��Υ�͵��������۷��ܺ�
	Map selById2(@Param("id")Integer id);
	//����Υ�� �޸��ۺϻ���
	void delF(@Param("sid")Integer sid, @Param("cid")Integer cid);
	//ɾ��Υ�ͼ�¼
	void delB(@Param("sid")Integer sid, @Param("cid")Integer cid);

}
