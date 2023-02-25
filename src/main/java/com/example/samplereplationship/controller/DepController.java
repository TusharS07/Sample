package com.example.samplereplationship.controller;

import com.example.samplereplationship.dto.DepDTO;
import com.example.samplereplationship.service.IdepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Department")
public class DepController {

    @Autowired
    IdepService idepService;


    @PostMapping("/Add_Department")
    public String addDepartment(@RequestBody DepDTO depDTO) {
         idepService.addDepartment(depDTO);
         return "department added";

    }

}
