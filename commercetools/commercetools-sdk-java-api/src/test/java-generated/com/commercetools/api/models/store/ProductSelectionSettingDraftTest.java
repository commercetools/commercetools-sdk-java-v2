
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionSettingDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionSettingDraftBuilder builder) {
        ProductSelectionSettingDraft productSelectionSettingDraft = builder.buildUnchecked();
        Assertions.assertThat(productSelectionSettingDraft).isInstanceOf(ProductSelectionSettingDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "productSelection", ProductSelectionSettingDraft.builder()
                .productSelection(
                    new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl()) },
                new Object[] { "active", ProductSelectionSettingDraft.builder().active(true) } };
    }

    @Test
    public void productSelection() {
        ProductSelectionSettingDraft value = ProductSelectionSettingDraft.of();
        value.setProductSelection(
            new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
    }

    @Test
    public void active() {
        ProductSelectionSettingDraft value = ProductSelectionSettingDraft.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }
}
