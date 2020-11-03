package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.Order;
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
public final class OrderImportedMessagePayloadImpl implements OrderImportedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.order.Order order;

    @JsonCreator
    OrderImportedMessagePayloadImpl(@JsonProperty("order") final com.commercetools.api.models.order.Order order) {
        this.order = order;
        this.type = "OrderImported";
    }
    public OrderImportedMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.order.Order getOrder(){
        return this.order;
    }

    public void setOrder(final com.commercetools.api.models.order.Order order){
        this.order = order;
    }

}
