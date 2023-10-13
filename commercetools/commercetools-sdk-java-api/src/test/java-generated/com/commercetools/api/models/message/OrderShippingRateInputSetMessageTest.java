
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
public class OrderShippingRateInputSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderShippingRateInputSetMessageBuilder builder) {
        OrderShippingRateInputSetMessage orderShippingRateInputSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderShippingRateInputSetMessage).isInstanceOf(OrderShippingRateInputSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderShippingRateInputSetMessage.builder()
                        .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl()) },
                new Object[] { OrderShippingRateInputSetMessage.builder()
                        .oldShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl()) } };
    }

    @Test
    public void shippingRateInput() {
        OrderShippingRateInputSetMessage value = OrderShippingRateInputSetMessage.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputImpl());
    }

    @Test
    public void oldShippingRateInput() {
        OrderShippingRateInputSetMessage value = OrderShippingRateInputSetMessage.of();
        value.setOldShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl());
        Assertions.assertThat(value.getOldShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputImpl());
    }
}
