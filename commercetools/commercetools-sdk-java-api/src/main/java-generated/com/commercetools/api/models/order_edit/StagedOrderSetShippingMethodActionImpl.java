package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
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
 * StagedOrderSetShippingMethodAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetShippingMethodActionImpl implements StagedOrderSetShippingMethodAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
    
    
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetShippingMethodActionImpl(@JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod, @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.shippingMethod = shippingMethod;
        this.externalTaxRate = externalTaxRate;
        this.action =  SET_SHIPPING_METHOD;
    }
    /**
     * create empty instance
     */
    public StagedOrderSetShippingMethodActionImpl() {
        this.action =  SET_SHIPPING_METHOD;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>ResourceIdentifier to a ShippingMethod.</p>
     */
    
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
        return this.shippingMethod;
    }
    
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     */
    
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }

    
    public void setShippingMethod(final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod){
        this.shippingMethod = shippingMethod;
    }
    
    
    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate){
        this.externalTaxRate = externalTaxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderSetShippingMethodActionImpl that = (StagedOrderSetShippingMethodActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(shippingMethod, that.shippingMethod)
                .append(externalTaxRate, that.externalTaxRate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(shippingMethod)
            .append(externalTaxRate)
            .toHashCode();
    }

}
