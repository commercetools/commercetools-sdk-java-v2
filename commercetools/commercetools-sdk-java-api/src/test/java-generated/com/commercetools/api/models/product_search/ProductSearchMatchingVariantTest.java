
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
public class ProductSearchMatchingVariantTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchMatchingVariantBuilder builder) {
        ProductSearchMatchingVariant productSearchMatchingVariant = builder.buildUnchecked();
        Assertions.assertThat(productSearchMatchingVariant).isInstanceOf(ProductSearchMatchingVariant.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchMatchingVariant.builder().id(2) },
                new Object[] { ProductSearchMatchingVariant.builder().sku("sku") } };
    }

    @Test
    public void id() {
        ProductSearchMatchingVariant value = ProductSearchMatchingVariant.of();
        value.setId(2);
        Assertions.assertThat(value.getId()).isEqualTo(2);
    }

    @Test
    public void sku() {
        ProductSearchMatchingVariant value = ProductSearchMatchingVariant.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }
}
