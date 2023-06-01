package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.message.OrderMessagePayload;
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
 *  <p>Generated after a successful Add Line Item update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderLineItemAddedMessagePayloadImpl implements OrderLineItemAddedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.cart.LineItem lineItem;
    
    
    private Long addedQuantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderLineItemAddedMessagePayloadImpl(@JsonProperty("lineItem") final com.commercetools.api.models.cart.LineItem lineItem, @JsonProperty("addedQuantity") final Long addedQuantity) {
        this.lineItem = lineItem;
        this.addedQuantity = addedQuantity;
        this.type =  ORDER_LINE_ITEM_ADDED;
    }
    /**
     * create empty instance
     */
    public OrderLineItemAddedMessagePayloadImpl() {
        this.type =  ORDER_LINE_ITEM_ADDED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Line Item that was added to the Order.</p>
     */
    
    public com.commercetools.api.models.cart.LineItem getLineItem(){
        return this.lineItem;
    }
    
    /**
     *  <p>Quantity of Line Items that were added to the Order.</p>
     */
    
    public Long getAddedQuantity(){
        return this.addedQuantity;
    }

    
    public void setLineItem(final com.commercetools.api.models.cart.LineItem lineItem){
        this.lineItem = lineItem;
    }
    
    
    public void setAddedQuantity(final Long addedQuantity){
        this.addedQuantity = addedQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderLineItemAddedMessagePayloadImpl that = (OrderLineItemAddedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(lineItem, that.lineItem)
                .append(addedQuantity, that.addedQuantity)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(lineItem)
            .append(addedQuantity)
            .toHashCode();
    }

}
