
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxCategoryKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxCategoryKeyReferenceBuilder builder) {
        TaxCategoryKeyReference taxCategoryKeyReference = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryKeyReference).isInstanceOf(TaxCategoryKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", TaxCategoryKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        TaxCategoryKeyReference value = TaxCategoryKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
