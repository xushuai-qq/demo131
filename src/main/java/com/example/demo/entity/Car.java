package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Long id;
    private  String name;
    private float price;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private Date date;
}
