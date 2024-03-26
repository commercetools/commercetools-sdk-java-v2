
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
                                .scope(com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum
                                        .findEnum("all")) },
                new Object[] { ProductSearchFacetRangesValue.builder()
                        .filter(new com.commercetools.api.models.search.SearchQueryImpl()) },
                new Object[] { ProductSearchFacetRangesValue.builder()
                        .level(com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum
                                .findEnum("products")) },
                new Object[] { ProductSearchFacetRangesValue.builder().field("field") },
                new Object[] { ProductSearchFacetRangesValue.builder()
                        .ranges(Collections.singletonList(
                            new com.commercetools.api.models.product_search.ProductSearchFacetRangesFacetRangeImpl())) },
                new Object[] { ProductSearchFacetRangesValue.builder().language("language") },
                new Object[] { ProductSearchFacetRangesValue.builder()
                        .fieldType(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean")) } };
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
        value.setScope(com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum.findEnum("all"));
        Assertions.assertThat(value.getScope())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchFacetScopeEnum.findEnum("all"));
    }

    @Test
    public void filter() {
        ProductSearchFacetRangesValue value = ProductSearchFacetRangesValue.of();
        value.setFilter(new com.commercetools.api.models.search.SearchQueryImpl());
        Assertions.assertThat(value.getFilter()).isEqualTo(new com.commercetools.api.models.search.SearchQueryImpl());
    }

    @Test
    public void level() {
        ProductSearchFacetRangesValue value = ProductSearchFacetRangesValue.of();
        value.setLevel(
            com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum.findEnum("products"));
        Assertions.assertThat(value.getLevel())
                .isEqualTo(
                    com.commercetools.api.models.product_search.ProductSearchFacetCountLevelEnum.findEnum("products"));
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
    public void fieldType() {
        ProductSearchFacetRangesValue value = ProductSearchFacetRangesValue.of();
        value.setFieldType(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean"));
        Assertions.assertThat(value.getFieldType())
                .isEqualTo(com.commercetools.api.models.search.SearchFieldType.findEnum("boolean"));
    }
}
