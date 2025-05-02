
package com.commercetools.api.models.product_selection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionResourceIdentifierBuilder builder) {
        ProductSelectionResourceIdentifier productSelectionResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(productSelectionResourceIdentifier)
                .isInstanceOf(ProductSelectionResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductSelectionResourceIdentifier.builder().id("id") },
                new Object[] { "key", ProductSelectionResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ProductSelectionResourceIdentifier value = ProductSelectionResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ProductSelectionResourceIdentifier value = ProductSelectionResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
