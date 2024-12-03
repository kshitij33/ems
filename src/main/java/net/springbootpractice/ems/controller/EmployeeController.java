package net.springbootpractice.ems.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.springbootpractice.ems.dto.EmployeeDto;
import net.springbootpractice.ems.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
@Slf4j
public class EmployeeController {

    private EmployeeService employeeService;
    // Build Add Employee Rest API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        log.info("employeeDto: {}",employeeDto.getEmail());
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}
