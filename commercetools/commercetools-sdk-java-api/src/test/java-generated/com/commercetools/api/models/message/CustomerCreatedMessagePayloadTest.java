
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
public class CustomerCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerCreatedMessagePayloadBuilder builder) {
        CustomerCreatedMessagePayload customerCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerCreatedMessagePayload).isInstanceOf(CustomerCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerCreatedMessagePayload.builder()
                .customer(new com.commercetools.api.models.customer.CustomerImpl()) } };
    }

    @Test
    public void customer() {
        CustomerCreatedMessagePayload value = CustomerCreatedMessagePayload.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerImpl());
        Assertions.assertThat(value.getCustomer()).isEqualTo(new com.commercetools.api.models.customer.CustomerImpl());
    }
}
