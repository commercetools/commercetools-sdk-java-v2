
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
public class MyCartSetLineItemSupplyChannelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartSetLineItemSupplyChannelActionBuilder builder) {
        MyCartSetLineItemSupplyChannelAction myCartSetLineItemSupplyChannelAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetLineItemSupplyChannelAction)
                .isInstanceOf(MyCartSetLineItemSupplyChannelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { MyCartSetLineItemSupplyChannelAction.builder().lineItemId("lineItemId") },
                new Object[] { MyCartSetLineItemSupplyChannelAction.builder().lineItemKey("lineItemKey") },
                new Object[] { MyCartSetLineItemSupplyChannelAction.builder()
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
