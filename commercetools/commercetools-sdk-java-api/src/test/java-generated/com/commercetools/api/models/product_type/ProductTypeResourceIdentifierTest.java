
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeResourceIdentifierBuilder builder) {
        ProductTypeResourceIdentifier productTypeResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(productTypeResourceIdentifier).isInstanceOf(ProductTypeResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductTypeResourceIdentifier.builder().id("id") },
                new Object[] { "key", ProductTypeResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ProductTypeResourceIdentifier value = ProductTypeResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ProductTypeResourceIdentifier value = ProductTypeResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
