
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringAttributeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringAttributeBuilder builder) {
        ProductTailoringAttribute productTailoringAttribute = builder.buildUnchecked();
        Assertions.assertThat(productTailoringAttribute).isInstanceOf(ProductTailoringAttribute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ProductTailoringAttribute.builder().name("name") },
                new Object[] { "value", ProductTailoringAttribute.builder().value("value") } };
    }

    @Test
    public void name() {
        ProductTailoringAttribute value = ProductTailoringAttribute.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductTailoringAttribute value = ProductTailoringAttribute.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
