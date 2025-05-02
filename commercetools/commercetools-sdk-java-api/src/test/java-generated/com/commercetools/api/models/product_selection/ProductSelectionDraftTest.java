
package com.commercetools.api.models.product_selection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSelectionDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSelectionDraftBuilder builder) {
        ProductSelectionDraft productSelectionDraft = builder.buildUnchecked();
        Assertions.assertThat(productSelectionDraft).isInstanceOf(ProductSelectionDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductSelectionDraft.builder().key("key") },
                new Object[] { "name",
                        ProductSelectionDraft.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "custom",
                        ProductSelectionDraft.builder()
                                .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { "mode",
                        ProductSelectionDraft.builder()
                                .mode(com.commercetools.api.models.product_selection.ProductSelectionMode
                                        .findEnum("Individual")) } };
    }

    @Test
    public void key() {
        ProductSelectionDraft value = ProductSelectionDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ProductSelectionDraft value = ProductSelectionDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void custom() {
        ProductSelectionDraft value = ProductSelectionDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void mode() {
        ProductSelectionDraft value = ProductSelectionDraft.of();
        value.setMode(com.commercetools.api.models.product_selection.ProductSelectionMode.findEnum("Individual"));
        Assertions.assertThat(value.getMode())
                .isEqualTo(com.commercetools.api.models.product_selection.ProductSelectionMode.findEnum("Individual"));
    }
}
