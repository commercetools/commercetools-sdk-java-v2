
package com.commercetools.api.models.variant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSetAttributeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSetAttributeActionBuilder builder) {
        VariantSetAttributeAction variantSetAttributeAction = builder.buildUnchecked();
        Assertions.assertThat(variantSetAttributeAction).isInstanceOf(VariantSetAttributeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", VariantSetAttributeAction.builder().name("name") },
                new Object[] { "value", VariantSetAttributeAction.builder().value("value") },
                new Object[] { "staged", VariantSetAttributeAction.builder().staged(true) } };
    }

    @Test
    public void name() {
        VariantSetAttributeAction value = VariantSetAttributeAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        VariantSetAttributeAction value = VariantSetAttributeAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void staged() {
        VariantSetAttributeAction value = VariantSetAttributeAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
