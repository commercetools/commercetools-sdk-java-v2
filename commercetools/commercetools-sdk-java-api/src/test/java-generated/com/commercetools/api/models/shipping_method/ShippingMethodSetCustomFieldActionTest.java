
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetCustomFieldActionBuilder builder) {
        ShippingMethodSetCustomFieldAction shippingMethodSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetCustomFieldAction)
                .isInstanceOf(ShippingMethodSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ShippingMethodSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", ShippingMethodSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        ShippingMethodSetCustomFieldAction value = ShippingMethodSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ShippingMethodSetCustomFieldAction value = ShippingMethodSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
