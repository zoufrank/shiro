package com.customshiroverify.base.service;

import java.util.List;

import com.customshiroverify.base.entity.SysRole;
import com.customshiroverify.base.entity.UserInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface SysRoleService {
	
	
    public UserInfo findById(int id);
    
	Page<SysRole> findByRole(String role, Pageable pageable);

	Page<SysRole> findAll(Pageable pageable);
	
	public int updateState(boolean available, String id);
	
	public int updateRole(SysRole sr);
	
	SysRole save(SysRole sr);
	    
    
    public SysRole findByOne(String id);
    
    List<SysRole> findAll();

}