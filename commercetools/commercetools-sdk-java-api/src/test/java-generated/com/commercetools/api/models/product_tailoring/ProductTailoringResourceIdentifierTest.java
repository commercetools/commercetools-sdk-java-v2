
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringResourceIdentifierBuilder builder) {
        ProductTailoringResourceIdentifier productTailoringResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(productTailoringResourceIdentifier)
                .isInstanceOf(ProductTailoringResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductTailoringResourceIdentifier.builder().id("id") },
                new Object[] { "key", ProductTailoringResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ProductTailoringResourceIdentifier value = ProductTailoringResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ProductTailoringResourceIdentifier value = ProductTailoringResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
