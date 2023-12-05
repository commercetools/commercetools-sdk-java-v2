
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
public class CustomerAddressCustomFieldChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerAddressCustomFieldChangedMessagePayloadBuilder builder) {
        CustomerAddressCustomFieldChangedMessagePayload customerAddressCustomFieldChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerAddressCustomFieldChangedMessagePayload)
                .isInstanceOf(CustomerAddressCustomFieldChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerAddressCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { CustomerAddressCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] {
                        CustomerAddressCustomFieldChangedMessagePayload.builder().previousValue("previousValue") } };
    }

    @Test
    public void name() {
        CustomerAddressCustomFieldChangedMessagePayload value = CustomerAddressCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerAddressCustomFieldChangedMessagePayload value = CustomerAddressCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        CustomerAddressCustomFieldChangedMessagePayload value = CustomerAddressCustomFieldChangedMessagePayload.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }
}
