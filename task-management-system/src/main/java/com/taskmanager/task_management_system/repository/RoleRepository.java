package com.taskmanager.task_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmanager.task_management_system.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
