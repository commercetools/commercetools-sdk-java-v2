
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
public class ProductSearchSortingTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSearchSortingBuilder builder) {
        ProductSearchSorting productSearchSorting = builder.buildUnchecked();
        Assertions.assertThat(productSearchSorting).isInstanceOf(ProductSearchSorting.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSearchSorting.builder().field("field") },
                new Object[] { ProductSearchSorting.builder().language("language") },
                new Object[] { ProductSearchSorting.builder()
                        .order(com.commercetools.api.models.product_search.ProductSearchSortOrder.findEnum("asc")) },
                new Object[] { ProductSearchSorting.builder()
                        .mode(com.commercetools.api.models.product_search.ProductSearchSortMode.findEnum("min")) },
                new Object[] { ProductSearchSorting.builder()
                        .attributeType(com.commercetools.api.models.product_search.ProductSearchAttributeType
                                .findEnum("boolean")) },
                new Object[] { ProductSearchSorting.builder()
                        .filter(new com.commercetools.api.models.product_search.ProductSearchQueryExpressionImpl()) },
                new Object[] { ProductSearchSorting.builder().internal(true) } };
    }

    @Test
    public void field() {
        ProductSearchSorting value = ProductSearchSorting.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void language() {
        ProductSearchSorting value = ProductSearchSorting.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void order() {
        ProductSearchSorting value = ProductSearchSorting.of();
        value.setOrder(com.commercetools.api.models.product_search.ProductSearchSortOrder.findEnum("asc"));
        Assertions.assertThat(value.getOrder())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchSortOrder.findEnum("asc"));
    }

    @Test
    public void mode() {
        ProductSearchSorting value = ProductSearchSorting.of();
        value.setMode(com.commercetools.api.models.product_search.ProductSearchSortMode.findEnum("min"));
        Assertions.assertThat(value.getMode())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchSortMode.findEnum("min"));
    }

    @Test
    public void attributeType() {
        ProductSearchSorting value = ProductSearchSorting.of();
        value.setAttributeType(
            com.commercetools.api.models.product_search.ProductSearchAttributeType.findEnum("boolean"));
        Assertions.assertThat(value.getAttributeType())
                .isEqualTo(com.commercetools.api.models.product_search.ProductSearchAttributeType.findEnum("boolean"));
    }

    @Test
    public void filter() {
        ProductSearchSorting value = ProductSearchSorting.of();
        value.setFilter(new com.commercetools.api.models.product_search.ProductSearchQueryExpressionImpl());
        Assertions.assertThat(value.getFilter())
                .isEqualTo(new com.commercetools.api.models.product_search.ProductSearchQueryExpressionImpl());
    }

    @Test
    public void internal() {
        ProductSearchSorting value = ProductSearchSorting.of();
        value.setInternal(true);
        Assertions.assertThat(value.getInternal()).isEqualTo(true);
    }
}
