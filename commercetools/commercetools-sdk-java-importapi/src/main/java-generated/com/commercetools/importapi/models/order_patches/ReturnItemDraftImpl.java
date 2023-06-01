package com.commercetools.importapi.models.order_patches;

import com.commercetools.importapi.models.order_patches.ReturnShipmentState;
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
 * ReturnItemDraft
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReturnItemDraftImpl implements ReturnItemDraft, ModelBase {

    
    private Double quantity;
    
    
    private String lineItemId;
    
    
    private String customLineItemId;
    
    
    private String comment;
    
    
    private com.commercetools.importapi.models.order_patches.ReturnShipmentState shipmentState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReturnItemDraftImpl(@JsonProperty("quantity") final Double quantity, @JsonProperty("lineItemId") final String lineItemId, @JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("comment") final String comment, @JsonProperty("shipmentState") final com.commercetools.importapi.models.order_patches.ReturnShipmentState shipmentState) {
        this.quantity = quantity;
        this.lineItemId = lineItemId;
        this.customLineItemId = customLineItemId;
        this.comment = comment;
        this.shipmentState = shipmentState;
    }
    /**
     * create empty instance
     */
    public ReturnItemDraftImpl() {
    }

    /**
     *
     */
    
    public Double getQuantity(){
        return this.quantity;
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
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    /**
     *
     */
    
    public String getComment(){
        return this.comment;
    }
    
    /**
     *  <p>Maps to <code>ReturnItem.shipmentState</code></p>
     */
    
    public com.commercetools.importapi.models.order_patches.ReturnShipmentState getShipmentState(){
        return this.shipmentState;
    }

    
    public void setQuantity(final Double quantity){
        this.quantity = quantity;
    }
    
    
    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    
    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }
    
    
    public void setComment(final String comment){
        this.comment = comment;
    }
    
    
    public void setShipmentState(final com.commercetools.importapi.models.order_patches.ReturnShipmentState shipmentState){
        this.shipmentState = shipmentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ReturnItemDraftImpl that = (ReturnItemDraftImpl) o;
    
        return new EqualsBuilder()
                .append(quantity, that.quantity)
                .append(lineItemId, that.lineItemId)
                .append(customLineItemId, that.customLineItemId)
                .append(comment, that.comment)
                .append(shipmentState, that.shipmentState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(quantity)
            .append(lineItemId)
            .append(customLineItemId)
            .append(comment)
            .append(shipmentState)
            .toHashCode();
    }

}
