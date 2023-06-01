package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
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

/**
 * StagedOrderChangeOrderStateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderChangeOrderStateActionImpl implements StagedOrderChangeOrderStateAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.order.OrderState orderState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderChangeOrderStateActionImpl(@JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        this.action =  CHANGE_ORDER_STATE;
    }
    /**
     * create empty instance
     */
    public StagedOrderChangeOrderStateActionImpl() {
        this.action =  CHANGE_ORDER_STATE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *
     */
    
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
    
        StagedOrderChangeOrderStateActionImpl that = (StagedOrderChangeOrderStateActionImpl) o;
    
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
