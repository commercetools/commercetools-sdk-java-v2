
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
public class CustomerCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerCreatedMessageBuilder builder) {
        CustomerCreatedMessage customerCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerCreatedMessage).isInstanceOf(CustomerCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                CustomerCreatedMessage.builder().customer(new com.commercetools.api.models.customer.CustomerImpl()) } };
    }

    @Test
    public void customer() {
        CustomerCreatedMessage value = CustomerCreatedMessage.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerImpl());
        Assertions.assertThat(value.getCustomer()).isEqualTo(new com.commercetools.api.models.customer.CustomerImpl());
    }
}
