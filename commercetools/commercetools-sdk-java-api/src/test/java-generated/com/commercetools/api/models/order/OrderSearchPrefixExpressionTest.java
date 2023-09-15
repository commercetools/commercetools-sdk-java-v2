
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
public class OrderSearchPrefixExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchPrefixExpressionBuilder builder) {
        OrderSearchPrefixExpression orderSearchPrefixExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchPrefixExpression).isInstanceOf(OrderSearchPrefixExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchPrefixExpression.builder()
                .prefix(new com.commercetools.api.models.order.OrderSearchStringValueImpl()) } };
    }

    @Test
    public void prefix() {
        OrderSearchPrefixExpression value = OrderSearchPrefixExpression.of();
        value.setPrefix(new com.commercetools.api.models.order.OrderSearchStringValueImpl());
        Assertions.assertThat(value.getPrefix())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchStringValueImpl());
    }
}
