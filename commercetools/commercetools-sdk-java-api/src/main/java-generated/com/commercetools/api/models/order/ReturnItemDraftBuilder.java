
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReturnItemDraftBuilder implements Builder<ReturnItemDraft> {

    private Long quantity;

    @Nullable
    private String lineItemId;

    @Nullable
    private String customLineItemId;

    @Nullable
    private String comment;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    public ReturnItemDraftBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public ReturnItemDraftBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public ReturnItemDraftBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public ReturnItemDraftBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    public ReturnItemDraftBuilder shipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    @Nullable
    public String getComment() {
        return this.comment;
    }

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public ReturnItemDraft build() {
        Objects.requireNonNull(quantity, ReturnItemDraft.class + ": quantity is missing");
        Objects.requireNonNull(shipmentState, ReturnItemDraft.class + ": shipmentState is missing");
        return new ReturnItemDraftImpl(quantity, lineItemId, customLineItemId, comment, shipmentState);
    }

    /**
     * builds ReturnItemDraft without checking for non null required values
     */
    public ReturnItemDraft buildUnchecked() {
        return new ReturnItemDraftImpl(quantity, lineItemId, customLineItemId, comment, shipmentState);
    }

    public static ReturnItemDraftBuilder of() {
        return new ReturnItemDraftBuilder();
    }

    public static ReturnItemDraftBuilder of(final ReturnItemDraft template) {
        ReturnItemDraftBuilder builder = new ReturnItemDraftBuilder();
        builder.quantity = template.getQuantity();
        builder.lineItemId = template.getLineItemId();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.comment = template.getComment();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
