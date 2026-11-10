
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchIndexingConfigurationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchIndexingConfigurationBuilder builder) {
        SearchIndexingConfiguration searchIndexingConfiguration = builder.buildUnchecked();
        Assertions.assertThat(searchIndexingConfiguration).isInstanceOf(SearchIndexingConfiguration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "products", SearchIndexingConfiguration.builder()
                        .products(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl()) },
                new Object[] { "productsSearch",
                        SearchIndexingConfiguration.builder()
                                .productsSearch(
                                    new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl()) },
                new Object[] { "orders", SearchIndexingConfiguration.builder()
                        .orders(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl()) },
                new Object[] { "customers", SearchIndexingConfiguration.builder()
                        .customers(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl()) },
                new Object[] { "businessUnits", SearchIndexingConfiguration.builder()
                        .businessUnits(
                            new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl()) } };
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

    @Test
    public void customers() {
        SearchIndexingConfiguration value = SearchIndexingConfiguration.of();
        value.setCustomers(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl());
        Assertions.assertThat(value.getCustomers())
                .isEqualTo(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl());
    }

    @Test
    public void businessUnits() {
        SearchIndexingConfiguration value = SearchIndexingConfiguration.of();
        value.setBusinessUnits(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl());
        Assertions.assertThat(value.getBusinessUnits())
                .isEqualTo(new com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl());
    }
}
