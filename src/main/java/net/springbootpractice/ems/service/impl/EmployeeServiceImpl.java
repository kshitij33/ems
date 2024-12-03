package net.springbootpractice.ems.service.impl;

import lombok.AllArgsConstructor;
import net.springbootpractice.ems.dto.EmployeeDto;
import net.springbootpractice.ems.entity.Employee;
import net.springbootpractice.ems.mapper.EmployeeMapper;
import net.springbootpractice.ems.repository.EmployeeRepository;
import net.springbootpractice.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        return null;
    }
}
