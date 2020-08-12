package com.adviss.SignUp.proxy;

import com.adviss.SignUp.bean.StudentBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("StudentService")
@RibbonClient("StudentService")
public interface StudentSignUpProxy {
    @PostMapping("/studentDetails/list")
    StudentBean createStudent(@RequestBody StudentBean theStudentBean);
}
