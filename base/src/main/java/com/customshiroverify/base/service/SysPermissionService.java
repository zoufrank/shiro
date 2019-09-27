package com.customshiroverify.base.service;

import java.util.List;

import com.customshiroverify.base.entity.SysPermission;
import com.customshiroverify.base.entity.SysPermissionVo;


public interface SysPermissionService {
	
	
	public SysPermission findById(int id);
	    
	public List<SysPermissionVo> findAll();
	
	
	SysPermission save(SysPermission sp);
	
	int updatePermission(SysPermission sp); 
	
	
	SysPermission findByOne(String id);
	
	int delete(String id);
}