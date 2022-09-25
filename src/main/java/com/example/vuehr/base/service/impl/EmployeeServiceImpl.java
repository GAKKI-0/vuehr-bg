package com.example.vuehr.base.service.impl;

import com.example.vuehr.base.entity.Employee;
import com.example.vuehr.base.mapper.EmployeeMapper;
import com.example.vuehr.base.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wildfire
 * @since 2022-09-25
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
