
package com.commercetools.api.models.project;

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
public class SearchIndexingConfigurationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchIndexingConfigurationBuilder builder) {
        SearchIndexingConfiguration searchIndexingConfiguration = builder.buildUnchecked();
        Assertions.assertThat(searchIndexingConfiguration).isInstanceOf(SearchIndexingConfiguration.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { SearchIndexingConfiguration.builder()
                        .products(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl()) },
                new Object[] { SearchIndexingConfiguration.builder()
                        .productsSearch(
                            new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl()) },
                new Object[] { SearchIndexingConfiguration.builder()
                        .orders(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl()) } };
    }

    @Test
    public void products() {
        SearchIndexingConfiguration value = SearchIndexingConfiguration.of();
        value.setProducts(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl());
        Assertions.assertThat(value.getProducts())
                .isEqualTo(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl());
    }

    @Test
    public void productsSearch() {
        SearchIndexingConfiguration value = SearchIndexingConfiguration.of();
        value.setProductsSearch(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl());
        Assertions.assertThat(value.getProductsSearch())
                .isEqualTo(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl());
    }

    @Test
    public void orders() {
        SearchIndexingConfiguration value = SearchIndexingConfiguration.of();
        value.setOrders(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl());
        Assertions.assertThat(value.getOrders())
                .isEqualTo(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl());
    }
}
