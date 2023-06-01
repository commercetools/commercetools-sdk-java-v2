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
 * CustomerResetPassword
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerResetPasswordImpl implements CustomerResetPassword, ModelBase {

    
    private String tokenValue;
    
    
    private String newPassword;
    
    
    private Long version;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerResetPasswordImpl(@JsonProperty("tokenValue") final String tokenValue, @JsonProperty("newPassword") final String newPassword, @JsonProperty("version") final Long version) {
        this.tokenValue = tokenValue;
        this.newPassword = newPassword;
        this.version = version;
    }
    /**
     * create empty instance
     */
    public CustomerResetPasswordImpl() {
    }

    /**
     *  <p>Value of the token to reset the Customer password.</p>
     */
    
    public String getTokenValue(){
        return this.tokenValue;
    }
    
    /**
     *  <p>New password to be set.</p>
     */
    
    public String getNewPassword(){
        return this.newPassword;
    }
    
    /**
     *  <p>Expected version of the Customer.</p>
     */
    
    public Long getVersion(){
        return this.version;
    }

    
    public void setTokenValue(final String tokenValue){
        this.tokenValue = tokenValue;
    }
    
    
    public void setNewPassword(final String newPassword){
        this.newPassword = newPassword;
    }
    
    
    public void setVersion(final Long version){
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerResetPasswordImpl that = (CustomerResetPasswordImpl) o;
    
        return new EqualsBuilder()
                .append(tokenValue, that.tokenValue)
                .append(newPassword, that.newPassword)
                .append(version, that.version)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(tokenValue)
            .append(newPassword)
            .append(version)
            .toHashCode();
    }

}
