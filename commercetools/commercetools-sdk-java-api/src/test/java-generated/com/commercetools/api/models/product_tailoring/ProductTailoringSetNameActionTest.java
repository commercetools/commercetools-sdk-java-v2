
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetNameActionBuilder builder) {
        ProductTailoringSetNameAction productTailoringSetNameAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetNameAction).isInstanceOf(ProductTailoringSetNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        ProductTailoringSetNameAction.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "staged", ProductTailoringSetNameAction.builder().staged(true) } };
    }

    @Test
    public void name() {
        ProductTailoringSetNameAction value = ProductTailoringSetNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductTailoringSetNameAction value = ProductTailoringSetNameAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
