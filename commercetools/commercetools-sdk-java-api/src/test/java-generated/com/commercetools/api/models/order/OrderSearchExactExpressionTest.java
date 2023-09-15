
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
public class OrderSearchExactExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchExactExpressionBuilder builder) {
        OrderSearchExactExpression orderSearchExactExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchExactExpression).isInstanceOf(OrderSearchExactExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchExactExpression.builder()
                .exact(new com.commercetools.api.models.order.OrderSearchAnyValueImpl()) } };
    }

    @Test
    public void exact() {
        OrderSearchExactExpression value = OrderSearchExactExpression.of();
        value.setExact(new com.commercetools.api.models.order.OrderSearchAnyValueImpl());
        Assertions.assertThat(value.getExact())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchAnyValueImpl());
    }
}
