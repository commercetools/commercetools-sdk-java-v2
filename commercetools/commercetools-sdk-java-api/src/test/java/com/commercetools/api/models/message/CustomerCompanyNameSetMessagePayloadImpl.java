package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerCompanyNameSetMessagePayloadImpl implements CustomerCompanyNameSetMessagePayload {

    
    private String type;
    
    
    private String companyName;

    @JsonCreator
    CustomerCompanyNameSetMessagePayloadImpl(@JsonProperty("companyName") final String companyName) {
        this.companyName = companyName;
        this.type =  CUSTOMER_COMPANY_NAME_SET;
    }
    public CustomerCompanyNameSetMessagePayloadImpl() {
        this.type =  CUSTOMER_COMPANY_NAME_SET;
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getCompanyName(){
        return this.companyName;
    }

    
    public void setCompanyName(final String companyName){
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerCompanyNameSetMessagePayloadImpl that = (CustomerCompanyNameSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(companyName, that.companyName)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(companyName)
            .toHashCode();
    }

}
