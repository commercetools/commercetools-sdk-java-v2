package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.ItemShippingDetails;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.order.ItemState;
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
 *  <p>Generated after a successful Remove Line Item update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderLineItemRemovedMessagePayloadImpl implements OrderLineItemRemovedMessagePayload, ModelBase {

    
    private String type;
    
    
    private String lineItemId;
    
    
    private Long removedQuantity;
    
    
    private Long newQuantity;
    
    
    private java.util.List<com.commercetools.api.models.order.ItemState> newState;
    
    
    private com.commercetools.api.models.common.CentPrecisionMoney newTotalPrice;
    
    
    private com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice;
    
    
    private com.commercetools.api.models.common.Price newPrice;
    
    
    private com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderLineItemRemovedMessagePayloadImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("removedQuantity") final Long removedQuantity, @JsonProperty("newQuantity") final Long newQuantity, @JsonProperty("newState") final java.util.List<com.commercetools.api.models.order.ItemState> newState, @JsonProperty("newTotalPrice") final com.commercetools.api.models.common.CentPrecisionMoney newTotalPrice, @JsonProperty("newTaxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice, @JsonProperty("newPrice") final com.commercetools.api.models.common.Price newPrice, @JsonProperty("newShippingDetail") final com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail) {
        this.lineItemId = lineItemId;
        this.removedQuantity = removedQuantity;
        this.newQuantity = newQuantity;
        this.newState = newState;
        this.newTotalPrice = newTotalPrice;
        this.newTaxedPrice = newTaxedPrice;
        this.newPrice = newPrice;
        this.newShippingDetail = newShippingDetail;
        this.type =  ORDER_LINE_ITEM_REMOVED;
    }
    /**
     * create empty instance
     */
    public OrderLineItemRemovedMessagePayloadImpl() {
        this.type =  ORDER_LINE_ITEM_REMOVED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Unique identifier of the Line Item.</p>
     */
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    /**
     *  <p>Quantity of Line Items that were removed during the Remove Line Item update action.</p>
     */
    
    public Long getRemovedQuantity(){
        return this.removedQuantity;
    }
    
    /**
     *  <p>Line Item quantity after the Remove Line Item update action.</p>
     */
    
    public Long getNewQuantity(){
        return this.newQuantity;
    }
    
    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     */
    
    public java.util.List<com.commercetools.api.models.order.ItemState> getNewState(){
        return this.newState;
    }
    
    /**
     *  <p><code>totalPrice</code> of the Order after the Remove Line Item update action.</p>
     */
    
    public com.commercetools.api.models.common.CentPrecisionMoney getNewTotalPrice(){
        return this.newTotalPrice;
    }
    
    /**
     *  <p>TaxedItemPrice of the Order after the Remove Line Item update action.</p>
     */
    
    public com.commercetools.api.models.cart.TaxedItemPrice getNewTaxedPrice(){
        return this.newTaxedPrice;
    }
    
    /**
     *  <p>Price of the Order after the Remove Line Item update action.</p>
     */
    
    public com.commercetools.api.models.common.Price getNewPrice(){
        return this.newPrice;
    }
    
    /**
     *  <p>Shipping Details of the Order after the Remove Line Item update action.</p>
     */
    
    public com.commercetools.api.models.cart.ItemShippingDetails getNewShippingDetail(){
        return this.newShippingDetail;
    }

    
    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    
    public void setRemovedQuantity(final Long removedQuantity){
        this.removedQuantity = removedQuantity;
    }
    
    
    public void setNewQuantity(final Long newQuantity){
        this.newQuantity = newQuantity;
    }
    
    
    public void setNewState(final com.commercetools.api.models.order.ItemState ...newState){
       this.newState = new ArrayList<>(Arrays.asList(newState));
    }
    
    
    public void setNewState(final java.util.List<com.commercetools.api.models.order.ItemState> newState){
       this.newState = newState;
    }
    
    
    public void setNewTotalPrice(final com.commercetools.api.models.common.CentPrecisionMoney newTotalPrice){
        this.newTotalPrice = newTotalPrice;
    }
    
    
    public void setNewTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice){
        this.newTaxedPrice = newTaxedPrice;
    }
    
    
    public void setNewPrice(final com.commercetools.api.models.common.Price newPrice){
        this.newPrice = newPrice;
    }
    
    
    public void setNewShippingDetail(final com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail){
        this.newShippingDetail = newShippingDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderLineItemRemovedMessagePayloadImpl that = (OrderLineItemRemovedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(lineItemId, that.lineItemId)
                .append(removedQuantity, that.removedQuantity)
                .append(newQuantity, that.newQuantity)
                .append(newState, that.newState)
                .append(newTotalPrice, that.newTotalPrice)
                .append(newTaxedPrice, that.newTaxedPrice)
                .append(newPrice, that.newPrice)
                .append(newShippingDetail, that.newShippingDetail)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(lineItemId)
            .append(removedQuantity)
            .append(newQuantity)
            .append(newState)
            .append(newTotalPrice)
            .append(newTaxedPrice)
            .append(newPrice)
            .append(newShippingDetail)
            .toHashCode();
    }

}
