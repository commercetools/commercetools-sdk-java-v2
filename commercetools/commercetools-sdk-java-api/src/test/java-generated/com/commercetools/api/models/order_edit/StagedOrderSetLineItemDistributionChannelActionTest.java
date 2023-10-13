
package com.commercetools.api.models.order_edit;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class StagedOrderSetLineItemDistributionChannelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetLineItemDistributionChannelActionBuilder builder) {
        StagedOrderSetLineItemDistributionChannelAction stagedOrderSetLineItemDistributionChannelAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetLineItemDistributionChannelAction)
                .isInstanceOf(StagedOrderSetLineItemDistributionChannelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetLineItemDistributionChannelAction.builder().lineItemId("lineItemId") },
                new Object[] { StagedOrderSetLineItemDistributionChannelAction.builder().lineItemKey("lineItemKey") },
                new Object[] { StagedOrderSetLineItemDistributionChannelAction.builder()
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
