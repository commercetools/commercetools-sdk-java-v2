
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
public class OrderSearchNumberRangeExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchNumberRangeExpressionBuilder builder) {
        OrderSearchNumberRangeExpression orderSearchNumberRangeExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchNumberRangeExpression).isInstanceOf(OrderSearchNumberRangeExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchNumberRangeExpression.builder()
                .range(new com.commercetools.api.models.order.OrderSearchNumberRangeValueImpl()) } };
    }

    @Test
    public void range() {
        OrderSearchNumberRangeExpression value = OrderSearchNumberRangeExpression.of();
        value.setRange(new com.commercetools.api.models.order.OrderSearchNumberRangeValueImpl());
        Assertions.assertThat(value.getRange())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchNumberRangeValueImpl());
    }
}
