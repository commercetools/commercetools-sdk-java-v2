
package com.commercetools.api.models.product_search;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSearchFacetDistinctValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSearchFacetDistinctValueBuilder builder) {
        ProductSearchFacetDistinctValue productSearchFacetDistinctValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetDistinctValue).isInstanceOf(ProductSearchFacetDistinctValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ProductSearchFacetDistinctValue.builder().name("name") },
                new Object[] { "scope",
                        ProductSearchFacetDistinctValue.builder()
                                .scope(com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum
                                        .findEnum("all")) },
                new Object[] { "filter",
                        ProductSearchFacetDistinctValue.builder()
                                .filter(new com.commercetools.api.models.search.SearchQueryImpl()) },
                new Object[] { "level",
                        ProductSearchFacetDistinctValue.builder()
                                .level(com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum
                                        .findEnum("products")) },
                new Object[] { "field", ProductSearchFacetDistinctValue.builder().field("field") },
                new Object[] { "includes",
                        ProductSearchFacetDistinctValue.builder().includes(Collections.singletonList("includes")) },
                new Object[] { "sort", ProductSearchFacetDistinctValue.builder()
                        .sort(
                            new com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpressionImpl()) },
                new Object[] { "limit", ProductSearchFacetDistinctValue.builder().limit(7) },
                new Object[] { "language", ProductSearchFacetDistinctValue.builder().language("language") },
                new Object[] { "fieldType",
                        ProductSearchFacetDistinctValue.builder()
                                .fieldType(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean")) },
                new Object[] { "missing", ProductSearchFacetDistinctValue.builder().missing("missing") } };
    }

    @Test
    public void name() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void scope() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setScope(com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum.findEnum("all"));
        Assertions.assertThat(value.getScope())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum.findEnum("all"));
    }

    @Test
    public void filter() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setFilter(new com.commercetools.api.models.search.SearchQueryImpl());
        Assertions.assertThat(value.getFilter()).isEqualTo(new com.commercetools.api.models.search.SearchQueryImpl());
    }

    @Test
    public void level() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setLevel(
            com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum.findEnum("products"));
        Assertions.assertThat(value.getLevel())
                .isEqualTo(
                    com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum.findEnum("products"));
    }

    @Test
    public void field() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void includes() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setIncludes(Collections.singletonList("includes"));
        Assertions.assertThat(value.getIncludes()).isEqualTo(Collections.singletonList("includes"));
    }

    @Test
    public void sort() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setSort(
            new com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpressionImpl());
        Assertions.assertThat(value.getSort())
                .isEqualTo(
                    new com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpressionImpl());
    }

    @Test
    public void limit() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setLimit(7);
        Assertions.assertThat(value.getLimit()).isEqualTo(7);
    }

    @Test
    public void language() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void fieldType() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setFieldType(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean"));
        Assertions.assertThat(value.getFieldType())
                .isEqualTo(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean"));
    }

    @Test
    public void missing() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setMissing("missing");
        Assertions.assertThat(value.getMissing()).isEqualTo("missing");
    }
}
