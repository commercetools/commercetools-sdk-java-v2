
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditPreviewSuccessBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditPreviewSuccess orderEditPreviewSuccess = OrderEditPreviewSuccess.builder()
 *             .preview(previewBuilder -> previewBuilder)
 *             .plusMessagePayloads(messagePayloadsBuilder -> messagePayloadsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditPreviewSuccessBuilder implements Builder<OrderEditPreviewSuccess> {

    private com.commercetools.api.models.order_edit.StagedOrder preview;

    private java.util.List<com.commercetools.api.models.message.MessagePayload> messagePayloads;

    /**
     * set the value to the preview using the builder function
     * @param builder function to build the preview value
     * @return Builder
     */

    public OrderEditPreviewSuccessBuilder preview(
            Function<com.commercetools.api.models.order_edit.StagedOrderBuilder, com.commercetools.api.models.order_edit.StagedOrderBuilder> builder) {
        this.preview = builder.apply(com.commercetools.api.models.order_edit.StagedOrderBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the preview
     * @param preview value to be set
     * @return Builder
     */

    public OrderEditPreviewSuccessBuilder preview(final com.commercetools.api.models.order_edit.StagedOrder preview) {
        this.preview = preview;
        return this;
    }

    /**
     * set values to the messagePayloads
     * @param messagePayloads value to be set
     * @return Builder
     */

    public OrderEditPreviewSuccessBuilder messagePayloads(
            final com.commercetools.api.models.message.MessagePayload... messagePayloads) {
        this.messagePayloads = new ArrayList<>(Arrays.asList(messagePayloads));
        return this;
    }

    /**
     * set value to the messagePayloads
     * @param messagePayloads value to be set
     * @return Builder
     */

    public OrderEditPreviewSuccessBuilder messagePayloads(
            final java.util.List<com.commercetools.api.models.message.MessagePayload> messagePayloads) {
        this.messagePayloads = messagePayloads;
        return this;
    }

    /**
     * add values to the messagePayloads
     * @param messagePayloads value to be set
     * @return Builder
     */

    public OrderEditPreviewSuccessBuilder plusMessagePayloads(
            final com.commercetools.api.models.message.MessagePayload... messagePayloads) {
        if (this.messagePayloads == null) {
            this.messagePayloads = new ArrayList<>();
        }
        this.messagePayloads.addAll(Arrays.asList(messagePayloads));
        return this;
    }

    /**
     * add a value to the messagePayloads using the builder function
     * @param builder function to build the messagePayloads value
     * @return Builder
     */

    public OrderEditPreviewSuccessBuilder plusMessagePayloads(
            Function<com.commercetools.api.models.message.MessagePayloadBuilder, Builder<? extends com.commercetools.api.models.message.MessagePayload>> builder) {
        if (this.messagePayloads == null) {
            this.messagePayloads = new ArrayList<>();
        }
        this.messagePayloads
                .add(builder.apply(com.commercetools.api.models.message.MessagePayloadBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the messagePayloads using the builder function
     * @param builder function to build the messagePayloads value
     * @return Builder
     */

    public OrderEditPreviewSuccessBuilder withMessagePayloads(
            Function<com.commercetools.api.models.message.MessagePayloadBuilder, Builder<? extends com.commercetools.api.models.message.MessagePayload>> builder) {
        this.messagePayloads = new ArrayList<>();
        this.messagePayloads
                .add(builder.apply(com.commercetools.api.models.message.MessagePayloadBuilder.of()).build());
        return this;
    }

    /**
     * value of preview}
     * @return preview
     */

    public com.commercetools.api.models.order_edit.StagedOrder getPreview() {
        return this.preview;
    }

    /**
     * value of messagePayloads}
     * @return messagePayloads
     */

    public java.util.List<com.commercetools.api.models.message.MessagePayload> getMessagePayloads() {
        return this.messagePayloads;
    }

    /**
     * builds OrderEditPreviewSuccess with checking for non-null required values
     * @return OrderEditPreviewSuccess
     */
    public OrderEditPreviewSuccess build() {
        Objects.requireNonNull(preview, OrderEditPreviewSuccess.class + ": preview is missing");
        Objects.requireNonNull(messagePayloads, OrderEditPreviewSuccess.class + ": messagePayloads is missing");
        return new OrderEditPreviewSuccessImpl(preview, messagePayloads);
    }

    /**
     * builds OrderEditPreviewSuccess without checking for non-null required values
     * @return OrderEditPreviewSuccess
     */
    public OrderEditPreviewSuccess buildUnchecked() {
        return new OrderEditPreviewSuccessImpl(preview, messagePayloads);
    }

    /**
     * factory method for an instance of OrderEditPreviewSuccessBuilder
     * @return builder
     */
    public static OrderEditPreviewSuccessBuilder of() {
        return new OrderEditPreviewSuccessBuilder();
    }

    /**
     * create builder for OrderEditPreviewSuccess instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditPreviewSuccessBuilder of(final OrderEditPreviewSuccess template) {
        OrderEditPreviewSuccessBuilder builder = new OrderEditPreviewSuccessBuilder();
        builder.preview = template.getPreview();
        builder.messagePayloads = template.getMessagePayloads();
        return builder;
    }

}
