
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditPreviewSuccessBuilder {

    private com.commercetools.api.models.order_edit.StagedOrder preview;

    private java.util.List<com.commercetools.api.models.message.MessagePayload> messagePayloads;

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
