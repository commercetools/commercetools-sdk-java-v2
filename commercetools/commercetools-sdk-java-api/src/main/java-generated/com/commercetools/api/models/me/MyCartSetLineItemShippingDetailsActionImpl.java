package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.me.MyCartUpdateAction;
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
 * MyCartSetLineItemShippingDetailsAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCartSetLineItemShippingDetailsActionImpl implements MyCartSetLineItemShippingDetailsAction, ModelBase {

    
    private String action;
    
    
    private String lineItemId;
    
    
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartSetLineItemShippingDetailsActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.lineItemId = lineItemId;
        this.shippingDetails = shippingDetails;
        this.action =  SET_LINE_ITEM_SHIPPING_DETAILS;
    }
    /**
     * create empty instance
     */
    public MyCartSetLineItemShippingDetailsActionImpl() {
        this.action =  SET_LINE_ITEM_SHIPPING_DETAILS;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     */
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    /**
     *  <p>Value to set. If empty, the existing value is removed.</p>
     */
    
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
        return this.shippingDetails;
    }

    
    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    
    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails){
        this.shippingDetails = shippingDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyCartSetLineItemShippingDetailsActionImpl that = (MyCartSetLineItemShippingDetailsActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(shippingDetails, that.shippingDetails)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(lineItemId)
            .append(shippingDetails)
            .toHashCode();
    }

}
