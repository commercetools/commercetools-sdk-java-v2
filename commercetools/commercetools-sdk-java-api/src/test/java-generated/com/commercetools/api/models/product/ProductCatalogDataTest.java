
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductCatalogDataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductCatalogDataBuilder builder) {
        ProductCatalogData productCatalogData = builder.buildUnchecked();
        Assertions.assertThat(productCatalogData).isInstanceOf(ProductCatalogData.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "published", ProductCatalogData.builder().published(true) },
                new Object[] { "current",
                        ProductCatalogData.builder()
                                .current(new com.commercetools.api.models.product.ProductDataImpl()) },
                new Object[] { "staged",
                        ProductCatalogData.builder()
                                .staged(new com.commercetools.api.models.product.ProductDataImpl()) },
                new Object[] { "hasStagedChanges", ProductCatalogData.builder().hasStagedChanges(true) } };
    }

    @Test
    public void published() {
        ProductCatalogData value = ProductCatalogData.of();
        value.setPublished(true);
        Assertions.assertThat(value.getPublished()).isEqualTo(true);
    }

    @Test
    public void current() {
        ProductCatalogData value = ProductCatalogData.of();
        value.setCurrent(new com.commercetools.api.models.product.ProductDataImpl());
        Assertions.assertThat(value.getCurrent()).isEqualTo(new com.commercetools.api.models.product.ProductDataImpl());
    }

    @Test
    public void staged() {
        ProductCatalogData value = ProductCatalogData.of();
        value.setStaged(new com.commercetools.api.models.product.ProductDataImpl());
        Assertions.assertThat(value.getStaged()).isEqualTo(new com.commercetools.api.models.product.ProductDataImpl());
    }

    @Test
    public void hasStagedChanges() {
        ProductCatalogData value = ProductCatalogData.of();
        value.setHasStagedChanges(true);
        Assertions.assertThat(value.getHasStagedChanges()).isEqualTo(true);
    }
}
