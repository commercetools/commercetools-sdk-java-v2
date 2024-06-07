
package com.commercetools.api.models.product_search;

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
public class ProductSearchMatchingVariantEntryTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchMatchingVariantEntryBuilder builder) {
        ProductSearchMatchingVariantEntry productSearchMatchingVariantEntry = builder.buildUnchecked();
        Assertions.assertThat(productSearchMatchingVariantEntry).isInstanceOf(ProductSearchMatchingVariantEntry.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchMatchingVariantEntry.builder().id(2) },
                new Object[] { ProductSearchMatchingVariantEntry.builder().sku("sku") } };
    }

    @Test
    public void id() {
        ProductSearchMatchingVariantEntry value = ProductSearchMatchingVariantEntry.of();
        value.setId(2);
        Assertions.assertThat(value.getId()).isEqualTo(2);
    }

    @Test
    public void sku() {
        ProductSearchMatchingVariantEntry value = ProductSearchMatchingVariantEntry.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }
}
