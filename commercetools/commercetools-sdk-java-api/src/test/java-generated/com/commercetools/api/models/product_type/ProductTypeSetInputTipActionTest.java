
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeSetInputTipActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeSetInputTipActionBuilder builder) {
        ProductTypeSetInputTipAction productTypeSetInputTipAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeSetInputTipAction).isInstanceOf(ProductTypeSetInputTipAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName", ProductTypeSetInputTipAction.builder().attributeName("attributeName") },
                new Object[] { "inputTip", ProductTypeSetInputTipAction.builder()
                        .inputTip(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void attributeName() {
        ProductTypeSetInputTipAction value = ProductTypeSetInputTipAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void inputTip() {
        ProductTypeSetInputTipAction value = ProductTypeSetInputTipAction.of();
        value.setInputTip(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getInputTip())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
