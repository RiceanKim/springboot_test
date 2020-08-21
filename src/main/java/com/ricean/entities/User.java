package com.ricean.entities;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@TableName(value = "t_iov_car_show_flow_record")
public class User {
    @TableId
    private int id;

    private String vin;

    private String package_id;

    private String package_name;

    private String is_enable;

    private Date create_time;

    private Date update_time;
}
