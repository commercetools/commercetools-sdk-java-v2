
package com.commercetools.api.models.product_selection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionSetCustomFieldActionBuilder builder) {
        ProductSelectionSetCustomFieldAction productSelectionSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(productSelectionSetCustomFieldAction)
                .isInstanceOf(ProductSelectionSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ProductSelectionSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", ProductSelectionSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        ProductSelectionSetCustomFieldAction value = ProductSelectionSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductSelectionSetCustomFieldAction value = ProductSelectionSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
