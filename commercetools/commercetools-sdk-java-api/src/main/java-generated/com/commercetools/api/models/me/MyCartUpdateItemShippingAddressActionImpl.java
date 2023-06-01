package com.commercetools.api.models.me;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.me.MyCartUpdateAction;
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
 *  <p>Updates an address in <code>itemShippingAddresses</code> by keeping the Address <code>key</code>.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCartUpdateItemShippingAddressActionImpl implements MyCartUpdateItemShippingAddressAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartUpdateItemShippingAddressActionImpl(@JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        this.action =  UPDATE_ITEM_SHIPPING_ADDRESS;
    }
    /**
     * create empty instance
     */
    public MyCartUpdateItemShippingAddressActionImpl() {
        this.action =  UPDATE_ITEM_SHIPPING_ADDRESS;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     */
    
    public com.commercetools.api.models.common.BaseAddress getAddress(){
        return this.address;
    }

    
    public void setAddress(final com.commercetools.api.models.common.BaseAddress address){
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyCartUpdateItemShippingAddressActionImpl that = (MyCartUpdateItemShippingAddressActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(address, that.address)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(address)
            .toHashCode();
    }

}
