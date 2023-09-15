
package com.commercetools.history.models.common;

import java.util.Collections;

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
public class ProductVariantSelectionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantSelectionBuilder builder) {
        ProductVariantSelection productVariantSelection = builder.buildUnchecked();
        Assertions.assertThat(productVariantSelection).isInstanceOf(ProductVariantSelection.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductVariantSelection.builder()
                        .type(com.commercetools.history.models.common.ProductVariantSelectionTypeEnum
                                .findEnum("inclusion")) },
                new Object[] { ProductVariantSelection.builder().skus(Collections.singletonList("skus")) } };
    }

    @Test
    public void type() {
        ProductVariantSelection value = ProductVariantSelection.of();
        value.setType(com.commercetools.history.models.common.ProductVariantSelectionTypeEnum.findEnum("inclusion"));
        Assertions.assertThat(value.getType())
                .isEqualTo(
                    com.commercetools.history.models.common.ProductVariantSelectionTypeEnum.findEnum("inclusion"));
    }

    @Test
    public void skus() {
        ProductVariantSelection value = ProductVariantSelection.of();
        value.setSkus(Collections.singletonList("skus"));
        Assertions.assertThat(value.getSkus()).isEqualTo(Collections.singletonList("skus"));
    }
}
