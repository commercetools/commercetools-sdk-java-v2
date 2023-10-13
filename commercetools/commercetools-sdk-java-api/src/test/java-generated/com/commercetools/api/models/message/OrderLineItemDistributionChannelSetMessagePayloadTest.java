
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
public class OrderLineItemDistributionChannelSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderLineItemDistributionChannelSetMessagePayloadBuilder builder) {
        OrderLineItemDistributionChannelSetMessagePayload orderLineItemDistributionChannelSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(orderLineItemDistributionChannelSetMessagePayload)
                .isInstanceOf(OrderLineItemDistributionChannelSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderLineItemDistributionChannelSetMessagePayload.builder().lineItemId("lineItemId") },
                new Object[] { OrderLineItemDistributionChannelSetMessagePayload.builder().lineItemKey("lineItemKey") },
                new Object[] { OrderLineItemDistributionChannelSetMessagePayload.builder()
                        .distributionChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void lineItemId() {
        OrderLineItemDistributionChannelSetMessagePayload value = OrderLineItemDistributionChannelSetMessagePayload
                .of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderLineItemDistributionChannelSetMessagePayload value = OrderLineItemDistributionChannelSetMessagePayload
                .of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void distributionChannel() {
        OrderLineItemDistributionChannelSetMessagePayload value = OrderLineItemDistributionChannelSetMessagePayload
                .of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
