package com.pkr.project.menu.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {
	List<Map<String, Object>> selectMenu();
}
