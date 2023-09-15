
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
public class CustomerAddressCustomFieldAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerAddressCustomFieldAddedMessagePayloadBuilder builder) {
        CustomerAddressCustomFieldAddedMessagePayload customerAddressCustomFieldAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerAddressCustomFieldAddedMessagePayload)
                .isInstanceOf(CustomerAddressCustomFieldAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerAddressCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { CustomerAddressCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void name() {
        CustomerAddressCustomFieldAddedMessagePayload value = CustomerAddressCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerAddressCustomFieldAddedMessagePayload value = CustomerAddressCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
