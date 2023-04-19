package com.sqp.register.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sqp.register.dao.EmployeesDao;
import com.sqp.register.entity.Employees;
import com.sqp.register.service.EmployeesService;
import org.springframework.stereotype.Service;

/**
 * 员工ServiceImpl
 *
 * @author shanqingpeng
 * @date 2023/04/19
 */
@Service
public class EmployeesServiceImpl extends ServiceImpl<EmployeesDao, Employees> implements EmployeesService {

}
