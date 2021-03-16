package com.zhifa.mogo.entity;

import com.sun.istack.internal.NotNull;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
public class Student {

    @Id
    private String id;

    @NotNull
    private String studentId;

    private Integer age;

    private String name;

    private String gender;

}
