
package com.commercetools.api.models.product_search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetStatsValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetStatsValueBuilder builder) {
        ProductSearchFacetStatsValue productSearchFacetStatsValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetStatsValue).isInstanceOf(ProductSearchFacetStatsValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ProductSearchFacetStatsValue.builder().name("name") },
                new Object[] { "scope",
                        ProductSearchFacetStatsValue.builder()
                                .scope(com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum
                                        .findEnum("all")) },
                new Object[] { "filter",
                        ProductSearchFacetStatsValue.builder()
                                .filter(new com.commercetools.api.models.search.SearchQueryImpl()) },
                new Object[] { "field", ProductSearchFacetStatsValue.builder().field("field") },
                new Object[] { "fieldType", ProductSearchFacetStatsValue.builder()
                        .fieldType(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean")) } };
    }

    @Test
    public void name() {
        ProductSearchFacetStatsValue value = ProductSearchFacetStatsValue.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void scope() {
        ProductSearchFacetStatsValue value = ProductSearchFacetStatsValue.of();
        value.setScope(com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum.findEnum("all"));
        Assertions.assertThat(value.getScope())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum.findEnum("all"));
    }

    @Test
    public void filter() {
        ProductSearchFacetStatsValue value = ProductSearchFacetStatsValue.of();
        value.setFilter(new com.commercetools.api.models.search.SearchQueryImpl());
        Assertions.assertThat(value.getFilter()).isEqualTo(new com.commercetools.api.models.search.SearchQueryImpl());
    }

    @Test
    public void field() {
        ProductSearchFacetStatsValue value = ProductSearchFacetStatsValue.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void fieldType() {
        ProductSearchFacetStatsValue value = ProductSearchFacetStatsValue.of();
        value.setFieldType(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean"));
        Assertions.assertThat(value.getFieldType())
                .isEqualTo(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean"));
    }
}
