package com.sqp.register.controller;

import com.sqp.register.entity.Employees;
import com.sqp.register.service.EmployeesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 员工Controller
 *
 * @author shanqingpeng
 * @date 2023/04/19
 */
@RestController
@RequestMapping(value = "/employees/")
public class EmployeesController {

    @Resource
    private EmployeesService employeesService;


    @GetMapping("get/{emp_id}")
    public Employees getById(@PathVariable("emp_id") Integer employeeId) {
        return employeesService.getById(employeeId);
    }

}
