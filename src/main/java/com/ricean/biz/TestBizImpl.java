package com.ricean.biz;

import com.ricean.entities.User;
import com.ricean.ibiz.TestBiz;
import com.ricean.mapper.UserMapper;
import com.ricean.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestBizImpl implements TestBiz {

    @Autowired
    private UserMapper userMapper;

    // 查询用户
    public TestVO selById(String vin) {
//        User user = userMapper.selectById(id);
        // 参数map
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("vin", vin);
        List<User> list = userMapper.selectByMap(paramMap);
        // 返回实体
        TestVO testVO = new TestVO();
        if (list == null) {
            testVO.setResult("0");
            testVO.setMsg("该用户不存在");
            return testVO;
        }
        testVO.setData(list);
        return testVO;
    }

}
