package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderState;
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderChangeOrderStateActionImpl implements OrderChangeOrderStateAction {

    private String action;
    
    private com.commercetools.api.models.order.OrderState orderState;

    @JsonCreator
    OrderChangeOrderStateActionImpl(@JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        this.action = "changeOrderState";
    }
    public OrderChangeOrderStateActionImpl() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderChangeOrderStateActionImpl that = (OrderChangeOrderStateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(orderState, that.orderState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(orderState)
            .toHashCode();
    }

}
