
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
public class OrderSearchWildCardExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchWildCardExpressionBuilder builder) {
        OrderSearchWildCardExpression orderSearchWildCardExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchWildCardExpression).isInstanceOf(OrderSearchWildCardExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchWildCardExpression.builder()
                .wildcard(new com.commercetools.api.models.order.OrderSearchStringValueImpl()) } };
    }

    @Test
    public void wildcard() {
        OrderSearchWildCardExpression value = OrderSearchWildCardExpression.of();
        value.setWildcard(new com.commercetools.api.models.order.OrderSearchStringValueImpl());
        Assertions.assertThat(value.getWildcard())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchStringValueImpl());
    }
}
