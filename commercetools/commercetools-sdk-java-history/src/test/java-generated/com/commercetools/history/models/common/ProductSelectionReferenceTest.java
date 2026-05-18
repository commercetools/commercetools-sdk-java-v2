
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionReferenceBuilder builder) {
        ProductSelectionReference productSelectionReference = builder.buildUnchecked();
        Assertions.assertThat(productSelectionReference).isInstanceOf(ProductSelectionReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductSelectionReference.builder().id("id") } };
    }

    @Test
    public void id() {
        ProductSelectionReference value = ProductSelectionReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
