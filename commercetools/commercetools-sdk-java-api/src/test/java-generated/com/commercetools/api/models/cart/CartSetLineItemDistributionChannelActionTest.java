
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetLineItemDistributionChannelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetLineItemDistributionChannelActionBuilder builder) {
        CartSetLineItemDistributionChannelAction cartSetLineItemDistributionChannelAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemDistributionChannelAction)
                .isInstanceOf(CartSetLineItemDistributionChannelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        CartSetLineItemDistributionChannelAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        CartSetLineItemDistributionChannelAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "distributionChannel",
                        CartSetLineItemDistributionChannelAction.builder()
                                .distributionChannel(
                                    new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemDistributionChannelAction value = CartSetLineItemDistributionChannelAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemDistributionChannelAction value = CartSetLineItemDistributionChannelAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void distributionChannel() {
        CartSetLineItemDistributionChannelAction value = CartSetLineItemDistributionChannelAction.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }
}
