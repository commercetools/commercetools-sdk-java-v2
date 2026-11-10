
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomShippingMethodChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomShippingMethodChangeValueBuilder builder) {
        CustomShippingMethodChangeValue customShippingMethodChangeValue = builder.buildUnchecked();
        Assertions.assertThat(customShippingMethodChangeValue).isInstanceOf(CustomShippingMethodChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CustomShippingMethodChangeValue.builder().name("name") } };
    }

    @Test
    public void name() {
        CustomShippingMethodChangeValue value = CustomShippingMethodChangeValue.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
