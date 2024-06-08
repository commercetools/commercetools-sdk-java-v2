
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set LineItem DistributionChannel update action.</p>
 *
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
@JsonDeserialize(as = OrderLineItemDistributionChannelSetMessagePayloadImpl.class)
public interface OrderLineItemDistributionChannelSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderLineItemDistributionChannelSetMessagePayload
     */
    String ORDER_LINE_ITEM_DISTRIBUTION_CHANNEL_SET = "OrderLineItemDistributionChannelSet";

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>Distribution Channel that was set.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelReference getDistributionChannel();

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <p>Distribution Channel that was set.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelReference distributionChannel);

    /**
     * factory method
     * @return instance of OrderLineItemDistributionChannelSetMessagePayload
     */
    public static OrderLineItemDistributionChannelSetMessagePayload of() {
        return new OrderLineItemDistributionChannelSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderLineItemDistributionChannelSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderLineItemDistributionChannelSetMessagePayload of(
            final OrderLineItemDistributionChannelSetMessagePayload template) {
        OrderLineItemDistributionChannelSetMessagePayloadImpl instance = new OrderLineItemDistributionChannelSetMessagePayloadImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderLineItemDistributionChannelSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderLineItemDistributionChannelSetMessagePayload deepCopy(
            @Nullable final OrderLineItemDistributionChannelSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderLineItemDistributionChannelSetMessagePayloadImpl instance = new OrderLineItemDistributionChannelSetMessagePayloadImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setDistributionChannel(
            com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getDistributionChannel()));
        return instance;
    }

    /**
     * builder factory method for OrderLineItemDistributionChannelSetMessagePayload
     * @return builder
     */
    public static OrderLineItemDistributionChannelSetMessagePayloadBuilder builder() {
        return OrderLineItemDistributionChannelSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderLineItemDistributionChannelSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLineItemDistributionChannelSetMessagePayloadBuilder builder(
            final OrderLineItemDistributionChannelSetMessagePayload template) {
        return OrderLineItemDistributionChannelSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderLineItemDistributionChannelSetMessagePayload(
            Function<OrderLineItemDistributionChannelSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDistributionChannelSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDistributionChannelSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemDistributionChannelSetMessagePayload>";
            }
        };
    }
}
