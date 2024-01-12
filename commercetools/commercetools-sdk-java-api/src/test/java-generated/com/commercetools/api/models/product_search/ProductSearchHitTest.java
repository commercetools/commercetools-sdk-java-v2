
package com.commercetools.api.models.product_search;

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
public class ProductSearchHitTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchHitBuilder builder) {
        ProductSearchHit productSearchHit = builder.buildUnchecked();
        Assertions.assertThat(productSearchHit).isInstanceOf(ProductSearchHit.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchHit.builder().id("id") },
                new Object[] { ProductSearchHit.builder()
                        .productProjection(new com.commercetools.api.models.product.ProductProjectionImpl()) },
                new Object[] { ProductSearchHit.builder()
                        .matchingVariants(Collections.singletonList(
                            new com.commercetools.api.models.product_search.ProductSearchMatchingVariantImpl())) } };
    }

    @Test
    public void id() {
        ProductSearchHit value = ProductSearchHit.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void productProjection() {
        ProductSearchHit value = ProductSearchHit.of();
        value.setProductProjection(new com.commercetools.api.models.product.ProductProjectionImpl());
        Assertions.assertThat(value.getProductProjection())
                .isEqualTo(new com.commercetools.api.models.product.ProductProjectionImpl());
    }

    @Test
    public void matchingVariants() {
        ProductSearchHit value = ProductSearchHit.of();
        value.setMatchingVariants(Collections
                .singletonList(new com.commercetools.api.models.product_search.ProductSearchMatchingVariantImpl()));
        Assertions.assertThat(value.getMatchingVariants())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_search.ProductSearchMatchingVariantImpl()));
    }
}
