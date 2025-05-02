
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetCountValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetCountValueBuilder builder) {
        ProductSearchFacetCountValue productSearchFacetCountValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetCountValue).isInstanceOf(ProductSearchFacetCountValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ProductSearchFacetCountValue.builder().name("name") },
                new Object[] { "scope",
                        ProductSearchFacetCountValue.builder()
                                .scope(com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum
                                        .findEnum("all")) },
                new Object[] { "filter",
                        ProductSearchFacetCountValue.builder()
                                .filter(new com.commercetools.api.models.search.SearchQueryImpl()) },
                new Object[] { "level",
                        ProductSearchFacetCountValue.builder()
                                .level(com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum
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
        value.setScope(com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum.findEnum("all"));
        Assertions.assertThat(value.getScope())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum.findEnum("all"));
    }

    @Test
    public void filter() {
        ProductSearchFacetCountValue value = ProductSearchFacetCountValue.of();
        value.setFilter(new com.commercetools.api.models.search.SearchQueryImpl());
        Assertions.assertThat(value.getFilter()).isEqualTo(new com.commercetools.api.models.search.SearchQueryImpl());
    }

    @Test
    public void level() {
        ProductSearchFacetCountValue value = ProductSearchFacetCountValue.of();
        value.setLevel(
            com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum.findEnum("products"));
        Assertions.assertThat(value.getLevel())
                .isEqualTo(
                    com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum.findEnum("products"));
    }
}
