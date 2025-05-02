
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionSettingTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionSettingBuilder builder) {
        ProductSelectionSetting productSelectionSetting = builder.buildUnchecked();
        Assertions.assertThat(productSelectionSetting).isInstanceOf(ProductSelectionSetting.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "productSelection",
                        ProductSelectionSetting.builder()
                                .productSelection(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "active", ProductSelectionSetting.builder().active(true) } };
    }

    @Test
    public void productSelection() {
        ProductSelectionSetting value = ProductSelectionSetting.of();
        value.setProductSelection(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void active() {
        ProductSelectionSetting value = ProductSelectionSetting.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }
}
