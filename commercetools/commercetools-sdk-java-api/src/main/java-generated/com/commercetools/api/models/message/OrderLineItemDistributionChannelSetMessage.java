
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Line Item Distribution Channel update action.</p>
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

    String ORDER_LINE_ITEM_DISTRIBUTION_CHANNEL_SET = "OrderLineItemDistributionChannelSet";

    /**
     *  <p>Unique identifier of the Line Item.</p>
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Distribution Channel that was set.</p>
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelReference getDistributionChannel();

    public void setLineItemId(final String lineItemId);

    public void setDistributionChannel(final ChannelReference distributionChannel);

    public static OrderLineItemDistributionChannelSetMessage of() {
        return new OrderLineItemDistributionChannelSetMessageImpl();
    }

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
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static OrderLineItemDistributionChannelSetMessageBuilder builder() {
        return OrderLineItemDistributionChannelSetMessageBuilder.of();
    }

    public static OrderLineItemDistributionChannelSetMessageBuilder builder(
            final OrderLineItemDistributionChannelSetMessage template) {
        return OrderLineItemDistributionChannelSetMessageBuilder.of(template);
    }

    default <T> T withOrderLineItemDistributionChannelSetMessage(
            Function<OrderLineItemDistributionChannelSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDistributionChannelSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemDistributionChannelSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemDistributionChannelSetMessage>";
            }
        };
    }
}
