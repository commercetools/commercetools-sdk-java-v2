
package com.commercetools.api.models.tax_category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxCategorySetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxCategorySetKeyActionBuilder builder) {
        TaxCategorySetKeyAction taxCategorySetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(taxCategorySetKeyAction).isInstanceOf(TaxCategorySetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", TaxCategorySetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        TaxCategorySetKeyAction value = TaxCategorySetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
