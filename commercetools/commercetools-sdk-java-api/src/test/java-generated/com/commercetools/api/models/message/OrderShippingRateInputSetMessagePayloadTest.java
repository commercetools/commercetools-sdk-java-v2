
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
public class OrderShippingRateInputSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderShippingRateInputSetMessagePayloadBuilder builder) {
        OrderShippingRateInputSetMessagePayload orderShippingRateInputSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderShippingRateInputSetMessagePayload)
                .isInstanceOf(OrderShippingRateInputSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderShippingRateInputSetMessagePayload.builder()
                        .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl()) },
                new Object[] { OrderShippingRateInputSetMessagePayload.builder()
                        .oldShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl()) } };
    }

    @Test
    public void shippingRateInput() {
        OrderShippingRateInputSetMessagePayload value = OrderShippingRateInputSetMessagePayload.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputImpl());
    }

    @Test
    public void oldShippingRateInput() {
        OrderShippingRateInputSetMessagePayload value = OrderShippingRateInputSetMessagePayload.of();
        value.setOldShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl());
        Assertions.assertThat(value.getOldShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputImpl());
    }
}
