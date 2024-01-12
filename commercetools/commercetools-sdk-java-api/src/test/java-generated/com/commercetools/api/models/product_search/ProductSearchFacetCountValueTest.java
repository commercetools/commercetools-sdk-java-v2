
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
public class ProductSearchFacetCountValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetCountValueBuilder builder) {
        ProductSearchFacetCountValue productSearchFacetCountValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetCountValue).isInstanceOf(ProductSearchFacetCountValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetCountValue.builder().name("name") },
                new Object[] {
                        ProductSearchFacetCountValue.builder()
                                .scope(com.commercetools.api.models.product_search.ProductSearchFacetEnumScope
                                        .findEnum("all")) },
                new Object[] { ProductSearchFacetCountValue.builder()
                        .filter(new com.commercetools.api.models.product_search.ProductSearchQueryImpl()) },
                new Object[] { ProductSearchFacetCountValue.builder()
                        .level(com.commercetools.api.models.product_search.ProductSearchFacetEnumCount
                                .findEnum("products")) } };
    }

    @Test
    public void name() {
        ProductSearchFacetCountValue value = ProductSearchFacetCountValue.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void scope() {
        ProductSearchFacetCountValue value = ProductSearchFacetCountValue.of();
        value.setScope(com.commercetools.api.models.product_search.ProductSearchFacetEnumScope.findEnum("all"));
        Assertions.assertThat(value.getScope())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchFacetEnumScope.findEnum("all"));
    }

    @Test
    public void filter() {
        ProductSearchFacetCountValue value = ProductSearchFacetCountValue.of();
        value.setFilter(new com.commercetools.api.models.product_search.ProductSearchQueryImpl());
        Assertions.assertThat(value.getFilter())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchQueryImpl());
    }

    @Test
    public void level() {
        ProductSearchFacetCountValue value = ProductSearchFacetCountValue.of();
        value.setLevel(com.commercetools.api.models.product_search.ProductSearchFacetEnumCount.findEnum("products"));
        Assertions.assertThat(value.getLevel())
                .isEqualTo(
                    com.commercetools.api.models.product_search.ProductSearchFacetEnumCount.findEnum("products"));
    }
}
