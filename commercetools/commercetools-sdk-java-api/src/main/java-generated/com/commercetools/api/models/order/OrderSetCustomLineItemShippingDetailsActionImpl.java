package com.commercetools.api.models.order;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.order.OrderUpdateAction;
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
 * OrderSetCustomLineItemShippingDetailsAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetCustomLineItemShippingDetailsActionImpl implements OrderSetCustomLineItemShippingDetailsAction, ModelBase {

    
    private String action;
    
    
    private String customLineItemId;
    
    
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetCustomLineItemShippingDetailsActionImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.customLineItemId = customLineItemId;
        this.shippingDetails = shippingDetails;
        this.action =  SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS;
    }
    /**
     * create empty instance
     */
    public OrderSetCustomLineItemShippingDetailsActionImpl() {
        this.action =  SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS;
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
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    /**
     *  <p>For order creation and updates, the sum of the <code>targets</code> must match the quantity of the Line Items or Custom Line Items.</p>
     */
    
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
        return this.shippingDetails;
    }

    
    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }
    
    
    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails){
        this.shippingDetails = shippingDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderSetCustomLineItemShippingDetailsActionImpl that = (OrderSetCustomLineItemShippingDetailsActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(shippingDetails, that.shippingDetails)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(customLineItemId)
            .append(shippingDetails)
            .toHashCode();
    }

}
