
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
public class OrderSetOrderNumberActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetOrderNumberActionBuilder builder) {
        OrderSetOrderNumberAction orderSetOrderNumberAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetOrderNumberAction).isInstanceOf(OrderSetOrderNumberAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSetOrderNumberAction.builder().orderNumber("orderNumber") } };
    }

    @Test
    public void orderNumber() {
        OrderSetOrderNumberAction value = OrderSetOrderNumberAction.of();
        value.setOrderNumber("orderNumber");
        Assertions.assertThat(value.getOrderNumber()).isEqualTo("orderNumber");
    }
}
