
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
public class OrderSearchFullTextExpressionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchFullTextExpressionBuilder builder) {
        OrderSearchFullTextExpression orderSearchFullTextExpression = builder.buildUnchecked();
        Assertions.assertThat(orderSearchFullTextExpression).isInstanceOf(OrderSearchFullTextExpression.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchFullTextExpression.builder()
                .fullText(new com.commercetools.api.models.order.OrderSearchFullTextValueImpl()) } };
    }

    @Test
    public void fullText() {
        OrderSearchFullTextExpression value = OrderSearchFullTextExpression.of();
        value.setFullText(new com.commercetools.api.models.order.OrderSearchFullTextValueImpl());
        Assertions.assertThat(value.getFullText())
                .isEqualTo(new com.commercetools.api.models.order.OrderSearchFullTextValueImpl());
    }
}
