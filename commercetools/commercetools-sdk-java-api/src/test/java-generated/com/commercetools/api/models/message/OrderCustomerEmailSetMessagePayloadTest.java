
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
public class OrderCustomerEmailSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomerEmailSetMessagePayloadBuilder builder) {
        OrderCustomerEmailSetMessagePayload orderCustomerEmailSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomerEmailSetMessagePayload)
                .isInstanceOf(OrderCustomerEmailSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderCustomerEmailSetMessagePayload.builder().email("email") },
                new Object[] { OrderCustomerEmailSetMessagePayload.builder().oldEmail("oldEmail") } };
    }

    @Test
    public void email() {
        OrderCustomerEmailSetMessagePayload value = OrderCustomerEmailSetMessagePayload.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void oldEmail() {
        OrderCustomerEmailSetMessagePayload value = OrderCustomerEmailSetMessagePayload.of();
        value.setOldEmail("oldEmail");
        Assertions.assertThat(value.getOldEmail()).isEqualTo("oldEmail");
    }
}
