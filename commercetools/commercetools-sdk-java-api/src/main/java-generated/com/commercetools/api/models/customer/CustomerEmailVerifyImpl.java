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
 * CustomerEmailVerify
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerEmailVerifyImpl implements CustomerEmailVerify, ModelBase {

    
    private Long version;
    
    
    private String tokenValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerEmailVerifyImpl(@JsonProperty("version") final Long version, @JsonProperty("tokenValue") final String tokenValue) {
        this.version = version;
        this.tokenValue = tokenValue;
    }
    /**
     * create empty instance
     */
    public CustomerEmailVerifyImpl() {
    }

    /**
     *  <p>Expected version of the Customer.</p>
     */
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Value of the token to verify Customer email.</p>
     */
    
    public String getTokenValue(){
        return this.tokenValue;
    }

    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    
    public void setTokenValue(final String tokenValue){
        this.tokenValue = tokenValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerEmailVerifyImpl that = (CustomerEmailVerifyImpl) o;
    
        return new EqualsBuilder()
                .append(version, that.version)
                .append(tokenValue, that.tokenValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(version)
            .append(tokenValue)
            .toHashCode();
    }

}
