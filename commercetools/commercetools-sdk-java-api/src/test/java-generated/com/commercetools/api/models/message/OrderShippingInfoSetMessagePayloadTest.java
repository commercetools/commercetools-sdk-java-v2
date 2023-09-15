
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
public class OrderShippingInfoSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderShippingInfoSetMessagePayloadBuilder builder) {
        OrderShippingInfoSetMessagePayload orderShippingInfoSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderShippingInfoSetMessagePayload)
                .isInstanceOf(OrderShippingInfoSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderShippingInfoSetMessagePayload.builder()
                        .shippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl()) },
                new Object[] { OrderShippingInfoSetMessagePayload.builder()
                        .oldShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl()) } };
    }

    @Test
    public void shippingInfo() {
        OrderShippingInfoSetMessagePayload value = OrderShippingInfoSetMessagePayload.of();
        value.setShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl());
        Assertions.assertThat(value.getShippingInfo())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingInfoImpl());
    }

    @Test
    public void oldShippingInfo() {
        OrderShippingInfoSetMessagePayload value = OrderShippingInfoSetMessagePayload.of();
        value.setOldShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl());
        Assertions.assertThat(value.getOldShippingInfo())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingInfoImpl());
    }
}
