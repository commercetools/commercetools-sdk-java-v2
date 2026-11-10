
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ClassificationShippingRateInputDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ClassificationShippingRateInputDraftBuilder builder) {
        ClassificationShippingRateInputDraft classificationShippingRateInputDraft = builder.buildUnchecked();
        Assertions.assertThat(classificationShippingRateInputDraft)
                .isInstanceOf(ClassificationShippingRateInputDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ClassificationShippingRateInputDraft.builder().key("key") } };
    }

    @Test
    public void key() {
        ClassificationShippingRateInputDraft value = ClassificationShippingRateInputDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
