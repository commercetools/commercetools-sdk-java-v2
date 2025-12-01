
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingBuilder builder) {
        Shipping shipping = builder.buildUnchecked();
        Assertions.assertThat(shipping).isInstanceOf(Shipping.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "shippingKey", Shipping.builder().shippingKey("shippingKey") },
                new Object[] { "shippingInfo",
                        Shipping.builder()
                                .shippingInfo(new com.commercetools.history.models.common.ShippingInfoImpl()) },
                new Object[] { "shippingAddress",
                        Shipping.builder().shippingAddress(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { "shippingRateInput", Shipping.builder()
                        .shippingRateInput(new com.commercetools.history.models.common.ShippingRateInputImpl()) },
                new Object[] { "shippingCustomFields", Shipping.builder()
                        .shippingCustomFields(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void shippingKey() {
        Shipping value = Shipping.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void shippingInfo() {
        Shipping value = Shipping.of();
        value.setShippingInfo(new com.commercetools.history.models.common.ShippingInfoImpl());
        Assertions.assertThat(value.getShippingInfo())
                .isEqualTo(new com.commercetools.history.models.common.ShippingInfoImpl());
    }

    @Test
    public void shippingAddress() {
        Shipping value = Shipping.of();
        value.setShippingAddress(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getShippingAddress())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void shippingRateInput() {
        Shipping value = Shipping.of();
        value.setShippingRateInput(new com.commercetools.history.models.common.ShippingRateInputImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.history.models.common.ShippingRateInputImpl());
    }

    @Test
    public void shippingCustomFields() {
        Shipping value = Shipping.of();
        value.setShippingCustomFields(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getShippingCustomFields())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
