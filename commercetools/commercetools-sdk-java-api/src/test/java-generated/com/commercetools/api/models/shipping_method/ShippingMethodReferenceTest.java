
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodReferenceBuilder builder) {
        ShippingMethodReference shippingMethodReference = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodReference).isInstanceOf(ShippingMethodReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        ShippingMethodReference.builder()
                                .obj(new com.commercetools.api.models.shipping_method.ShippingMethodImpl()) },
                new Object[] { "id", ShippingMethodReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        ShippingMethodReference value = ShippingMethodReference.of();
        value.setObj(new com.commercetools.api.models.shipping_method.ShippingMethodImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingMethodImpl());
    }

    @Test
    public void id() {
        ShippingMethodReference value = ShippingMethodReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
