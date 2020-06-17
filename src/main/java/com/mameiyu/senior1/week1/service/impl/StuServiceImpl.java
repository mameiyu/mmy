package com.mameiyu.senior1.week1.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mameiyu.senior1.week1.dao.StuDao;
import com.mameiyu.senior1.week1.domain.Cla;
import com.mameiyu.senior1.week1.domain.Stu;
import com.mameiyu.senior1.week1.service.StuService;
/**
 * 
    * @ClassName: StuServiceImpl
    * @Description: TODOҵ���
    * @author ������
    * @date 2020��6��17��
    *
 */
@Service
public class StuServiceImpl  implements StuService{

		@Resource
		private  StuDao dao;
		
		@Override
		public PageInfo selStu(String name, Integer s1, Integer s2, Integer pageNum) {
			// TODO Auto-generated method stub
			PageHelper.startPage(pageNum, 3);
			List<Stu> list =dao.selStu(name,s1,s2);
			return new PageInfo(list);
		}

		@Override
		public Stu selOne(Integer id) {
			// TODO Auto-generated method stub
			return dao.selOne(id);
		}

		@Override
		public List<Cla> selCla() {
			// TODO Auto-generated method stub
			return dao.selCla();
		}

		@Override
		public void addJ(Integer sid, Integer[] cid) {
			// TODO Auto-generated method stub
			//���ٶ�Ӧ���ۺϻ���
			for (Integer score : cid) {
				dao.addF(sid,score);
			}
			//��Υ����ϸ������Ӽ���
			for (Integer score : cid) {
				dao.addB(sid,score);
			}
			
		}

		@Override
		public List<Map> selById(Integer id) {
			// TODO Auto-generated method stub
			return dao.selById(id);
		}

		@Override
		public Map selById2(Integer id) {
			// TODO Auto-generated method stub
			return dao.selById2(id);
		}

			
		@Override
		public void del(Integer sid, Integer cid) {
			// TODO Auto-generated method stub
			//���Ӷ�Ӧ���ۺϻ���
		
				dao.delF(sid,cid);
		
			//ɾ��Υ����ϸ���������
			
				dao.delB(sid,cid);
			
			
		}
}
