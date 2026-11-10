
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetLineItemSupplyChannelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetLineItemSupplyChannelActionBuilder builder) {
        MyCartSetLineItemSupplyChannelAction myCartSetLineItemSupplyChannelAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetLineItemSupplyChannelAction)
                .isInstanceOf(MyCartSetLineItemSupplyChannelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", MyCartSetLineItemSupplyChannelAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        MyCartSetLineItemSupplyChannelAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "supplyChannel", MyCartSetLineItemSupplyChannelAction.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) } };
    }

    @Test
    public void lineItemId() {
        MyCartSetLineItemSupplyChannelAction value = MyCartSetLineItemSupplyChannelAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyCartSetLineItemSupplyChannelAction value = MyCartSetLineItemSupplyChannelAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void supplyChannel() {
        MyCartSetLineItemSupplyChannelAction value = MyCartSetLineItemSupplyChannelAction.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }
}
