
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
public class CartSetLineItemSupplyChannelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetLineItemSupplyChannelActionBuilder builder) {
        CartSetLineItemSupplyChannelAction cartSetLineItemSupplyChannelAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemSupplyChannelAction)
                .isInstanceOf(CartSetLineItemSupplyChannelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartSetLineItemSupplyChannelAction.builder().lineItemId("lineItemId") },
                new Object[] { CartSetLineItemSupplyChannelAction.builder().lineItemKey("lineItemKey") },
                new Object[] { CartSetLineItemSupplyChannelAction.builder()
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
