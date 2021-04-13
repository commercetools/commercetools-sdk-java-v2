package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import java.lang.Object;
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
public final class OrderEditSetDeliveryAddressCustomTypeActionImpl implements OrderEditSetDeliveryAddressCustomTypeAction {

    
    private String action;
    
    
    private String deliveryId;
    
    
    private String name;
    
    
    private java.lang.Object value;

    @JsonCreator
    OrderEditSetDeliveryAddressCustomTypeActionImpl(@JsonProperty("deliveryId") final String deliveryId, @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.deliveryId = deliveryId;
        this.name = name;
        this.value = value;
        this.action =  SET_DELIVERY_ADDRESS_CUSTOM_TYPE;
    }
    public OrderEditSetDeliveryAddressCustomTypeActionImpl() {
        this.action =  SET_DELIVERY_ADDRESS_CUSTOM_TYPE;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getDeliveryId(){
        return this.deliveryId;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    
    public java.lang.Object getValue(){
        return this.value;
    }

    
    public void setDeliveryId(final String deliveryId){
        this.deliveryId = deliveryId;
    }
    
    
    public void setName(final String name){
        this.name = name;
    }
    
    
    public void setValue(final java.lang.Object value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderEditSetDeliveryAddressCustomTypeActionImpl that = (OrderEditSetDeliveryAddressCustomTypeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(deliveryId, that.deliveryId)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(deliveryId)
            .append(name)
            .append(value)
            .toHashCode();
    }

}
