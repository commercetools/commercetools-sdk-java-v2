
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
public class ProductSearchFacetResultBucketEntryTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetResultBucketEntryBuilder builder) {
        ProductSearchFacetResultBucketEntry productSearchFacetResultBucketEntry = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetResultBucketEntry)
                .isInstanceOf(ProductSearchFacetResultBucketEntry.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetResultBucketEntry.builder().key("key") },
                new Object[] { ProductSearchFacetResultBucketEntry.builder().count(2) } };
    }

    @Test
    public void key() {
        ProductSearchFacetResultBucketEntry value = ProductSearchFacetResultBucketEntry.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void count() {
        ProductSearchFacetResultBucketEntry value = ProductSearchFacetResultBucketEntry.of();
        value.setCount(2);
        Assertions.assertThat(value.getCount()).isEqualTo(2);
    }
}
