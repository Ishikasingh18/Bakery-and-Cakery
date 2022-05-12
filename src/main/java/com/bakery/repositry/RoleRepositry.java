package com.bakery.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bakery.model.Role;

public interface RoleRepositry extends JpaRepository<Role, Integer>{

}
