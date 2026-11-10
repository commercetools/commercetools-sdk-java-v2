
package com.commercetools.api.models.product_selection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionSetKeyActionBuilder builder) {
        ProductSelectionSetKeyAction productSelectionSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productSelectionSetKeyAction).isInstanceOf(ProductSelectionSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductSelectionSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ProductSelectionSetKeyAction value = ProductSelectionSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
