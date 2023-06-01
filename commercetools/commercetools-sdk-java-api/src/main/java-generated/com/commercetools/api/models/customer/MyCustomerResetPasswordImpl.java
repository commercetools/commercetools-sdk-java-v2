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
 * MyCustomerResetPassword
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCustomerResetPasswordImpl implements MyCustomerResetPassword, ModelBase {

    
    private String tokenValue;
    
    
    private String newPassword;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCustomerResetPasswordImpl(@JsonProperty("tokenValue") final String tokenValue, @JsonProperty("newPassword") final String newPassword) {
        this.tokenValue = tokenValue;
        this.newPassword = newPassword;
    }
    /**
     * create empty instance
     */
    public MyCustomerResetPasswordImpl() {
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

    
    public void setTokenValue(final String tokenValue){
        this.tokenValue = tokenValue;
    }
    
    
    public void setNewPassword(final String newPassword){
        this.newPassword = newPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyCustomerResetPasswordImpl that = (MyCustomerResetPasswordImpl) o;
    
        return new EqualsBuilder()
                .append(tokenValue, that.tokenValue)
                .append(newPassword, that.newPassword)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(tokenValue)
            .append(newPassword)
            .toHashCode();
    }

}
