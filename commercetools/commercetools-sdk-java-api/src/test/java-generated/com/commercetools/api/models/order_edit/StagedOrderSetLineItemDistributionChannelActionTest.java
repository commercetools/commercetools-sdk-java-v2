
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetLineItemDistributionChannelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetLineItemDistributionChannelActionBuilder builder) {
        StagedOrderSetLineItemDistributionChannelAction stagedOrderSetLineItemDistributionChannelAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetLineItemDistributionChannelAction)
                .isInstanceOf(StagedOrderSetLineItemDistributionChannelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        StagedOrderSetLineItemDistributionChannelAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        StagedOrderSetLineItemDistributionChannelAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "distributionChannel",
                        StagedOrderSetLineItemDistributionChannelAction.builder()
                                .distributionChannel(
                                    new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) } };
    }

    @Test
    public void lineItemId() {
        StagedOrderSetLineItemDistributionChannelAction value = StagedOrderSetLineItemDistributionChannelAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderSetLineItemDistributionChannelAction value = StagedOrderSetLineItemDistributionChannelAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void distributionChannel() {
        StagedOrderSetLineItemDistributionChannelAction value = StagedOrderSetLineItemDistributionChannelAction.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }
}
