
package com.commercetools.api.models.cart;

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
                        Shipping.builder().shippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl()) },
                new Object[] { "shippingAddress",
                        Shipping.builder().shippingAddress(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "shippingRateInput",
                        Shipping.builder()
                                .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl()) },
                new Object[] { "shippingCustomFields", Shipping.builder()
                        .shippingCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
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
        value.setShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl());
        Assertions.assertThat(value.getShippingInfo())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingInfoImpl());
    }

    @Test
    public void shippingAddress() {
        Shipping value = Shipping.of();
        value.setShippingAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getShippingAddress())
                .isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void shippingRateInput() {
        Shipping value = Shipping.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputImpl());
    }

    @Test
    public void shippingCustomFields() {
        Shipping value = Shipping.of();
        value.setShippingCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getShippingCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
