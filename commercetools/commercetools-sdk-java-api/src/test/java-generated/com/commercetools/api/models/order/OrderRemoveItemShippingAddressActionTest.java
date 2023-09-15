
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
public class OrderRemoveItemShippingAddressActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderRemoveItemShippingAddressActionBuilder builder) {
        OrderRemoveItemShippingAddressAction orderRemoveItemShippingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(orderRemoveItemShippingAddressAction)
                .isInstanceOf(OrderRemoveItemShippingAddressAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderRemoveItemShippingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressKey() {
        OrderRemoveItemShippingAddressAction value = OrderRemoveItemShippingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
