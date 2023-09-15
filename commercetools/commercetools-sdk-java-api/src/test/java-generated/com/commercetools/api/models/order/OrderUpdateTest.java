
package com.commercetools.api.models.order;

import java.util.Collections;

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
public class OrderUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderUpdateBuilder builder) {
        OrderUpdate orderUpdate = builder.buildUnchecked();
        Assertions.assertThat(orderUpdate).isInstanceOf(OrderUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderUpdate.builder().version(2L) }, new Object[] { OrderUpdate.builder()
                .actions(Collections.singletonList(new com.commercetools.api.models.order.OrderUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        OrderUpdate value = OrderUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        OrderUpdate value = OrderUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.order.OrderUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.OrderUpdateActionImpl()));
    }
}
