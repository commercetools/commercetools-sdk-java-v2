
package com.commercetools.api.models.tax_category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxCategoryChangeNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxCategoryChangeNameActionBuilder builder) {
        TaxCategoryChangeNameAction taxCategoryChangeNameAction = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryChangeNameAction).isInstanceOf(TaxCategoryChangeNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", TaxCategoryChangeNameAction.builder().name("name") } };
    }

    @Test
    public void name() {
        TaxCategoryChangeNameAction value = TaxCategoryChangeNameAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
