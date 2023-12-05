
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
public class OrderSearchLongRangeExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchLongRangeExpressionBuilder builder) {
        OrderSearchLongRangeExpression orderSearchLongRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchLongRangeExpression).isInstanceOf(OrderSearchLongRangeExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchLongRangeExpression.builder()
                .range(new com.commercetools.api.models.order.OrderSearchLongRangeValueImpl()) } };
    }

    @Test
    public void range() {
        OrderSearchLongRangeExpression value = OrderSearchLongRangeExpression.of();
        value.setRange(new com.commercetools.api.models.order.OrderSearchLongRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchLongRangeValueImpl());
    }
}
