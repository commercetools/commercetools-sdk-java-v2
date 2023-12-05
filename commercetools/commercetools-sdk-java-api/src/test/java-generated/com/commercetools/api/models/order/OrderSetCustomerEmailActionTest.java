
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
public class OrderSetCustomerEmailActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetCustomerEmailActionBuilder builder) {
        OrderSetCustomerEmailAction orderSetCustomerEmailAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetCustomerEmailAction).isInstanceOf(OrderSetCustomerEmailAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSetCustomerEmailAction.builder().email("email") } };
    }

    @Test
    public void email() {
        OrderSetCustomerEmailAction value = OrderSetCustomerEmailAction.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }
}
