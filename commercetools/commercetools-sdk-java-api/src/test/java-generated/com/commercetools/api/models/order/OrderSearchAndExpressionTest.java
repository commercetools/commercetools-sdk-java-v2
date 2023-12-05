
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
public class OrderSearchAndExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchAndExpressionBuilder builder) {
        OrderSearchAndExpression orderSearchAndExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchAndExpression).isInstanceOf(OrderSearchAndExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchAndExpression.builder()
                .and(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl())) } };
    }

    @Test
    public void and() {
        OrderSearchAndExpression value = OrderSearchAndExpression.of();
        value.setAnd(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl()));
        Assertions.assertThat(value.getAnd())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.OrderSearchQueryImpl()));
    }
}
