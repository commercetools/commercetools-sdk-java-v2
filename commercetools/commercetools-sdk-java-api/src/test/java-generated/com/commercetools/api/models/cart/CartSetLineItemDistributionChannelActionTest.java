
package com.commercetools.api.models.cart;

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
public class CartSetLineItemDistributionChannelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetLineItemDistributionChannelActionBuilder builder) {
        CartSetLineItemDistributionChannelAction cartSetLineItemDistributionChannelAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemDistributionChannelAction)
                .isInstanceOf(CartSetLineItemDistributionChannelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartSetLineItemDistributionChannelAction.builder().lineItemId("lineItemId") },
                new Object[] { CartSetLineItemDistributionChannelAction.builder().lineItemKey("lineItemKey") },
                new Object[] { CartSetLineItemDistributionChannelAction.builder()
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
