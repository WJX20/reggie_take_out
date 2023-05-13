package com.wjx.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjx.reggie.entity.Employee;
import com.wjx.reggie.service.EmployeeService;
import com.wjx.reggie.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author WangJinxiang
* @description 针对表【employee(员工信息)】的数据库操作Service实现
* @createDate 2023-04-22 18:34:42
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{

}




