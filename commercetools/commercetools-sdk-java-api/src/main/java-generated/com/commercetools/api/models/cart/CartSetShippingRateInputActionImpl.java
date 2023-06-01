package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ShippingRateInputDraft;
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
 *  <p>Input used to select a ShippingRatePriceTier. If no matching tier can be found, or the input is not set, the default price for the shipping rate is used.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetShippingRateInputActionImpl implements CartSetShippingRateInputAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetShippingRateInputActionImpl(@JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        this.action =  SET_SHIPPING_RATE_INPUT;
    }
    /**
     * create empty instance
     */
    public CartSetShippingRateInputActionImpl() {
        this.action =  SET_SHIPPING_RATE_INPUT;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
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
