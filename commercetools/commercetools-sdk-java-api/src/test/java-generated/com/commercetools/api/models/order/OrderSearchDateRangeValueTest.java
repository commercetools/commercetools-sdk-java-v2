
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;

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
public class OrderSearchDateRangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchDateRangeValueBuilder builder) {
        OrderSearchDateRangeValue orderSearchDateRangeValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchDateRangeValue).isInstanceOf(OrderSearchDateRangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderSearchDateRangeValue.builder().gte(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { OrderSearchDateRangeValue.builder().lte(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void gte() {
        OrderSearchDateRangeValue value = OrderSearchDateRangeValue.of();
        value.setGte(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getGte()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lte() {
        OrderSearchDateRangeValue value = OrderSearchDateRangeValue.of();
        value.setLte(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLte()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
