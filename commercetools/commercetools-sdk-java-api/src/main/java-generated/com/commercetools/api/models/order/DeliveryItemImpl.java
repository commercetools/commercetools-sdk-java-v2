package com.commercetools.api.models.order;


import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryItemImpl implements DeliveryItem {

    private String id;
    
    private Double quantity;

    @JsonCreator
    DeliveryItemImpl(@JsonProperty("id") final String id, @JsonProperty("quantity") final Double quantity) {
        this.id = id;
        this.quantity = quantity;
    }
    public DeliveryItemImpl() {
       
    }

    
    public String getId(){
        return this.id;
    }
    
    
    public Double getQuantity(){
        return this.quantity;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setQuantity(final Double quantity){
        this.quantity = quantity;
    }

}
