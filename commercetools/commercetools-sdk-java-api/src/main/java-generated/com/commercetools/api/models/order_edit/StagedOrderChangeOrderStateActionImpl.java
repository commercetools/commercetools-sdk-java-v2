package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderChangeOrderStateActionImpl implements StagedOrderChangeOrderStateAction {

    private String action;
    
    private com.commercetools.api.models.order.OrderState orderState;

    @JsonCreator
    StagedOrderChangeOrderStateActionImpl(@JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        this.action = "changeOrderState";
    }
    public StagedOrderChangeOrderStateActionImpl() {
        this.action = "changeOrderState";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.order.OrderState getOrderState(){
        return this.orderState;
    }

    public void setOrderState(final com.commercetools.api.models.order.OrderState orderState){
        this.orderState = orderState;
    }

}
