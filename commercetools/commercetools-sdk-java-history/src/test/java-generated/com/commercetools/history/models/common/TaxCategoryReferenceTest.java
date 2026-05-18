
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxCategoryReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxCategoryReferenceBuilder builder) {
        TaxCategoryReference taxCategoryReference = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryReference).isInstanceOf(TaxCategoryReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", TaxCategoryReference.builder().id("id") } };
    }

    @Test
    public void id() {
        TaxCategoryReference value = TaxCategoryReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
