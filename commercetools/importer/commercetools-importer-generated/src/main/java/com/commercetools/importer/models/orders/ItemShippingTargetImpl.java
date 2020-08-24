package com.commercetools.importer.models.orders;


import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>The item's shipping target.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ItemShippingTargetImpl implements ItemShippingTarget {

    private String addressKey;
    
    private Double quantity;

    @JsonCreator
    ItemShippingTargetImpl(@JsonProperty("addressKey") final String addressKey, @JsonProperty("quantity") final Double quantity) {
        this.addressKey = addressKey;
        this.quantity = quantity;
    }
    public ItemShippingTargetImpl() {
       
    }

    /**
    *  <p>Maps to <code>ItemShippingTarget.addressKey</code>.</p>
    */
    public String getAddressKey(){
        return this.addressKey;
    }
    
    /**
    *  <p>Maps to <code>ItemShippingTarget.quantity</code>.</p>
    */
    public Double getQuantity(){
        return this.quantity;
    }

    public void setAddressKey(final String addressKey){
        this.addressKey = addressKey;
    }
    
    public void setQuantity(final Double quantity){
        this.quantity = quantity;
    }

}
