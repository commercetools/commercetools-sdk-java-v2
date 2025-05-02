
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetLineItemDistributionChannelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetLineItemDistributionChannelActionBuilder builder) {
        MyCartSetLineItemDistributionChannelAction myCartSetLineItemDistributionChannelAction = builder
                .buildUnchecked();
        Assertions.assertThat(myCartSetLineItemDistributionChannelAction)
                .isInstanceOf(MyCartSetLineItemDistributionChannelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        MyCartSetLineItemDistributionChannelAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        MyCartSetLineItemDistributionChannelAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "distributionChannel",
                        MyCartSetLineItemDistributionChannelAction.builder()
                                .distributionChannel(
                                    new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) } };
    }

    @Test
    public void lineItemId() {
        MyCartSetLineItemDistributionChannelAction value = MyCartSetLineItemDistributionChannelAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyCartSetLineItemDistributionChannelAction value = MyCartSetLineItemDistributionChannelAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void distributionChannel() {
        MyCartSetLineItemDistributionChannelAction value = MyCartSetLineItemDistributionChannelAction.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }
}
