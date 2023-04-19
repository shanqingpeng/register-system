package com.sqp.register.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sqp.register.entity.Employees;
import org.apache.ibatis.annotations.Mapper;

/**
 * 员工Dao
 *
 * @author shanqingpeng
 * @date 2023/04/19
 */
@Mapper
public interface EmployeesDao extends BaseMapper<Employees> {

}