
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
public class ProductSearchFacetResultBucketTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetResultBucketBuilder builder) {
        ProductSearchFacetResultBucket productSearchFacetResultBucket = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetResultBucket).isInstanceOf(ProductSearchFacetResultBucket.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetResultBucket.builder().key("key") },
                new Object[] { ProductSearchFacetResultBucket.builder().count(2) } };
    }

    @Test
    public void key() {
        ProductSearchFacetResultBucket value = ProductSearchFacetResultBucket.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void count() {
        ProductSearchFacetResultBucket value = ProductSearchFacetResultBucket.of();
        value.setCount(2);
        Assertions.assertThat(value.getCount()).isEqualTo(2);
    }
}
