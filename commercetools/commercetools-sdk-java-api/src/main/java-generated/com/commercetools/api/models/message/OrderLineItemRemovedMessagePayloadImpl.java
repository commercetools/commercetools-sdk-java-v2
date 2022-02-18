
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderLineItemRemovedMessagePayloadImpl implements OrderLineItemRemovedMessagePayload, ModelBase {

    private String type;

    private String lineItemId;

    private Long removedQuantity;

    private Long newQuantity;

    private java.util.List<com.commercetools.api.models.order.ItemState> newState;

    private com.commercetools.api.models.common.TypedMoney newTotalPrice;

    private com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice;

    private com.commercetools.api.models.common.Price newPrice;

    private com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail;

    @JsonCreator
    OrderLineItemRemovedMessagePayloadImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("removedQuantity") final Long removedQuantity,
            @JsonProperty("newQuantity") final Long newQuantity,
            @JsonProperty("newState") final java.util.List<com.commercetools.api.models.order.ItemState> newState,
            @JsonProperty("newTotalPrice") final com.commercetools.api.models.common.TypedMoney newTotalPrice,
            @JsonProperty("newTaxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice,
            @JsonProperty("newPrice") final com.commercetools.api.models.common.Price newPrice,
            @JsonProperty("newShippingDetail") final com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail) {
        this.lineItemId = lineItemId;
        this.removedQuantity = removedQuantity;
        this.newQuantity = newQuantity;
        this.newState = newState;
        this.newTotalPrice = newTotalPrice;
        this.newTaxedPrice = newTaxedPrice;
        this.newPrice = newPrice;
        this.newShippingDetail = newShippingDetail;
        this.type = ORDER_LINE_ITEM_REMOVED;
    }

    public OrderLineItemRemovedMessagePayloadImpl() {
        this.type = ORDER_LINE_ITEM_REMOVED;
    }

    public String getType() {
        return this.type;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public Long getRemovedQuantity() {
        return this.removedQuantity;
    }

    public Long getNewQuantity() {
        return this.newQuantity;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getNewState() {
        return this.newState;
    }

    /**
    *  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
    */
    public com.commercetools.api.models.common.TypedMoney getNewTotalPrice() {
        return this.newTotalPrice;
    }

    public com.commercetools.api.models.cart.TaxedItemPrice getNewTaxedPrice() {
        return this.newTaxedPrice;
    }

    public com.commercetools.api.models.common.Price getNewPrice() {
        return this.newPrice;
    }

    public com.commercetools.api.models.cart.ItemShippingDetails getNewShippingDetail() {
        return this.newShippingDetail;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setRemovedQuantity(final Long removedQuantity) {
        this.removedQuantity = removedQuantity;
    }

    public void setNewQuantity(final Long newQuantity) {
        this.newQuantity = newQuantity;
    }

    public void setNewState(final com.commercetools.api.models.order.ItemState... newState) {
        this.newState = new ArrayList<>(Arrays.asList(newState));
    }

    public void setNewState(final java.util.List<com.commercetools.api.models.order.ItemState> newState) {
        this.newState = newState;
    }

    public void setNewTotalPrice(final com.commercetools.api.models.common.TypedMoney newTotalPrice) {
        this.newTotalPrice = newTotalPrice;
    }

    public void setNewTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice) {
        this.newTaxedPrice = newTaxedPrice;
    }

    public void setNewPrice(final com.commercetools.api.models.common.Price newPrice) {
        this.newPrice = newPrice;
    }

    public void setNewShippingDetail(final com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail) {
        this.newShippingDetail = newShippingDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderLineItemRemovedMessagePayloadImpl that = (OrderLineItemRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
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
        return new HashCodeBuilder(17, 37).append(type)
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
