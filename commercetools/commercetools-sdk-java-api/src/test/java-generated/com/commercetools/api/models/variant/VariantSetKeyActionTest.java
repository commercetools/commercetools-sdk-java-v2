
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSetKeyActionBuilder builder) {
        VariantSetKeyAction variantSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(variantSetKeyAction).isInstanceOf(VariantSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", VariantSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        VariantSetKeyAction value = VariantSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
