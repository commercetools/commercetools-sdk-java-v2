
package com.commercetools.api.models.product;

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
public class ProductCatalogDataTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductCatalogDataBuilder builder) {
        ProductCatalogData productCatalogData = builder.buildUnchecked();
        Assertions.assertThat(productCatalogData).isInstanceOf(ProductCatalogData.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductCatalogData.builder().published(true) },
                new Object[] { ProductCatalogData.builder()
                        .current(new com.commercetools.api.models.product.ProductDataImpl()) },
                new Object[] { ProductCatalogData.builder()
                        .staged(new com.commercetools.api.models.product.ProductDataImpl()) },
                new Object[] { ProductCatalogData.builder().hasStagedChanges(true) } };
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
