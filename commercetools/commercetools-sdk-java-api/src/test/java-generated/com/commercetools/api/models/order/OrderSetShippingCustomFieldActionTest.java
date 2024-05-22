
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
public class OrderSetShippingCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetShippingCustomFieldActionBuilder builder) {
        OrderSetShippingCustomFieldAction orderSetShippingCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetShippingCustomFieldAction).isInstanceOf(OrderSetShippingCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSetShippingCustomFieldAction.builder().shippingKey("shippingKey") },
                new Object[] { OrderSetShippingCustomFieldAction.builder().name("name") },
                new Object[] { OrderSetShippingCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void shippingKey() {
        OrderSetShippingCustomFieldAction value = OrderSetShippingCustomFieldAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void name() {
        OrderSetShippingCustomFieldAction value = OrderSetShippingCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetShippingCustomFieldAction value = OrderSetShippingCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
