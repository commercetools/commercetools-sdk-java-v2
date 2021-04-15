
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LineItemReturnItemBuilder {

    private String id;

    private Long quantity;

    @Nullable
    private String comment;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime createdAt;

    private String lineItemId;

    public LineItemReturnItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public LineItemReturnItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public LineItemReturnItemBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    public LineItemReturnItemBuilder shipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    public LineItemReturnItemBuilder paymentState(
            final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    public LineItemReturnItemBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public LineItemReturnItemBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LineItemReturnItemBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    @Nullable
    public String getComment() {
        return this.comment;
    }

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public LineItemReturnItem build() {
        return new LineItemReturnItemImpl(id, quantity, comment, shipmentState, paymentState, lastModifiedAt, createdAt,
            lineItemId);
    }

    public static LineItemReturnItemBuilder of() {
        return new LineItemReturnItemBuilder();
    }

    public static LineItemReturnItemBuilder of(final LineItemReturnItem template) {
        LineItemReturnItemBuilder builder = new LineItemReturnItemBuilder();
        builder.id = template.getId();
        builder.quantity = template.getQuantity();
        builder.comment = template.getComment();
        builder.shipmentState = template.getShipmentState();
        builder.paymentState = template.getPaymentState();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.createdAt = template.getCreatedAt();
        builder.lineItemId = template.getLineItemId();
        return builder;
    }

}
