package com.JavaG.domain;

import java.io.Serializable;
import java.util.List;

public class Academy implements Serializable {

    private Integer id;//学院id
    private String name;//学院名称

    private List<Major> majors;//专业

    private List<Teacher> teachers;//老师
}
