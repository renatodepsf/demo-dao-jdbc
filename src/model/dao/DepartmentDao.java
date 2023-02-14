package model.dao;

import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void uptade(Department objDepartment);
	void deleteById(Integer id);
	List<Department> findAll();
}
