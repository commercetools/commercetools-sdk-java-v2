
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
public class ProductSearchFacetDistinctValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetDistinctValueBuilder builder) {
        ProductSearchFacetDistinctValue productSearchFacetDistinctValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetDistinctValue).isInstanceOf(ProductSearchFacetDistinctValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetDistinctValue.builder().name("name") },
                new Object[] {
                        ProductSearchFacetDistinctValue.builder()
                                .scope(com.commercetools.api.models.product_search.ProductSearchFacetEnumScope
                                        .findEnum("all")) },
                new Object[] { ProductSearchFacetDistinctValue.builder()
                        .filter(new com.commercetools.api.models.product_search.ProductSearchQueryImpl()) },
                new Object[] { ProductSearchFacetDistinctValue.builder()
                        .count(com.commercetools.api.models.product_search.ProductSearchFacetEnumCount
                                .findEnum("products")) },
                new Object[] { ProductSearchFacetDistinctValue.builder().field("field") },
                new Object[] {
                        ProductSearchFacetDistinctValue.builder().includes(Collections.singletonList("includes")) },
                new Object[] { ProductSearchFacetDistinctValue.builder()
                        .startsWith(
                            new com.commercetools.api.models.product_search.ProductSearchFacetDistinctStartsWithImpl()) },
                new Object[] { ProductSearchFacetDistinctValue.builder()
                        .sort(
                            new com.commercetools.api.models.product_search.ProductSearchFacetDistinctBucketSortExpressionImpl()) },
                new Object[] { ProductSearchFacetDistinctValue.builder().size(9) },
                new Object[] { ProductSearchFacetDistinctValue.builder().language("language") },
                new Object[] { ProductSearchFacetDistinctValue.builder()
                        .attributeType(com.commercetools.api.models.product_search.ProductSearchAttributeType
                                .findEnum("boolean")) },
                new Object[] { ProductSearchFacetDistinctValue.builder().missing("missing") } };
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
        value.setScope(com.commercetools.api.models.product_search.ProductSearchFacetEnumScope.findEnum("all"));
        Assertions.assertThat(value.getScope())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchFacetEnumScope.findEnum("all"));
    }

    @Test
    public void filter() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setFilter(new com.commercetools.api.models.product_search.ProductSearchQueryImpl());
        Assertions.assertThat(value.getFilter())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchQueryImpl());
    }

    @Test
    public void count() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setCount(com.commercetools.api.models.product_search.ProductSearchFacetEnumCount.findEnum("products"));
        Assertions.assertThat(value.getCount())
                .isEqualTo(
                    com.commercetools.api.models.product_search.ProductSearchFacetEnumCount.findEnum("products"));
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
    public void startsWith() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setStartsWith(new com.commercetools.api.models.product_search.ProductSearchFacetDistinctStartsWithImpl());
        Assertions.assertThat(value.getStartsWith())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchFacetDistinctStartsWithImpl());
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
    public void size() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setSize(9);
        Assertions.assertThat(value.getSize()).isEqualTo(9);
    }

    @Test
    public void language() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void attributeType() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setAttributeType(
            com.commercetools.api.models.product_search.ProductSearchAttributeType.findEnum("boolean"));
        Assertions.assertThat(value.getAttributeType())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchAttributeType.findEnum("boolean"));
    }

    @Test
    public void missing() {
        ProductSearchFacetDistinctValue value = ProductSearchFacetDistinctValue.of();
        value.setMissing("missing");
        Assertions.assertThat(value.getMissing()).isEqualTo("missing");
    }
}
