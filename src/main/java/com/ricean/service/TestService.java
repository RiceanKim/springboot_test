package com.ricean.service;

import com.ricean.biz.TestBizImpl;
import com.ricean.form.UserForm;
import com.ricean.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping(value = "/buzx/test")
public class TestService {

    @Autowired
    private TestBizImpl testService;

    @Autowired
    private DataSource dataSource;

    /**
     * 测试查询
     *
     * @return
     */
    @PostMapping("/hello")
    public TestVO hello(@Validated @RequestBody UserForm form) {
        System.out.println(dataSource.getClass());
//        System.out.println("datasource = " + dataSource);
        return testService.selById(form.getVin());

    }
    @PostMapping("/test")
    public TestVO test(@Validated @RequestBody UserForm form) {
        return testService.test(form.getVin());
    }
}
