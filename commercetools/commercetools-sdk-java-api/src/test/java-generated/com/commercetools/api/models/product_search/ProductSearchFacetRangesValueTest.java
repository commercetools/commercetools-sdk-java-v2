
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
public class ProductSearchFacetRangesValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchFacetRangesValueBuilder builder) {
        ProductSearchFacetRangesValue productSearchFacetRangesValue = builder.buildUnchecked();
        Assertions.assertThat(productSearchFacetRangesValue).isInstanceOf(ProductSearchFacetRangesValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchFacetRangesValue.builder().name("name") },
                new Object[] {
                        ProductSearchFacetRangesValue.builder()
                                .scope(com.commercetools.api.models.product_search.ProductSearchFacetEnumScope
                                        .findEnum("all")) },
                new Object[] { ProductSearchFacetRangesValue.builder()
                        .filter(new com.commercetools.api.models.product_search.ProductSearchQueryImpl()) },
                new Object[] { ProductSearchFacetRangesValue.builder()
                        .count(com.commercetools.api.models.product_search.ProductSearchFacetEnumCount
                                .findEnum("products")) },
                new Object[] { ProductSearchFacetRangesValue.builder().field("field") },
                new Object[] { ProductSearchFacetRangesValue.builder()
                        .ranges(Collections.singletonList(
                            new com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeImpl())) },
                new Object[] { ProductSearchFacetRangesValue.builder().language("language") },
                new Object[] { ProductSearchFacetRangesValue.builder()
                        .attributeType(com.commercetools.api.models.product_search.ProductSearchAttributeType
                                .findEnum("boolean")) } };
    }

    @Test
    public void name() {
        ProductSearchFacetRangesValue value = ProductSearchFacetRangesValue.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void scope() {
        ProductSearchFacetRangesValue value = ProductSearchFacetRangesValue.of();
        value.setScope(com.commercetools.api.models.product_search.ProductSearchFacetEnumScope.findEnum("all"));
        Assertions.assertThat(value.getScope())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchFacetEnumScope.findEnum("all"));
    }

    @Test
    public void filter() {
        ProductSearchFacetRangesValue value = ProductSearchFacetRangesValue.of();
        value.setFilter(new com.commercetools.api.models.product_search.ProductSearchQueryImpl());
        Assertions.assertThat(value.getFilter())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchQueryImpl());
    }

    @Test
    public void count() {
        ProductSearchFacetRangesValue value = ProductSearchFacetRangesValue.of();
        value.setCount(com.commercetools.api.models.product_search.ProductSearchFacetEnumCount.findEnum("products"));
        Assertions.assertThat(value.getCount())
                .isEqualTo(
                    com.commercetools.api.models.product_search.ProductSearchFacetEnumCount.findEnum("products"));
    }

    @Test
    public void field() {
        ProductSearchFacetRangesValue value = ProductSearchFacetRangesValue.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void ranges() {
        ProductSearchFacetRangesValue value = ProductSearchFacetRangesValue.of();
        value.setRanges(Collections.singletonList(
            new com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeImpl()));
        Assertions.assertThat(value.getRanges())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeImpl()));
    }

    @Test
    public void language() {
        ProductSearchFacetRangesValue value = ProductSearchFacetRangesValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void attributeType() {
        ProductSearchFacetRangesValue value = ProductSearchFacetRangesValue.of();
        value.setAttributeType(
            com.commercetools.api.models.product_search.ProductSearchAttributeType.findEnum("boolean"));
        Assertions.assertThat(value.getAttributeType())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchAttributeType.findEnum("boolean"));
    }
}
