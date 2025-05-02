
package com.commercetools.api.models.tax_category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxCategoryResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxCategoryResourceIdentifierBuilder builder) {
        TaxCategoryResourceIdentifier taxCategoryResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryResourceIdentifier).isInstanceOf(TaxCategoryResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", TaxCategoryResourceIdentifier.builder().id("id") },
                new Object[] { "key", TaxCategoryResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        TaxCategoryResourceIdentifier value = TaxCategoryResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        TaxCategoryResourceIdentifier value = TaxCategoryResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
