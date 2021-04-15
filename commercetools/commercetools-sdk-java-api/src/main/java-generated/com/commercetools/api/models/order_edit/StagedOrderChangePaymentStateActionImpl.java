package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderChangePaymentStateActionImpl implements StagedOrderChangePaymentStateAction {

    
    private String action;
    
    
    private com.commercetools.api.models.order.PaymentState paymentState;

    @JsonCreator
    StagedOrderChangePaymentStateActionImpl(@JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        this.action =  CHANGE_PAYMENT_STATE;
    }
    public StagedOrderChangePaymentStateActionImpl() {
        this.action =  CHANGE_PAYMENT_STATE;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.order.PaymentState getPaymentState(){
        return this.paymentState;
    }

    
    public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState){
        this.paymentState = paymentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderChangePaymentStateActionImpl that = (StagedOrderChangePaymentStateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(paymentState, that.paymentState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(paymentState)
            .toHashCode();
    }

}
