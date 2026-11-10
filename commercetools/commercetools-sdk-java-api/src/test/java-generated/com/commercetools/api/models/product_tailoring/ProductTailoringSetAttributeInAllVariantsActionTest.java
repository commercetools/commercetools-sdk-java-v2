
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetAttributeInAllVariantsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetAttributeInAllVariantsActionBuilder builder) {
        ProductTailoringSetAttributeInAllVariantsAction productTailoringSetAttributeInAllVariantsAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTailoringSetAttributeInAllVariantsAction)
                .isInstanceOf(ProductTailoringSetAttributeInAllVariantsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", ProductTailoringSetAttributeInAllVariantsAction.builder().name("name") },
                new Object[] { "value", ProductTailoringSetAttributeInAllVariantsAction.builder().value("value") },
                new Object[] { "staged", ProductTailoringSetAttributeInAllVariantsAction.builder().staged(true) } };
    }

    @Test
    public void name() {
        ProductTailoringSetAttributeInAllVariantsAction value = ProductTailoringSetAttributeInAllVariantsAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductTailoringSetAttributeInAllVariantsAction value = ProductTailoringSetAttributeInAllVariantsAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void staged() {
        ProductTailoringSetAttributeInAllVariantsAction value = ProductTailoringSetAttributeInAllVariantsAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
