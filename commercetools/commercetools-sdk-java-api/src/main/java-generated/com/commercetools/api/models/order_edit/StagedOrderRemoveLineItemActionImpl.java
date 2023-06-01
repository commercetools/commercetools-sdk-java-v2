package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.Money;
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
 * StagedOrderRemoveLineItemAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderRemoveLineItemActionImpl implements StagedOrderRemoveLineItemAction, ModelBase {

    
    private String action;
    
    
    private String lineItemId;
    
    
    private Long quantity;
    
    
    private com.commercetools.api.models.common.Money externalPrice;
    
    
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
    
    
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderRemoveLineItemActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("quantity") final Long quantity, @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice, @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice, @JsonProperty("shippingDetailsToRemove") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove) {
        this.lineItemId = lineItemId;
        this.quantity = quantity;
        this.externalPrice = externalPrice;
        this.externalTotalPrice = externalTotalPrice;
        this.shippingDetailsToRemove = shippingDetailsToRemove;
        this.action =  REMOVE_LINE_ITEM;
    }
    /**
     * create empty instance
     */
    public StagedOrderRemoveLineItemActionImpl() {
        this.action =  REMOVE_LINE_ITEM;
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
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    /**
     *
     */
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     */
    
    public com.commercetools.api.models.common.Money getExternalPrice(){
        return this.externalPrice;
    }
    
    /**
     *
     */
    
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
        return this.externalTotalPrice;
    }
    
    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     */
    
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetailsToRemove(){
        return this.shippingDetailsToRemove;
    }

    
    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    
    public void setQuantity(final Long quantity){
        this.quantity = quantity;
    }
    
    
    public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice){
        this.externalPrice = externalPrice;
    }
    
    
    public void setExternalTotalPrice(final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice){
        this.externalTotalPrice = externalTotalPrice;
    }
    
    
    public void setShippingDetailsToRemove(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove){
        this.shippingDetailsToRemove = shippingDetailsToRemove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderRemoveLineItemActionImpl that = (StagedOrderRemoveLineItemActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(quantity, that.quantity)
                .append(externalPrice, that.externalPrice)
                .append(externalTotalPrice, that.externalTotalPrice)
                .append(shippingDetailsToRemove, that.shippingDetailsToRemove)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(lineItemId)
            .append(quantity)
            .append(externalPrice)
            .append(externalTotalPrice)
            .append(shippingDetailsToRemove)
            .toHashCode();
    }

}
