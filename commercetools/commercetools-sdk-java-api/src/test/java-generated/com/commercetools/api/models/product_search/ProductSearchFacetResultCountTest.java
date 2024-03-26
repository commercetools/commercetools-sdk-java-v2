
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
public class ProductSearchFacetResultCountTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetResultCountBuilder builder) {
        ProductSearchFacetResultCount productSearchFacetResultCount = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetResultCount).isInstanceOf(ProductSearchFacetResultCount.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetResultCount.builder().value(6L) } };
    }

    @Test
    public void value() {
        ProductSearchFacetResultCount value = ProductSearchFacetResultCount.of();
        value.setValue(6L);
        Assertions.assertThat(value.getValue()).isEqualTo(6L);
    }
}
