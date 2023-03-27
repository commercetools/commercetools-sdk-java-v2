
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderLineItemDistributionChannelSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLineItemDistributionChannelSetMessagePayload orderLineItemDistributionChannelSetMessagePayload = OrderLineItemDistributionChannelSetMessagePayload.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderLineItemDistributionChannelSetMessagePayloadBuilder
        implements Builder<OrderLineItemDistributionChannelSetMessagePayload> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public OrderLineItemDistributionChannelSetMessagePayloadBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Distribution Channel that was set.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public OrderLineItemDistributionChannelSetMessagePayloadBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.distributionChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Distribution Channel that was set.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public OrderLineItemDistributionChannelSetMessagePayloadBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Distribution Channel that was set.</p>
     * @return distributionChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     * builds OrderLineItemDistributionChannelSetMessagePayload with checking for non-null required values
     * @return OrderLineItemDistributionChannelSetMessagePayload
     */
    public OrderLineItemDistributionChannelSetMessagePayload build() {
        Objects.requireNonNull(lineItemId,
            OrderLineItemDistributionChannelSetMessagePayload.class + ": lineItemId is missing");
        return new OrderLineItemDistributionChannelSetMessagePayloadImpl(lineItemId, distributionChannel);
    }

    /**
     * builds OrderLineItemDistributionChannelSetMessagePayload without checking for non-null required values
     * @return OrderLineItemDistributionChannelSetMessagePayload
     */
    public OrderLineItemDistributionChannelSetMessagePayload buildUnchecked() {
        return new OrderLineItemDistributionChannelSetMessagePayloadImpl(lineItemId, distributionChannel);
    }

    /**
     * factory method for an instance of OrderLineItemDistributionChannelSetMessagePayloadBuilder
     * @return builder
     */
    public static OrderLineItemDistributionChannelSetMessagePayloadBuilder of() {
        return new OrderLineItemDistributionChannelSetMessagePayloadBuilder();
    }

    /**
     * create builder for OrderLineItemDistributionChannelSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLineItemDistributionChannelSetMessagePayloadBuilder of(
            final OrderLineItemDistributionChannelSetMessagePayload template) {
        OrderLineItemDistributionChannelSetMessagePayloadBuilder builder = new OrderLineItemDistributionChannelSetMessagePayloadBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
