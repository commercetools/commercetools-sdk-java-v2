
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderLineItemDistributionChannelSetMessageImpl.class)
public interface OrderLineItemDistributionChannelSetMessage extends OrderMessage {

    String ORDER_LINE_ITEM_DISTRIBUTION_CHANNEL_SET = "OrderLineItemDistributionChannelSet";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:Channel">Channel</a>.</p>
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
