package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.OrderMessagePayload;
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
 *  <p>Generated after a successful Set Billing Address update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderBillingAddressSetMessagePayloadImpl implements OrderBillingAddressSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.common.Address address;
    
    
    private com.commercetools.api.models.common.Address oldAddress;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderBillingAddressSetMessagePayloadImpl(@JsonProperty("address") final com.commercetools.api.models.common.Address address, @JsonProperty("oldAddress") final com.commercetools.api.models.common.Address oldAddress) {
        this.address = address;
        this.oldAddress = oldAddress;
        this.type =  ORDER_BILLING_ADDRESS_SET;
    }
    /**
     * create empty instance
     */
    public OrderBillingAddressSetMessagePayloadImpl() {
        this.type =  ORDER_BILLING_ADDRESS_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Billing address on the Order after the Set Billing Address update action.</p>
     */
    
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }
    
    /**
     *  <p>Billing address on the Order before the Set Billing Address update action.</p>
     */
    
    public com.commercetools.api.models.common.Address getOldAddress(){
        return this.oldAddress;
    }

    
    public void setAddress(final com.commercetools.api.models.common.Address address){
        this.address = address;
    }
    
    
    public void setOldAddress(final com.commercetools.api.models.common.Address oldAddress){
        this.oldAddress = oldAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderBillingAddressSetMessagePayloadImpl that = (OrderBillingAddressSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(address, that.address)
                .append(oldAddress, that.oldAddress)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(address)
            .append(oldAddress)
            .toHashCode();
    }

}
