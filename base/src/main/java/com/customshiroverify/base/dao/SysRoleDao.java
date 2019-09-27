package com.customshiroverify.base.dao;

import javax.transaction.Transactional;

import com.customshiroverify.base.entity.SysRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



@Transactional
public interface SysRoleDao extends CrudRepository<SysRole,Long> {
	
    public SysRole findById(int id);
    
    
	@Query("from SysRole u where u.role = ?1")
	Page<SysRole> findByRole(String role, Pageable pageable);

	Page<SysRole> findAll(Pageable pageable);
	
	
	@Modifying(clearAutomatically = true)
	@Query(value = "update sys_role ui set ui.available=?1 where ui.id = ?2",nativeQuery = true)
	public int updateState(boolean available, String id);
	
	
	@Modifying(clearAutomatically = true)
	@Query(value = "update sys_role ui set ui.description=?1,ui.role=?2 where ui.id = ?3",nativeQuery = true)
	public int updateRole(String description, String role, String id);


}