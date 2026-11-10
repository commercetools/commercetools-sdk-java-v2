
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetProductAttributeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetProductAttributeActionBuilder builder) {
        ProductSetProductAttributeAction productSetProductAttributeAction = builder.buildUnchecked();
        Assertions.assertThat(productSetProductAttributeAction).isInstanceOf(ProductSetProductAttributeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ProductSetProductAttributeAction.builder().name("name") },
                new Object[] { "value", ProductSetProductAttributeAction.builder().value("value") },
                new Object[] { "staged", ProductSetProductAttributeAction.builder().staged(true) } };
    }

    @Test
    public void name() {
        ProductSetProductAttributeAction value = ProductSetProductAttributeAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductSetProductAttributeAction value = ProductSetProductAttributeAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void staged() {
        ProductSetProductAttributeAction value = ProductSetProductAttributeAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
