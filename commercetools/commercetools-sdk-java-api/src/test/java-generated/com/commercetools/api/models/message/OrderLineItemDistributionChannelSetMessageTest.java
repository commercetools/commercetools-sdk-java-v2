
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderLineItemDistributionChannelSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderLineItemDistributionChannelSetMessageBuilder builder) {
        OrderLineItemDistributionChannelSetMessage orderLineItemDistributionChannelSetMessage = builder
                .buildUnchecked();
        Assertions.assertThat(orderLineItemDistributionChannelSetMessage)
                .isInstanceOf(OrderLineItemDistributionChannelSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        OrderLineItemDistributionChannelSetMessage.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        OrderLineItemDistributionChannelSetMessage.builder().lineItemKey("lineItemKey") },
                new Object[] { "distributionChannel", OrderLineItemDistributionChannelSetMessage.builder()
                        .distributionChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void lineItemId() {
        OrderLineItemDistributionChannelSetMessage value = OrderLineItemDistributionChannelSetMessage.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderLineItemDistributionChannelSetMessage value = OrderLineItemDistributionChannelSetMessage.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void distributionChannel() {
        OrderLineItemDistributionChannelSetMessage value = OrderLineItemDistributionChannelSetMessage.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
