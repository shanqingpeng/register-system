package com.sqp.register.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工
 *
 * @author shanqingpeng
 * @date 2023/04/19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "employees")
public class Employees implements Serializable {

    private static final long serialVersionUID = 5851558130377474373L;

    @TableId(value = "employee_id", type = IdType.INPUT)
    private Integer employeeId;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date hireDate;

    private String jobId;

    private Double salary;

    private Double commissionPct;

    private Integer managerId;

    private Integer departmentId;

}
