package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
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
 * StagedOrderSetShippingMethodTaxAmountAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetShippingMethodTaxAmountActionImpl implements StagedOrderSetShippingMethodTaxAmountAction, ModelBase {

    
    private String action;
    
    
    private String shippingKey;
    
    
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetShippingMethodTaxAmountActionImpl(@JsonProperty("shippingKey") final String shippingKey, @JsonProperty("externalTaxAmount") final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.shippingKey = shippingKey;
        this.externalTaxAmount = externalTaxAmount;
        this.action =  SET_SHIPPING_METHOD_TAX_AMOUNT;
    }
    /**
     * create empty instance
     */
    public StagedOrderSetShippingMethodTaxAmountActionImpl() {
        this.action =  SET_SHIPPING_METHOD_TAX_AMOUNT;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p><code>key</code> of the ShippingMethod to update. This is required for Orders with <code>Multiple</code> ShippingMode.</p>
     */
    
    public String getShippingKey(){
        return this.shippingKey;
    }
    
    /**
     *  <p>Cannot be used in LineItemDraft or CustomLineItemDraft.</p>
     *  <p>Can only be set by these update actions:</p>
     *  <ul>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Carts</li>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Order Edits</li>
     *  </ul>
     */
    
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount(){
        return this.externalTaxAmount;
    }

    
    public void setShippingKey(final String shippingKey){
        this.shippingKey = shippingKey;
    }
    
    
    public void setExternalTaxAmount(final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount){
        this.externalTaxAmount = externalTaxAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderSetShippingMethodTaxAmountActionImpl that = (StagedOrderSetShippingMethodTaxAmountActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(shippingKey, that.shippingKey)
                .append(externalTaxAmount, that.externalTaxAmount)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(shippingKey)
            .append(externalTaxAmount)
            .toHashCode();
    }

}
