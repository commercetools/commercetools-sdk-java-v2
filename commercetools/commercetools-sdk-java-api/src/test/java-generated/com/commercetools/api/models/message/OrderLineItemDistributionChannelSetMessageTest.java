
package com.commercetools.api.models.message;

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
public class OrderLineItemDistributionChannelSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderLineItemDistributionChannelSetMessageBuilder builder) {
        OrderLineItemDistributionChannelSetMessage orderLineItemDistributionChannelSetMessage = builder
                .buildUnchecked();
        Assertions.assertThat(orderLineItemDistributionChannelSetMessage)
                .isInstanceOf(OrderLineItemDistributionChannelSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderLineItemDistributionChannelSetMessage.builder().lineItemId("lineItemId") },
                new Object[] { OrderLineItemDistributionChannelSetMessage.builder().lineItemKey("lineItemKey") },
                new Object[] { OrderLineItemDistributionChannelSetMessage.builder()
                        .distributionChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void lineItemId() {
        OrderLineItemDistributionChannelSetMessage value = OrderLineItemDistributionChannelSetMessage.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderLineItemDistributionChannelSetMessage value = OrderLineItemDistributionChannelSetMessage.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void distributionChannel() {
        OrderLineItemDistributionChannelSetMessage value = OrderLineItemDistributionChannelSetMessage.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
