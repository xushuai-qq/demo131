package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.org.apache.bcel.internal.generic.ARETURN;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class OffcnPort {
    //@Value("${offcn_port}")
    private  String port;
   // @Value("${offcn_ip}")
    private String ip;
    private Date date;

    @GetMapping("/getValue")
    public  String getValue(){
        return "ip ==="+ ip +"port===" +port;
    }
}
