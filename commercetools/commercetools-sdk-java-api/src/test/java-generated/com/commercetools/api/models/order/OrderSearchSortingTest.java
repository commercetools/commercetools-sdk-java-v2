
package com.commercetools.api.models.order;

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
public class OrderSearchSortingTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchSortingBuilder builder) {
        OrderSearchSorting orderSearchSorting = builder.buildUnchecked();
        Assertions.assertThat(orderSearchSorting).isInstanceOf(OrderSearchSorting.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchSorting.builder().field("field") },
                new Object[] { OrderSearchSorting.builder().language("language") },
                new Object[] { OrderSearchSorting.builder()
                        .order(com.commercetools.api.models.order.OrderSearchSortOrder.findEnum("asc")) },
                new Object[] { OrderSearchSorting.builder()
                        .mode(com.commercetools.api.models.order.OrderSearchSortMode.findEnum("min")) },
                new Object[] { OrderSearchSorting.builder()
                        .filter(new com.commercetools.api.models.order.OrderSearchQueryExpressionImpl()) } };
    }

    @Test
    public void field() {
        OrderSearchSorting value = OrderSearchSorting.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void language() {
        OrderSearchSorting value = OrderSearchSorting.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void order() {
        OrderSearchSorting value = OrderSearchSorting.of();
        value.setOrder(com.commercetools.api.models.order.OrderSearchSortOrder.findEnum("asc"));
        Assertions.assertThat(value.getOrder())
                .isEqualTo(com.commercetools.api.models.order.OrderSearchSortOrder.findEnum("asc"));
    }

    @Test
    public void mode() {
        OrderSearchSorting value = OrderSearchSorting.of();
        value.setMode(com.commercetools.api.models.order.OrderSearchSortMode.findEnum("min"));
        Assertions.assertThat(value.getMode())
                .isEqualTo(com.commercetools.api.models.order.OrderSearchSortMode.findEnum("min"));
    }

    @Test
    public void filter() {
        OrderSearchSorting value = OrderSearchSorting.of();
        value.setFilter(new com.commercetools.api.models.order.OrderSearchQueryExpressionImpl());
        Assertions.assertThat(value.getFilter())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchQueryExpressionImpl());
    }
}
