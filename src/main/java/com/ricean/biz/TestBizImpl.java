package com.ricean.biz;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ricean.entities.User;
import com.ricean.ibiz.TestBiz;
import com.ricean.mapper.UserMapper;
import com.ricean.vo.TestVO;
import org.apache.ibatis.logging.stdout.StdOutImpl;
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
        list.forEach(System.out::println);
        testVO.setData(list);
        return testVO;
    }

    public TestVO test(String vin){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.nested(wq->wq.eq("vin",vin).or().eq("package_id","1"));
        List<User> userList = userMapper.selectList(wrapper);
        TestVO testVO = new TestVO();
        testVO.setData(userList);
        return testVO;

    }

}
