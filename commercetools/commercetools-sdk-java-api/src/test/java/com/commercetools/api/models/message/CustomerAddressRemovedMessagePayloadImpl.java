package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
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
public final class CustomerAddressRemovedMessagePayloadImpl implements CustomerAddressRemovedMessagePayload {

    
    private String type;
    
    
    private com.commercetools.api.models.common.Address address;

    @JsonCreator
    CustomerAddressRemovedMessagePayloadImpl(@JsonProperty("address") final com.commercetools.api.models.common.Address address) {
        this.address = address;
        this.type =  CUSTOMER_ADDRESS_REMOVED;
    }
    public CustomerAddressRemovedMessagePayloadImpl() {
        this.type =  CUSTOMER_ADDRESS_REMOVED;
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }

    
    public void setAddress(final com.commercetools.api.models.common.Address address){
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerAddressRemovedMessagePayloadImpl that = (CustomerAddressRemovedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(address, that.address)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(address)
            .toHashCode();
    }

}
