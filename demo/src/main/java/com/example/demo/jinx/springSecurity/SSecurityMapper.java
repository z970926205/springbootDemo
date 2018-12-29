package com.example.demo.jinx.springSecurity;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SSecurityMapper {
    SSecurityUser findByUsername(String username);
}
