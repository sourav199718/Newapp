package com.example.newapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String viewEmployeesPage() {
        return "employee_list";
    }

    @GetMapping("/departments")
    public String viewDepartmentPage() {
        return "department_form";
    }

    @GetMapping("/employees/new")
    public String newEmployeeForm() {
        return "employee_form";
    }

}