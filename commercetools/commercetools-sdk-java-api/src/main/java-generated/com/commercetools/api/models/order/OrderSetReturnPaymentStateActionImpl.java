package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ReturnPaymentState;
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
 * OrderSetReturnPaymentStateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetReturnPaymentStateActionImpl implements OrderSetReturnPaymentStateAction, ModelBase {

    
    private String action;
    
    
    private String returnItemId;
    
    
    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetReturnPaymentStateActionImpl(@JsonProperty("returnItemId") final String returnItemId, @JsonProperty("paymentState") final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.returnItemId = returnItemId;
        this.paymentState = paymentState;
        this.action =  SET_RETURN_PAYMENT_STATE;
    }
    /**
     * create empty instance
     */
    public OrderSetReturnPaymentStateActionImpl() {
        this.action =  SET_RETURN_PAYMENT_STATE;
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
    
    public String getReturnItemId(){
        return this.returnItemId;
    }
    
    /**
     *
     */
    
    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState(){
        return this.paymentState;
    }

    
    public void setReturnItemId(final String returnItemId){
        this.returnItemId = returnItemId;
    }
    
    
    public void setPaymentState(final com.commercetools.api.models.order.ReturnPaymentState paymentState){
        this.paymentState = paymentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderSetReturnPaymentStateActionImpl that = (OrderSetReturnPaymentStateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(returnItemId, that.returnItemId)
                .append(paymentState, that.paymentState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(returnItemId)
            .append(paymentState)
            .toHashCode();
    }

}
