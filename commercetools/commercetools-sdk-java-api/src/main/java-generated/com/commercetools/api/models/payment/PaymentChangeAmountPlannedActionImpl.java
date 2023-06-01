package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.payment.PaymentUpdateAction;
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
 *  <p>Can be used to update the Payment if a customer changes the Cart, or adds or removes a CartDiscount during checkout.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentChangeAmountPlannedActionImpl implements PaymentChangeAmountPlannedAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.common.Money amount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentChangeAmountPlannedActionImpl(@JsonProperty("amount") final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        this.action =  CHANGE_AMOUNT_PLANNED;
    }
    /**
     * create empty instance
     */
    public PaymentChangeAmountPlannedActionImpl() {
        this.action =  CHANGE_AMOUNT_PLANNED;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New value to set.</p>
     */
    
    public com.commercetools.api.models.common.Money getAmount(){
        return this.amount;
    }

    
    public void setAmount(final com.commercetools.api.models.common.Money amount){
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PaymentChangeAmountPlannedActionImpl that = (PaymentChangeAmountPlannedActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(amount, that.amount)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(amount)
            .toHashCode();
    }

}
