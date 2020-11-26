package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
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
public final class OrderRemoveDeliveryActionImpl implements OrderRemoveDeliveryAction {

    private String action;
    
    private String deliveryId;

    @JsonCreator
    OrderRemoveDeliveryActionImpl(@JsonProperty("deliveryId") final String deliveryId) {
        this.deliveryId = deliveryId;
        this.action = "removeDelivery";
    }
    public OrderRemoveDeliveryActionImpl() {
        this.action = "removeDelivery";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getDeliveryId(){
        return this.deliveryId;
    }

    public void setDeliveryId(final String deliveryId){
        this.deliveryId = deliveryId;
    }

}
