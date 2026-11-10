
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetDescriptionActionBuilder builder) {
        ShippingMethodSetDescriptionAction shippingMethodSetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetDescriptionAction)
                .isInstanceOf(ShippingMethodSetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "description",
                ShippingMethodSetDescriptionAction.builder().description("description") } };
    }

    @Test
    public void description() {
        ShippingMethodSetDescriptionAction value = ShippingMethodSetDescriptionAction.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }
}
