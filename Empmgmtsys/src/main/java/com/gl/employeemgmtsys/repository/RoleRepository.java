package com.gl.employeemgmtsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.employeemgmtsys.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
