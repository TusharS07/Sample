package com.example.samplereplationship.service;

import com.example.samplereplationship.dto.EmpDTO;
import com.example.samplereplationship.model.Employee;
import com.example.samplereplationship.repository.DepartmentRepository;
import com.example.samplereplationship.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService implements IempService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public String addEmp(EmpDTO empDTO) {
        Employee emp = modelMapper.map(empDTO, Employee.class);
        employeeRepository.save(emp);
        return "Emp added syccessfull";
    }
}
