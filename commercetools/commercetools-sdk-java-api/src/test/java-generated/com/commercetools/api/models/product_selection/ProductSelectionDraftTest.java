
package com.commercetools.api.models.product_selection;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ProductSelectionDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionDraftBuilder builder) {
        ProductSelectionDraft productSelectionDraft = builder.buildUnchecked();
        Assertions.assertThat(productSelectionDraft).isInstanceOf(ProductSelectionDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSelectionDraft.builder().key("key") },
                new Object[] { ProductSelectionDraft.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductSelectionDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { ProductSelectionDraft.builder()
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
