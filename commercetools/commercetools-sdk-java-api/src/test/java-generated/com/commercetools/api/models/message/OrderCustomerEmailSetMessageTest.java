
package com.commercetools.api.models.message;

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
public class OrderCustomerEmailSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomerEmailSetMessageBuilder builder) {
        OrderCustomerEmailSetMessage orderCustomerEmailSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomerEmailSetMessage).isInstanceOf(OrderCustomerEmailSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderCustomerEmailSetMessage.builder().email("email") },
                new Object[] { OrderCustomerEmailSetMessage.builder().oldEmail("oldEmail") } };
    }

    @Test
    public void email() {
        OrderCustomerEmailSetMessage value = OrderCustomerEmailSetMessage.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void oldEmail() {
        OrderCustomerEmailSetMessage value = OrderCustomerEmailSetMessage.of();
        value.setOldEmail("oldEmail");
        Assertions.assertThat(value.getOldEmail()).isEqualTo("oldEmail");
    }
}
