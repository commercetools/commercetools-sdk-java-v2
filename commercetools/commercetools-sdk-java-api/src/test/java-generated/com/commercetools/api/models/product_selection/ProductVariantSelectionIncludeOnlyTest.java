
package com.commercetools.api.models.product_selection;

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
public class ProductVariantSelectionIncludeOnlyTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantSelectionIncludeOnlyBuilder builder) {
        ProductVariantSelectionIncludeOnly productVariantSelectionIncludeOnly = builder.buildUnchecked();
        Assertions.assertThat(productVariantSelectionIncludeOnly)
                .isInstanceOf(ProductVariantSelectionIncludeOnly.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductVariantSelectionIncludeOnly.builder().skus(Collections.singletonList("skus")) } };
    }

    @Test
    public void skus() {
        ProductVariantSelectionIncludeOnly value = ProductVariantSelectionIncludeOnly.of();
        value.setSkus(Collections.singletonList("skus"));
        Assertions.assertThat(value.getSkus()).isEqualTo(Collections.singletonList("skus"));
    }
}
