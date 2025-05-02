
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetAttributeInAllVariantsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetAttributeInAllVariantsActionBuilder builder) {
        ProductSetAttributeInAllVariantsAction productSetAttributeInAllVariantsAction = builder.buildUnchecked();
        Assertions.assertThat(productSetAttributeInAllVariantsAction)
                .isInstanceOf(ProductSetAttributeInAllVariantsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ProductSetAttributeInAllVariantsAction.builder().name("name") },
                new Object[] { "value", ProductSetAttributeInAllVariantsAction.builder().value("value") },
                new Object[] { "staged", ProductSetAttributeInAllVariantsAction.builder().staged(true) } };
    }

    @Test
    public void name() {
        ProductSetAttributeInAllVariantsAction value = ProductSetAttributeInAllVariantsAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductSetAttributeInAllVariantsAction value = ProductSetAttributeInAllVariantsAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void staged() {
        ProductSetAttributeInAllVariantsAction value = ProductSetAttributeInAllVariantsAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
