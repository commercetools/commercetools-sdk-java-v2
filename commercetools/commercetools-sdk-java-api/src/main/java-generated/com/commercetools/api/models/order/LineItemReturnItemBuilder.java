
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class LineItemReturnItemBuilder implements Builder<LineItemReturnItem> {

    private String id;

    private Long quantity;

    @Nullable
    private String comment;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

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

    public LineItemReturnItemBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    public LineItemReturnItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
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

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
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
        Objects.requireNonNull(id, LineItemReturnItem.class + ": id is missing");
        Objects.requireNonNull(quantity, LineItemReturnItem.class + ": quantity is missing");
        Objects.requireNonNull(shipmentState, LineItemReturnItem.class + ": shipmentState is missing");
        Objects.requireNonNull(paymentState, LineItemReturnItem.class + ": paymentState is missing");
        Objects.requireNonNull(lastModifiedAt, LineItemReturnItem.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(createdAt, LineItemReturnItem.class + ": createdAt is missing");
        Objects.requireNonNull(lineItemId, LineItemReturnItem.class + ": lineItemId is missing");
        return new LineItemReturnItemImpl(id, quantity, comment, shipmentState, paymentState, custom, lastModifiedAt,
            createdAt, lineItemId);
    }

    /**
     * builds LineItemReturnItem without checking for non null required values
     */
    public LineItemReturnItem buildUnchecked() {
        return new LineItemReturnItemImpl(id, quantity, comment, shipmentState, paymentState, custom, lastModifiedAt,
            createdAt, lineItemId);
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
        builder.custom = template.getCustom();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.createdAt = template.getCreatedAt();
        builder.lineItemId = template.getLineItemId();
        return builder;
    }

}
