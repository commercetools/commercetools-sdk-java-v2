
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
@JsonDeserialize(as = OrderLineItemDistributionChannelSetMessagePayloadImpl.class)
public interface OrderLineItemDistributionChannelSetMessagePayload extends MessagePayload {

    String ORDER_LINE_ITEM_DISTRIBUTION_CHANNEL_SET = "OrderLineItemDistributionChannelSet";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @Valid
    @JsonProperty("distributionChannel")
    public ChannelReference getDistributionChannel();

    public void setLineItemId(final String lineItemId);

    public void setDistributionChannel(final ChannelReference distributionChannel);

    public static OrderLineItemDistributionChannelSetMessagePayload of() {
        return new OrderLineItemDistributionChannelSetMessagePayloadImpl();
    }

    public static OrderLineItemDistributionChannelSetMessagePayload of(
            final OrderLineItemDistributionChannelSetMessagePayload template) {
        OrderLineItemDistributionChannelSetMessagePayloadImpl instance = new OrderLineItemDistributionChannelSetMessagePayloadImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static OrderLineItemDistributionChannelSetMessagePayloadBuilder builder() {
        return OrderLineItemDistributionChannelSetMessagePayloadBuilder.of();
    }

    public static OrderLineItemDistributionChannelSetMessagePayloadBuilder builder(
            final OrderLineItemDistributionChannelSetMessagePayload template) {
        return OrderLineItemDistributionChannelSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderLineItemDistributionChannelSetMessagePayload(
            Function<OrderLineItemDistributionChannelSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
