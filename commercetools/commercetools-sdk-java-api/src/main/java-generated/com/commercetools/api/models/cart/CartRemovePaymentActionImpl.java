package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
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
 * CartRemovePaymentAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartRemovePaymentActionImpl implements CartRemovePaymentAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartRemovePaymentActionImpl(@JsonProperty("payment") final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        this.action =  REMOVE_PAYMENT;
    }
    /**
     * create empty instance
     */
    public CartRemovePaymentActionImpl() {
        this.action =  REMOVE_PAYMENT;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Payment to remove from the Cart.</p>
     */
    
    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment(){
        return this.payment;
    }

    
    public void setPayment(final com.commercetools.api.models.payment.PaymentResourceIdentifier payment){
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartRemovePaymentActionImpl that = (CartRemovePaymentActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(payment, that.payment)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(payment)
            .toHashCode();
    }

}
