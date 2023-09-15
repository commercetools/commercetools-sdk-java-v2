
package com.commercetools.api.models.order;

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
public class OrderSearchFilterExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchFilterExpressionBuilder builder) {
        OrderSearchFilterExpression orderSearchFilterExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchFilterExpression).isInstanceOf(OrderSearchFilterExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchFilterExpression.builder()
                .filter(Collections
                        .singletonList(new com.commercetools.api.models.order.OrderSearchQueryExpressionImpl())) } };
    }

    @Test
    public void filter() {
        OrderSearchFilterExpression value = OrderSearchFilterExpression.of();
        value.setFilter(
            Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryExpressionImpl()));
        Assertions.assertThat(value.getFilter())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryExpressionImpl()));
    }
}
