
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
public class OrderSetShippingAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetShippingAddressCustomFieldActionBuilder builder) {
        OrderSetShippingAddressCustomFieldAction orderSetShippingAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetShippingAddressCustomFieldAction)
                .isInstanceOf(OrderSetShippingAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSetShippingAddressCustomFieldAction.builder().name("name") },
                new Object[] { OrderSetShippingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        OrderSetShippingAddressCustomFieldAction value = OrderSetShippingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetShippingAddressCustomFieldAction value = OrderSetShippingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
