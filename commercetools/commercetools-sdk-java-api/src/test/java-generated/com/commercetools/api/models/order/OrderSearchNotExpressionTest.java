
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
public class OrderSearchNotExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchNotExpressionBuilder builder) {
        OrderSearchNotExpression orderSearchNotExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchNotExpression).isInstanceOf(OrderSearchNotExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchNotExpression.builder()
                .not(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl())) } };
    }

    @Test
    public void not() {
        OrderSearchNotExpression value = OrderSearchNotExpression.of();
        value.setNot(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl()));
        Assertions.assertThat(value.getNot())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl()));
    }
}
