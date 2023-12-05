
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
public class OrderSearchNumberRangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSearchNumberRangeValueBuilder builder) {
        OrderSearchNumberRangeValue orderSearchNumberRangeValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchNumberRangeValue).isInstanceOf(OrderSearchNumberRangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSearchNumberRangeValue.builder().gte(0.8498576) },
                new Object[] { OrderSearchNumberRangeValue.builder().lte(0.26076245) } };
    }

    @Test
    public void gte() {
        OrderSearchNumberRangeValue value = OrderSearchNumberRangeValue.of();
        value.setGte(0.8498576);
        Assertions.assertThat(value.getGte()).isEqualTo(0.8498576);
    }

    @Test
    public void lte() {
        OrderSearchNumberRangeValue value = OrderSearchNumberRangeValue.of();
        value.setLte(0.26076245);
        Assertions.assertThat(value.getLte()).isEqualTo(0.26076245);
    }
}
