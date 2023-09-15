
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
public class OrderSearchLongRangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchLongRangeValueBuilder builder) {
        OrderSearchLongRangeValue orderSearchLongRangeValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchLongRangeValue).isInstanceOf(OrderSearchLongRangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchLongRangeValue.builder().gte(8L) },
                new Object[] { OrderSearchLongRangeValue.builder().lte(1L) } };
    }

    @Test
    public void gte() {
        OrderSearchLongRangeValue value = OrderSearchLongRangeValue.of();
        value.setGte(8L);
        Assertions.assertThat(value.getGte()).isEqualTo(8L);
    }

    @Test
    public void lte() {
        OrderSearchLongRangeValue value = OrderSearchLongRangeValue.of();
        value.setLte(1L);
        Assertions.assertThat(value.getLte()).isEqualTo(1L);
    }
}
