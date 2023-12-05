
package com.commercetools.api.models.me;

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
public class MyCartSetLineItemDistributionChannelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartSetLineItemDistributionChannelActionBuilder builder) {
        MyCartSetLineItemDistributionChannelAction myCartSetLineItemDistributionChannelAction = builder
                .buildUnchecked();
        Assertions.assertThat(myCartSetLineItemDistributionChannelAction)
                .isInstanceOf(MyCartSetLineItemDistributionChannelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyCartSetLineItemDistributionChannelAction.builder().lineItemId("lineItemId") },
                new Object[] { MyCartSetLineItemDistributionChannelAction.builder().lineItemKey("lineItemKey") },
                new Object[] { MyCartSetLineItemDistributionChannelAction.builder()
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
