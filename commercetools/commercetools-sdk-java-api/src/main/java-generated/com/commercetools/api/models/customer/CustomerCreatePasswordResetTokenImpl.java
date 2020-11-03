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
public final class CustomerCreatePasswordResetTokenImpl implements CustomerCreatePasswordResetToken {

    private String email;
    
    private Long ttlMinutes;

    @JsonCreator
    CustomerCreatePasswordResetTokenImpl(@JsonProperty("email") final String email, @JsonProperty("ttlMinutes") final Long ttlMinutes) {
        this.email = email;
        this.ttlMinutes = ttlMinutes;
    }
    public CustomerCreatePasswordResetTokenImpl() {
       
    }

    
    public String getEmail(){
        return this.email;
    }
    
    
    public Long getTtlMinutes(){
        return this.ttlMinutes;
    }

    public void setEmail(final String email){
        this.email = email;
    }
    
    public void setTtlMinutes(final Long ttlMinutes){
        this.ttlMinutes = ttlMinutes;
    }

}
