
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderLineItemDistributionChannelSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderLineItemDistributionChannelSetMessagePayloadBuilder builder) {
        OrderLineItemDistributionChannelSetMessagePayload orderLineItemDistributionChannelSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(orderLineItemDistributionChannelSetMessagePayload)
                .isInstanceOf(OrderLineItemDistributionChannelSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        OrderLineItemDistributionChannelSetMessagePayload.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        OrderLineItemDistributionChannelSetMessagePayload.builder().lineItemKey("lineItemKey") },
                new Object[] { "distributionChannel", OrderLineItemDistributionChannelSetMessagePayload.builder()
                        .distributionChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void lineItemId() {
        OrderLineItemDistributionChannelSetMessagePayload value = OrderLineItemDistributionChannelSetMessagePayload
                .of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderLineItemDistributionChannelSetMessagePayload value = OrderLineItemDistributionChannelSetMessagePayload
                .of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void distributionChannel() {
        OrderLineItemDistributionChannelSetMessagePayload value = OrderLineItemDistributionChannelSetMessagePayload
                .of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
