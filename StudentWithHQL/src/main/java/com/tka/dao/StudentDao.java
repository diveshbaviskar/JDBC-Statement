package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Student1;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Student1 s) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into Student1 (name,stream) values(:name ,:stream)";

		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("name", s.getName());
		query.setParameter("stream", s.getStream());

		query.executeUpdate();
		tr.commit();
		ss.close();
		return "Data is Inserted...";

	}

	public String deleteData(int studid) {

		Session ss = factory.openSession();
		Transaction tr= ss.beginTransaction();

		String hqlQuery = "delete from Student1 where studid=:studid";

		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("studid", studid);
		query.executeUpdate();

		tr.commit();
		ss.close();

		return "Data has been deleted...";
	}
	
	public String updateData(Student1 s, int studid) {
		Session ss = factory.openSession();
		Transaction tt = ss.beginTransaction();
		
		String hqlQuery = "update Student1 set name=:name, stream=:stream where studid=:studid";
		
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		
		query.setParameter("name", s.getName());
		query.setParameter("stream", s.getStream());
		query.setParameter("studid", studid);
		
		query.executeUpdate();
		
		tt.commit();
		ss.close();
		
		return "Data has been updated";
	}
	

	public Student1 getSingleData(int studid) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = " from Student1 where studid =:studid";
		Query<Student1> query = ss.createQuery(hqlQuery, Student1.class);
		query.setParameter("studid", studid);
		Student1 s1 = query.getSingleResult();
		
		tr.commit();
		ss.clear();
		return s1;

	}
	public List<Student1 > getAlldata(Student1 s) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlQuery = "from Student1";
		Query<Student1> query = ss.createQuery(hqlQuery, Student1.class);
		List<Student1> list = query.list();
		tr.commit();
		ss.close();
		return list;
	
	

	}
}
