
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
public class OrderSetItemShippingAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetItemShippingAddressCustomFieldActionBuilder builder) {
        OrderSetItemShippingAddressCustomFieldAction orderSetItemShippingAddressCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(orderSetItemShippingAddressCustomFieldAction)
                .isInstanceOf(OrderSetItemShippingAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderSetItemShippingAddressCustomFieldAction.builder().addressKey("addressKey") },
                new Object[] { OrderSetItemShippingAddressCustomFieldAction.builder().name("name") },
                new Object[] { OrderSetItemShippingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void addressKey() {
        OrderSetItemShippingAddressCustomFieldAction value = OrderSetItemShippingAddressCustomFieldAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void name() {
        OrderSetItemShippingAddressCustomFieldAction value = OrderSetItemShippingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetItemShippingAddressCustomFieldAction value = OrderSetItemShippingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
