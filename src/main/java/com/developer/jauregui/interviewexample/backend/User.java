package com.developer.jauregui.interviewexample.backend;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {
    @Id
    @EqualsAndHashCode.Include
    private String vUserID;

    private String vUserName;

    private String vLastName;

    private String vRoleID;

    public String getvUserID() {
        return vUserID;
    }

    public void setvUserID(String vUserID) {
        this.vUserID = vUserID;
    }

    public String getvUserName() {
        return vUserName;
    }

    public void setvUserName(String vUserName) {
        this.vUserName = vUserName;
    }

    public String getvLastName() {
        return vLastName;
    }

    public void setvLastName(String vLastName) {
        this.vLastName = vLastName;
    }

    public String getvRoleID() {
        return vRoleID;
    }

    public void setvRoleID(String vRoleID) {
        this.vRoleID = vRoleID;
    }
}
