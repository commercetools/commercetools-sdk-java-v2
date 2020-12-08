package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ShippingRateInputDraft;
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
public final class CartSetShippingRateInputActionImpl implements CartSetShippingRateInputAction {

    private String action;
    
    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    @JsonCreator
    CartSetShippingRateInputActionImpl(@JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        this.action = "setShippingRateInput";
    }
    public CartSetShippingRateInputActionImpl() {
        this.action = "setShippingRateInput";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>Based on the definition of ShippingRateInputType.
    *  If CartClassification is defined, it must be ClassificationShippingRateInput.
    *  If CartScore is defined, it must be ScoreShippingRateInput.
    *  Otherwise it can not bet set.</p>
    */
    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput(){
        return this.shippingRateInput;
    }

    public void setShippingRateInput(final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput){
        this.shippingRateInput = shippingRateInput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartSetShippingRateInputActionImpl that = (CartSetShippingRateInputActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(shippingRateInput, that.shippingRateInput)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(shippingRateInput)
            .toHashCode();
    }

}
