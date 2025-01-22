
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
public class ProductSearchResultTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchResultBuilder builder) {
        ProductSearchResult productSearchResult = builder.buildUnchecked();
        Assertions.assertThat(productSearchResult).isInstanceOf(ProductSearchResult.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchResult.builder().id("id") },
                new Object[] { ProductSearchResult.builder()
                        .matchingVariants(
                            new com.commercetools.api.models.product_search.ProductSearchMatchingVariantsImpl()) },
                new Object[] { ProductSearchResult.builder()
                        .productProjection(new com.commercetools.api.models.product.ProductProjectionImpl()) } };
    }

    @Test
    public void id() {
        ProductSearchResult value = ProductSearchResult.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void matchingVariants() {
        ProductSearchResult value = ProductSearchResult.of();
        value.setMatchingVariants(new com.commercetools.api.models.product_search.ProductSearchMatchingVariantsImpl());
        Assertions.assertThat(value.getMatchingVariants())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchMatchingVariantsImpl());
    }

    @Test
    public void productProjection() {
        ProductSearchResult value = ProductSearchResult.of();
        value.setProductProjection(new com.commercetools.api.models.product.ProductProjectionImpl());
        Assertions.assertThat(value.getProductProjection())
                .isEqualTo(new com.commercetools.api.models.product.ProductProjectionImpl());
    }
}
