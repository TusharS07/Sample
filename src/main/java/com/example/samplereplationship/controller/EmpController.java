package com.example.samplereplationship.controller;

import com.example.samplereplationship.dto.EmpDTO;
import com.example.samplereplationship.service.IempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employee")
public class EmpController {

    @Autowired
    IempService iempService;

    @PostMapping("/Add_EMP")
    public String addEmp(@RequestBody EmpDTO empDTO) {
        iempService.addEmp(empDTO);
        return "Emp Added";
    }
}
