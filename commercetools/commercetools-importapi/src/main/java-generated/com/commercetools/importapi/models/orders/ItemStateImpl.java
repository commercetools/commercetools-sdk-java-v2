package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.StateKeyReference;
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
*  <p>The item's state.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ItemStateImpl implements ItemState {

    private Double quantity;
    
    private com.commercetools.importapi.models.common.StateKeyReference state;

    @JsonCreator
    ItemStateImpl(@JsonProperty("quantity") final Double quantity, @JsonProperty("state") final com.commercetools.importapi.models.common.StateKeyReference state) {
        this.quantity = quantity;
        this.state = state;
    }
    public ItemStateImpl() {
       
    }

    
    public Double getQuantity(){
        return this.quantity;
    }
    
    /**
    *  <p>Maps to <code>ItemState.state</code>.</p>
    */
    public com.commercetools.importapi.models.common.StateKeyReference getState(){
        return this.state;
    }

    public void setQuantity(final Double quantity){
        this.quantity = quantity;
    }
    
    public void setState(final com.commercetools.importapi.models.common.StateKeyReference state){
        this.state = state;
    }

}
