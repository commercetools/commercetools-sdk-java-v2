
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetProductAttributeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetProductAttributeActionBuilder builder) {
        ProductTailoringSetProductAttributeAction productTailoringSetProductAttributeAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetProductAttributeAction)
                .isInstanceOf(ProductTailoringSetProductAttributeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", ProductTailoringSetProductAttributeAction.builder().name("name") },
                new Object[] { "value", ProductTailoringSetProductAttributeAction.builder().value("value") },
                new Object[] { "staged", ProductTailoringSetProductAttributeAction.builder().staged(true) } };
    }

    @Test
    public void name() {
        ProductTailoringSetProductAttributeAction value = ProductTailoringSetProductAttributeAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductTailoringSetProductAttributeAction value = ProductTailoringSetProductAttributeAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void staged() {
        ProductTailoringSetProductAttributeAction value = ProductTailoringSetProductAttributeAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
