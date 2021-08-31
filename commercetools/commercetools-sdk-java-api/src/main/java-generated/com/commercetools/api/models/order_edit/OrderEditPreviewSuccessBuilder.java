
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditPreviewSuccessBuilder implements Builder<OrderEditPreviewSuccess> {

    private com.commercetools.api.models.order_edit.StagedOrder preview;

    private java.util.List<com.commercetools.api.models.message.MessagePayload> messagePayloads;

    public OrderEditPreviewSuccessBuilder preview(
            Function<com.commercetools.api.models.order_edit.StagedOrderBuilder, com.commercetools.api.models.order_edit.StagedOrderBuilder> builder) {
        this.preview = builder.apply(com.commercetools.api.models.order_edit.StagedOrderBuilder.of()).build();
        return this;
    }

    public OrderEditPreviewSuccessBuilder preview(final com.commercetools.api.models.order_edit.StagedOrder preview) {
        this.preview = preview;
        return this;
    }

    public OrderEditPreviewSuccessBuilder messagePayloads(
            final com.commercetools.api.models.message.MessagePayload... messagePayloads) {
        this.messagePayloads = new ArrayList<>(Arrays.asList(messagePayloads));
        return this;
    }

    public OrderEditPreviewSuccessBuilder messagePayloads(
            final java.util.List<com.commercetools.api.models.message.MessagePayload> messagePayloads) {
        this.messagePayloads = messagePayloads;
        return this;
    }

    public com.commercetools.api.models.order_edit.StagedOrder getPreview() {
        return this.preview;
    }

    public java.util.List<com.commercetools.api.models.message.MessagePayload> getMessagePayloads() {
        return this.messagePayloads;
    }

    public OrderEditPreviewSuccess build() {
        Objects.requireNonNull(preview, OrderEditPreviewSuccess.class + ": preview is missing");
        Objects.requireNonNull(messagePayloads, OrderEditPreviewSuccess.class + ": messagePayloads is missing");
        return new OrderEditPreviewSuccessImpl(preview, messagePayloads);
    }

    /**
     * builds OrderEditPreviewSuccess without checking for non null required values
     */
    public OrderEditPreviewSuccess buildUnchecked() {
        return new OrderEditPreviewSuccessImpl(preview, messagePayloads);
    }

    public static OrderEditPreviewSuccessBuilder of() {
        return new OrderEditPreviewSuccessBuilder();
    }

    public static OrderEditPreviewSuccessBuilder of(final OrderEditPreviewSuccess template) {
        OrderEditPreviewSuccessBuilder builder = new OrderEditPreviewSuccessBuilder();
        builder.preview = template.getPreview();
        builder.messagePayloads = template.getMessagePayloads();
        return builder;
    }

}
