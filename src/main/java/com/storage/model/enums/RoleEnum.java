package com.storage.model.enums;

import com.storage.model.Role;

public enum RoleEnum {

    ADMIN(1L, "ADMIN"),
    USER(2L, "USER");

    private final Role role = new Role();

    RoleEnum(Long id, String description){
        this.role.setId(id);
        this.role.setDescription(description);
    }

    public Role get(){
        return role;
    }

}
