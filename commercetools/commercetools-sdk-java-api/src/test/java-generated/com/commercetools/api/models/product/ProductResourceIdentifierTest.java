
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductResourceIdentifierBuilder builder) {
        ProductResourceIdentifier productResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(productResourceIdentifier).isInstanceOf(ProductResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductResourceIdentifier.builder().id("id") },
                new Object[] { "key", ProductResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ProductResourceIdentifier value = ProductResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ProductResourceIdentifier value = ProductResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
