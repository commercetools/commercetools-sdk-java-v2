
package com.commercetools.api.models.order;

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
public class CustomLineItemReturnItemImpl implements CustomLineItemReturnItem, ModelBase {

    private String id;

    private Long quantity;

    private String type;

    private String comment;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    private com.commercetools.api.models.type.CustomFields custom;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime createdAt;

    private String customLineItemId;

    @JsonCreator
    CustomLineItemReturnItemImpl(@JsonProperty("id") final String id, @JsonProperty("quantity") final Long quantity,
            @JsonProperty("comment") final String comment,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ReturnShipmentState shipmentState,
            @JsonProperty("paymentState") final com.commercetools.api.models.order.ReturnPaymentState paymentState,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("customLineItemId") final String customLineItemId) {
        this.id = id;
        this.quantity = quantity;
        this.comment = comment;
        this.shipmentState = shipmentState;
        this.paymentState = paymentState;
        this.custom = custom;
        this.lastModifiedAt = lastModifiedAt;
        this.createdAt = createdAt;
        this.customLineItemId = customLineItemId;
        this.type = CUSTOM_LINE_ITEM_RETURN_ITEM;
    }

    public CustomLineItemReturnItemImpl() {
        this.type = CUSTOM_LINE_ITEM_RETURN_ITEM;
    }

    public String getId() {
        return this.id;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public String getType() {
        return this.type;
    }

    public String getComment() {
        return this.comment;
    }

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
    *  <p>Custom Fields of this return item.</p>
    */
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setPaymentState(final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomLineItemReturnItemImpl that = (CustomLineItemReturnItemImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(quantity, that.quantity)
                .append(type, that.type)
                .append(comment, that.comment)
                .append(shipmentState, that.shipmentState)
                .append(paymentState, that.paymentState)
                .append(custom, that.custom)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(createdAt, that.createdAt)
                .append(customLineItemId, that.customLineItemId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(quantity)
                .append(type)
                .append(comment)
                .append(shipmentState)
                .append(paymentState)
                .append(custom)
                .append(lastModifiedAt)
                .append(createdAt)
                .append(customLineItemId)
                .toHashCode();
    }

}
