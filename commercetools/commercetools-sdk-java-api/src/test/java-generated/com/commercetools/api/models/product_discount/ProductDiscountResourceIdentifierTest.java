
package com.commercetools.api.models.product_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountResourceIdentifierBuilder builder) {
        ProductDiscountResourceIdentifier productDiscountResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(productDiscountResourceIdentifier).isInstanceOf(ProductDiscountResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductDiscountResourceIdentifier.builder().id("id") },
                new Object[] { "key", ProductDiscountResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ProductDiscountResourceIdentifier value = ProductDiscountResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ProductDiscountResourceIdentifier value = ProductDiscountResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
