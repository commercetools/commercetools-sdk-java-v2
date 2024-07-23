
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
public class OrderSearchQueryExpressionValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchQueryExpressionValueBuilder builder) {
        OrderSearchQueryExpressionValue orderSearchQueryExpressionValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchQueryExpressionValue).isInstanceOf(OrderSearchQueryExpressionValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchQueryExpressionValue.builder().field("field") },
                new Object[] { OrderSearchQueryExpressionValue.builder().boost(7) },
                new Object[] { OrderSearchQueryExpressionValue.builder()
                        .customType(
                            com.commercetools.api.models.order.OrderSearchCustomType.findEnum("BooleanType")) } };
    }

    @Test
    public void field() {
        OrderSearchQueryExpressionValue value = OrderSearchQueryExpressionValue.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void boost() {
        OrderSearchQueryExpressionValue value = OrderSearchQueryExpressionValue.of();
        value.setBoost(7);
        Assertions.assertThat(value.getBoost()).isEqualTo(7);
    }

    @Test
    public void customType() {
        OrderSearchQueryExpressionValue value = OrderSearchQueryExpressionValue.of();
        value.setCustomType(com.commercetools.api.models.order.OrderSearchCustomType.findEnum("BooleanType"));
        Assertions.assertThat(value.getCustomType())
                .isEqualTo(com.commercetools.api.models.order.OrderSearchCustomType.findEnum("BooleanType"));
    }
}
