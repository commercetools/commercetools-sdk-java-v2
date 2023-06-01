package com.commercetools.api.models.customer;


import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * CustomerCreatePasswordResetToken
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerCreatePasswordResetTokenImpl implements CustomerCreatePasswordResetToken, ModelBase {

    
    private String email;
    
    
    private Long ttlMinutes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerCreatePasswordResetTokenImpl(@JsonProperty("email") final String email, @JsonProperty("ttlMinutes") final Long ttlMinutes) {
        this.email = email;
        this.ttlMinutes = ttlMinutes;
    }
    /**
     * create empty instance
     */
    public CustomerCreatePasswordResetTokenImpl() {
    }

    /**
     *  <p>Email address of the Customer treated as case-insensitive.</p>
     */
    
    public String getEmail(){
        return this.email;
    }
    
    /**
     *  <p>Validity period of the generated token in minutes.</p>
     */
    
    public Long getTtlMinutes(){
        return this.ttlMinutes;
    }

    
    public void setEmail(final String email){
        this.email = email;
    }
    
    
    public void setTtlMinutes(final Long ttlMinutes){
        this.ttlMinutes = ttlMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerCreatePasswordResetTokenImpl that = (CustomerCreatePasswordResetTokenImpl) o;
    
        return new EqualsBuilder()
                .append(email, that.email)
                .append(ttlMinutes, that.ttlMinutes)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(email)
            .append(ttlMinutes)
            .toHashCode();
    }

}
