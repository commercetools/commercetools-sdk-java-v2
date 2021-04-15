package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
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
public final class OrderSetItemShippingAddressCustomTypeActionImpl implements OrderSetItemShippingAddressCustomTypeAction {

    
    private String action;
    
    
    private String addressKey;
    
    
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    private com.commercetools.api.models.type.FieldContainer fields;

    @JsonCreator
    OrderSetItemShippingAddressCustomTypeActionImpl(@JsonProperty("addressKey") final String addressKey, @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type, @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.addressKey = addressKey;
        this.type = type;
        this.fields = fields;
        this.action =  SET_ITEM_SHIPPING_ADDRESS_CUSTOM_TYPE;
    }
    public OrderSetItemShippingAddressCustomTypeActionImpl() {
        this.action =  SET_ITEM_SHIPPING_ADDRESS_CUSTOM_TYPE;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getAddressKey(){
        return this.addressKey;
    }
    
    
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    
    public void setAddressKey(final String addressKey){
        this.addressKey = addressKey;
    }
    
    
    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type){
        this.type = type;
    }
    
    
    public void setFields(final com.commercetools.api.models.type.FieldContainer fields){
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderSetItemShippingAddressCustomTypeActionImpl that = (OrderSetItemShippingAddressCustomTypeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(addressKey, that.addressKey)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(addressKey)
            .append(type)
            .append(fields)
            .toHashCode();
    }

}
