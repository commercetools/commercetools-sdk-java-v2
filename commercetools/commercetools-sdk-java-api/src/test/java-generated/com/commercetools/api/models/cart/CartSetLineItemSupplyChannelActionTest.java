
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetLineItemSupplyChannelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetLineItemSupplyChannelActionBuilder builder) {
        CartSetLineItemSupplyChannelAction cartSetLineItemSupplyChannelAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemSupplyChannelAction)
                .isInstanceOf(CartSetLineItemSupplyChannelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", CartSetLineItemSupplyChannelAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", CartSetLineItemSupplyChannelAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "supplyChannel", CartSetLineItemSupplyChannelAction.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemSupplyChannelAction value = CartSetLineItemSupplyChannelAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemSupplyChannelAction value = CartSetLineItemSupplyChannelAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void supplyChannel() {
        CartSetLineItemSupplyChannelAction value = CartSetLineItemSupplyChannelAction.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }
}
