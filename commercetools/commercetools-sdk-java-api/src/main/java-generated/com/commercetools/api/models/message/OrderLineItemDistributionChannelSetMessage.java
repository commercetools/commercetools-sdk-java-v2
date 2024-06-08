
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
 *     OrderLineItemDistributionChannelSetMessage orderLineItemDistributionChannelSetMessage = OrderLineItemDistributionChannelSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderLineItemDistributionChannelSetMessageImpl.class)
public interface OrderLineItemDistributionChannelSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderLineItemDistributionChannelSetMessage
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
     * @return instance of OrderLineItemDistributionChannelSetMessage
     */
    public static OrderLineItemDistributionChannelSetMessage of() {
        return new OrderLineItemDistributionChannelSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderLineItemDistributionChannelSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderLineItemDistributionChannelSetMessage of(
            final OrderLineItemDistributionChannelSetMessage template) {
        OrderLineItemDistributionChannelSetMessageImpl instance = new OrderLineItemDistributionChannelSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderLineItemDistributionChannelSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderLineItemDistributionChannelSetMessage deepCopy(
            @Nullable final OrderLineItemDistributionChannelSetMessage template) {
        if (template == null) {
            return null;
        }
        OrderLineItemDistributionChannelSetMessageImpl instance = new OrderLineItemDistributionChannelSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setDistributionChannel(
            com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getDistributionChannel()));
        return instance;
    }

    /**
     * builder factory method for OrderLineItemDistributionChannelSetMessage
     * @return builder
     */
    public static OrderLineItemDistributionChannelSetMessageBuilder builder() {
        return OrderLineItemDistributionChannelSetMessageBuilder.of();
    }

    /**
     * create builder for OrderLineItemDistributionChannelSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLineItemDistributionChannelSetMessageBuilder builder(
            final OrderLineItemDistributionChannelSetMessage template) {
        return OrderLineItemDistributionChannelSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderLineItemDistributionChannelSetMessage(
            Function<OrderLineItemDistributionChannelSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDistributionChannelSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDistributionChannelSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemDistributionChannelSetMessage>";
            }
        };
    }
}
