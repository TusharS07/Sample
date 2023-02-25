package com.example.samplereplationship.service;

import com.example.samplereplationship.dto.DepDTO;
import com.example.samplereplationship.model.Department;
import com.example.samplereplationship.repository.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepService implements IdepService{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public String addDepartment(DepDTO depDTO) {
        Department dep = modelMapper.map(depDTO, Department.class);
        departmentRepository.save(dep);
        return "Department Added";
    }
}
