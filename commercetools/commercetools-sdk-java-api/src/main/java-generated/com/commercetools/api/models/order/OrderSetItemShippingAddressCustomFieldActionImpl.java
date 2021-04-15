package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
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
public final class OrderSetItemShippingAddressCustomFieldActionImpl implements OrderSetItemShippingAddressCustomFieldAction {

    
    private String action;
    
    
    private String addressKey;
    
    
    private String name;
    
    
    private java.lang.Object value;

    @JsonCreator
    OrderSetItemShippingAddressCustomFieldActionImpl(@JsonProperty("addressKey") final String addressKey, @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.addressKey = addressKey;
        this.name = name;
        this.value = value;
        this.action =  SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD;
    }
    public OrderSetItemShippingAddressCustomFieldActionImpl() {
        this.action =  SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAddressKey(){
        return this.addressKey;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    
    public java.lang.Object getValue(){
        return this.value;
    }

    
    public void setAddressKey(final String addressKey){
        this.addressKey = addressKey;
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
    
        OrderSetItemShippingAddressCustomFieldActionImpl that = (OrderSetItemShippingAddressCustomFieldActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(addressKey, that.addressKey)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(addressKey)
            .append(name)
            .append(value)
            .toHashCode();
    }

}
