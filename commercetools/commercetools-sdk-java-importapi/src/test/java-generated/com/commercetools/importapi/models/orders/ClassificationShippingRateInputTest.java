
package com.commercetools.importapi.models.orders;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ClassificationShippingRateInputTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ClassificationShippingRateInputBuilder builder) {
        ClassificationShippingRateInput classificationShippingRateInput = builder.buildUnchecked();
        Assertions.assertThat(classificationShippingRateInput).isInstanceOf(ClassificationShippingRateInput.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ClassificationShippingRateInput.builder().key("key") },
                new Object[] { "label", ClassificationShippingRateInput.builder()
                        .label(new com.commercetools.importapi.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void key() {
        ClassificationShippingRateInput value = ClassificationShippingRateInput.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        ClassificationShippingRateInput value = ClassificationShippingRateInput.of();
        value.setLabel(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }
}
