package com.commercetools.api.models.order;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.OrderUpdateAction;
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
 * OrderSetDeliveryAddressAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetDeliveryAddressActionImpl implements OrderSetDeliveryAddressAction, ModelBase {

    
    private String action;
    
    
    private String deliveryId;
    
    
    private String deliveryKey;
    
    
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetDeliveryAddressActionImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("deliveryKey") final String deliveryKey, @JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address) {
        this.deliveryId = deliveryId;
        this.deliveryKey = deliveryKey;
        this.address = address;
        this.action =  SET_DELIVERY_ADDRESS;
    }
    /**
     * create empty instance
     */
    public OrderSetDeliveryAddressActionImpl() {
        this.action =  SET_DELIVERY_ADDRESS;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     */
    
    public String getDeliveryId(){
        return this.deliveryId;
    }
    
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     */
    
    public String getDeliveryKey(){
        return this.deliveryKey;
    }
    
    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     */
    
    public com.commercetools.api.models.common.BaseAddress getAddress(){
        return this.address;
    }

    
    public void setDeliveryId(final String deliveryId){
        this.deliveryId = deliveryId;
    }
    
    
    public void setDeliveryKey(final String deliveryKey){
        this.deliveryKey = deliveryKey;
    }
    
    
    public void setAddress(final com.commercetools.api.models.common.BaseAddress address){
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderSetDeliveryAddressActionImpl that = (OrderSetDeliveryAddressActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(deliveryId, that.deliveryId)
                .append(deliveryKey, that.deliveryKey)
                .append(address, that.address)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(deliveryId)
            .append(deliveryKey)
            .append(address)
            .toHashCode();
    }

}
