package com.commercetools.api.models.customer;


import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerChangePasswordImpl implements CustomerChangePassword {

    private String id;
    
    private Long version;
    
    private String currentPassword;
    
    private String newPassword;

    @JsonCreator
    CustomerChangePasswordImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("currentPassword") final String currentPassword, @JsonProperty("newPassword") final String newPassword) {
        this.id = id;
        this.version = version;
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
    }
    public CustomerChangePasswordImpl() {
       
    }

    
    public String getId(){
        return this.id;
    }
    
    
    public Long getVersion(){
        return this.version;
    }
    
    
    public String getCurrentPassword(){
        return this.currentPassword;
    }
    
    
    public String getNewPassword(){
        return this.newPassword;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setCurrentPassword(final String currentPassword){
        this.currentPassword = currentPassword;
    }
    
    public void setNewPassword(final String newPassword){
        this.newPassword = newPassword;
    }

}
