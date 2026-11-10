
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeChangeInputHintActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeChangeInputHintActionBuilder builder) {
        ProductTypeChangeInputHintAction productTypeChangeInputHintAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeChangeInputHintAction).isInstanceOf(ProductTypeChangeInputHintAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName",
                        ProductTypeChangeInputHintAction.builder().attributeName("attributeName") },
                new Object[] { "newValue", ProductTypeChangeInputHintAction.builder()
                        .newValue(com.commercetools.api.models.product_type.TextInputHint.findEnum("SingleLine")) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeInputHintAction value = ProductTypeChangeInputHintAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void newValue() {
        ProductTypeChangeInputHintAction value = ProductTypeChangeInputHintAction.of();
        value.setNewValue(com.commercetools.api.models.product_type.TextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getNewValue())
                .isEqualTo(com.commercetools.api.models.product_type.TextInputHint.findEnum("SingleLine"));
    }
}
